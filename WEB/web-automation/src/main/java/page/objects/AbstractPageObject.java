package page.objects;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import br.com.test.config.ConfigurationManager;
import br.com.test.driver.DriverManager;

public class AbstractPageObject {

    protected AbstractPageObject() {
        Properties configuration = ConfigurationManager.getConfiguration();
        int timeout = Integer.parseInt(configuration.getProperty("timeout"));

        PageFactory.initElements(new AjaxElementLocatorFactory(DriverManager.getDriver(), timeout), this);
    }
}
