package Pages;

import org.openqa.selenium.WebElement;

public class ReservePage extends BasePage {
	
	public WebElement getName() {
		return findElementByXPath("//input[@id='name']");
	}
	
	public WebElement getEmail() {
		return findElementByXPath("//input[@id='email']");
	}
	
	public WebElement getPhone() {
		return findElementByXPath("//input[@id='phone']");
	}
	
	public WebElement getDate() {
		return findElementByXPath("//input[@id='date']");
	}
	
	public WebElement getTime() {
		return findElementByXPath("//input[@id='time']");
	}
	
	public WebElement getPerson() {
		return findElementByXPath("//select[@id='persons']");
	}
	
	public WebElement getParkingSwitch() {
		return findElementByXPath("//label[contains(text(),'Switch')]");
	}
	
	public WebElement getMakeReservation() {
		return findElementByXPath("//input[@id='submitForm']");
	}

}