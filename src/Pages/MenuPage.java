package Pages;

import org.openqa.selenium.WebElement;

public class MenuPage extends BasePage {
	
	public WebElement getFoodStuffedVealWithPomigrante () {
		return findElementByXPath("//body/section[2]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]");
	}
	
	public WebElement getPriceStuffedVealWithPomigrante () {
		return findElementByXPath("//span[contains(text(),'$17')]");
	}
	
	public WebElement getFoodChickenWithParsley () {
		return findElementByXPath("//body/section[2]/div[1]/div[2]/div[1]/div[3]/div[2]/button[1]");
	}
	
	public WebElement getPriceChickenWithParsley () {
		return findElementByXPath("//span[contains(text(),'$29')]");
	}
	
	public WebElement getFoodSkeweredPorkWithChives () {
		return findElementByXPath("//body/section[2]/div[1]/div[2]/div[1]/div[5]/div[2]/button[1]");
	}
	
	public WebElement getPriceSkeweredPorkWithChives () {
		return findElementByXPath("//body/section[2]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[2]/span[1]");
	}
	
	public WebElement getDessertStrawberrySudnae () {
		return findElementByXPath("//body/section[2]/div[1]/div[2]/div[2]/div[3]/div[2]/button[1]");
	}
	
	public WebElement getPriceStrawberrySudnae () {
		return findElementByXPath("//body/section[2]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[1]");
	}
	
	public WebElement getDessertPancakesWithStrawberryCream () {
		return findElementByXPath("//body/section[2]/div[1]/div[2]/div[2]/div[2]/div[2]/button[1]");
	}
	
	public WebElement getPricePancakesWithStrawberryCream () {
		return findElementByXPath("//span[contains(text(),'$5')]");
	}
	
	public WebElement getDessertMalagaCornetto () {
		return findElementByXPath("//body/section[2]/div[1]/div[2]/div[2]/div[5]/div[2]/button[1]");
	}
	
	public WebElement getPriceMalagaCornetto () {
		return findElementByXPath("//body/section[2]/div[1]/div[2]/div[2]/div[5]/div[2]/div[1]/div[2]/span[1]");
	}
	
	public WebElement getChartPrice () {
		return findElementByXPath("//span[@id='ukupno']");
	}

}
