package Pages;

import org.openqa.selenium.WebElement;

public class QuestionairePage extends BasePage {
	
	public String getFirstIframe () {
		return "first";
	}
	
	public String getSecondIframe () {
		return "second";
	}
	
	public String getThirdIframe () {
		return "third";
	}
	
	public WebElement getAnswerWhyDidYouComeToOurRestoraunt_ForFood () {
		return findElementByXPath("//input[@id='radioExample1']");
	}
	
	public WebElement getAnswerWhatDidYouTryAtOurRestoraunt_Sarma () {
		return findElementByID("cb1");
	}
	
	public WebElement getAnswerWhatDidYouTryAtOurRestoraunt_Muckalica () {
		return findElementByID("cb4");
	}
	
	public WebElement getDidYouLikeTheFood_FeedbackRequestForm () {
		return findElementByXPath("//button[contains(text(),'Did you Like the Food?')]");
	}
	
	public WebElement getRating_Medicore () {
		return findElementByXPath("//input[@id='radio4Example3']");
	}
	
	public WebElement getYourFeedbackField () {
		return findElementByXPath("//textarea[@id='hwofTA']");
	}
	
	public WebElement getSubmitFeedbackButton () {
		return findElementByXPath("//body/section[2]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[3]/button[1]");
	}
	
	public WebElement getBadExcellentSlider () {
		return findElementByXPath("//input[@id='rng']");
	}
	
	public WebElement getRateOurStaff_10 () {
		return findElementByXPath("//button[contains(text(),'10')]");
	}
	
	public WebElement getYourFeedbackField_SecondIframe () {
		return findElementByXPath("//textarea[@id='frta']");
	}
	
	public WebElement getSubmitQuestionaire () {
		return findElementByXPath("//button[@id='submitQuestionaire']");
	}


}

