package Pages;

import org.openqa.selenium.WebElement;

import Browser.Browser;

public class BasePage {
	
	public static WebElement findElementByXPath (String xpath) {
		return Browser.getBrowser().findElementByXPath(xpath);		
	}
	
	public static WebElement findElementByID (String ID) {
		return Browser.getBrowser().findElementById(ID);		
	}


}
