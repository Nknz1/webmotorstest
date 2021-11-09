package br.com.test.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private static WebDriver driver;
	
	public static WebDriver createInstance(String browser) {
		
		if (driver == null) {
			
			if(browser.equals("chrome")) {
				
				
		          WebDriverManager.chromedriver().setup();
				  driver = new ChromeDriver();
				  
			}
        }
		return driver;
		
	}

}
