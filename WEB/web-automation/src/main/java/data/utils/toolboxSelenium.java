package data.utils;

import org.openqa.selenium.JavascriptExecutor;
import static br.com.test.driver.DriverManager.getDriver;
import org.openqa.selenium.WebElement;

import page.objects.AbstractPageObject;

public class toolboxSelenium extends AbstractPageObject{
	
    public static toolboxSelenium action(){
        return new toolboxSelenium();
    }
    
    public void fillText(WebElement element,String text) {
    	
    	if(element.isDisplayed() & element.isEnabled()) {
    		element.clear();
    		text.trim();
    		element.sendKeys(text);
    		
    	}
    }
    
    public void click(WebElement element) {
    	
    	//((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    	
    	if(element.isDisplayed() & element.isEnabled()){
    		element.click();
    		
    	}
    }

}
