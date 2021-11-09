package br.com.test.steps;

import static br.com.test.driver.DriverManager.getDriver;
import static br.com.test.driver.DriverManager.setDriver;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import br.com.test.config.ConfigurationManager;
import br.com.test.driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {

	Properties configuration = ConfigurationManager.getConfiguration();

	@Before()
	public void beforeScenario(Scenario scenario) {

		// Create the driver instance, set the current driver instance and open the
		// specified URL in the selenium properties
		WebDriver driver = DriverFactory.createInstance(configuration.getProperty("browser"));
		setDriver(driver);

		getDriver().get(configuration.getProperty("url"));
		getDriver().manage().window().maximize();

	}

	@BeforeStep
	public void beforeStep(Scenario scenario) {
		if (configuration.getProperty("print.before.step") != null) {
			final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "");
		}
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		if (configuration.getProperty("print.after.step") != null) {
			final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "");
		}
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (configuration.getProperty("print.scenario.end") != null) {
			final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "");
		} else if (configuration.getProperty("print.failure") != null) {
			if (scenario.isFailed()) {
				final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "");
			}
		}
		getDriver().quit();
	}
}
