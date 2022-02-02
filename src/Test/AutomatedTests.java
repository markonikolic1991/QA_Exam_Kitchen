package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import Browser.Browser;
import Methods.Methods;

public class AutomatedTests extends BaseTest {

	@Test
	public void Problem_1_Reserve() {
		
		Browser.getBrowser().get("http://10.15.1.204:3000/reserve");
		
		Methods.getHeader("Problem 1 Reserve");
		
		String name = "Marko";
		String email = "test@test.test";
		String phone = "061234567";
		String date = "24062022";
		String time = "0630AM";
		String person = "2";
		String parking = "on";
		
		kitchen.getReservePage().getName().sendKeys(name);
		kitchen.getReservePage().getEmail().sendKeys(email);
		kitchen.getReservePage().getPhone().sendKeys(phone);
		kitchen.getReservePage().getDate().sendKeys(date);
		kitchen.getReservePage().getTime().sendKeys(time);
		kitchen.getReservePage().getPerson().sendKeys(person);
		
		Methods.waitingElementIsClickable(kitchen.getReservePage().getParkingSwitch());
		kitchen.getReservePage().getParkingSwitch().click();
		
		Methods.waitingElementIsClickable(kitchen.getReservePage().getMakeReservation());
		kitchen.getReservePage().getMakeReservation().click();
		
		int error = 0;
		
		error = Methods.checkDataFromLocalStorage(name, "name");
		error = Methods.checkDataFromLocalStorage(phone, "phone");
		error = Methods.checkDataFromLocalStorage(Methods.dateConvert(date), "date");
		error = Methods.checkDataFromLocalStorage(email, "email");
		error = Methods.checkDataFromLocalStorage(Methods.timeConvert(time), "time");
		error = Methods.checkDataFromLocalStorage(person, "person");
		error = Methods.checkDataFromLocalStorage(parking, "parking");
		
	    assertEquals(0,error);
		
	}
	
	@Test
	public void Problem_2_Menu() {
		
		Browser.getBrowser().get("http://10.15.1.204:3000/menu");
		Actions act = new Actions(Browser.getBrowser());
		
		Methods.pageScrollDown();
		
		Methods.getHeader("Problem 2 Menu");
		
		int totalPrice = 0;
		
		Methods.waitingElementIsClickable(kitchen.getMenuPage().getFoodStuffedVealWithPomigrante());
		kitchen.getMenuPage().getFoodStuffedVealWithPomigrante().click();
		totalPrice += Integer.parseInt(kitchen.getMenuPage().getPriceStuffedVealWithPomigrante().getText().substring(1));

		Methods.waitingElementIsClickable(kitchen.getMenuPage().getFoodChickenWithParsley());
		kitchen.getMenuPage().getFoodChickenWithParsley().click();
		totalPrice += Integer.parseInt(kitchen.getMenuPage().getPriceChickenWithParsley().getText().substring(1));

		Methods.waitingElementIsClickable(kitchen.getMenuPage().getFoodSkeweredPorkWithChives());
		kitchen.getMenuPage().getFoodSkeweredPorkWithChives().click();
		totalPrice += Integer.parseInt(kitchen.getMenuPage().getPriceSkeweredPorkWithChives().getText().substring(1));

		Methods.waitingElementIsClickable(kitchen.getMenuPage().getDessertPancakesWithStrawberryCream());
		kitchen.getMenuPage().getDessertPancakesWithStrawberryCream().click();
		totalPrice += Integer.parseInt(kitchen.getMenuPage().getPricePancakesWithStrawberryCream().getText().substring(1));

		Methods.waitingElementIsClickable(kitchen.getMenuPage().getDessertMalagaCornetto());
		kitchen.getMenuPage().getDessertMalagaCornetto().click();
		totalPrice += Integer.parseInt(kitchen.getMenuPage().getPriceMalagaCornetto().getText().substring(1));

		Methods.waitingElementIsClickable(kitchen.getMenuPage().getDessertStrawberrySudnae());
		act.doubleClick(kitchen.getMenuPage().getDessertStrawberrySudnae()).perform();
		totalPrice += 2*Integer.parseInt(kitchen.getMenuPage().getPriceStrawberrySudnae().getText().substring(1));

		int cartPrice = Integer.parseInt(kitchen.getMenuPage().getChartPrice().getText());
		
		if(cartPrice == totalPrice) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed:\nTotal price: " + totalPrice + ", Displayed price in cart: " + cartPrice);
		}
		
		assertEquals(totalPrice,cartPrice);
				
	}
	
	@Test
	public void Problem_3_Questionare() {
		
		Browser.getBrowser().get("http://10.15.1.204:3000/questionaire");
		Actions act = new Actions(Browser.getBrowser());
		JavascriptExecutor js = (JavascriptExecutor)Browser.getBrowser();
		
		Methods.getHeader("Problem 3 Questionare");
		
		Methods.waitingElementIsClickable(kitchen.getQuestionairePage().getAnswerWhyDidYouComeToOurRestoraunt_ForFood());
		kitchen.getQuestionairePage().getAnswerWhyDidYouComeToOurRestoraunt_ForFood().click();
		
		Browser.getBrowser().switchTo().frame(kitchen.getQuestionairePage().getFirstIframe());
		
		Methods.waitingElementIsClickable(kitchen.getQuestionairePage().getAnswerWhatDidYouTryAtOurRestoraunt_Sarma());
		kitchen.getQuestionairePage().getAnswerWhatDidYouTryAtOurRestoraunt_Sarma().click();
		Methods.waitingElementIsClickable(kitchen.getQuestionairePage().getAnswerWhatDidYouTryAtOurRestoraunt_Muckalica());
		kitchen.getQuestionairePage().getAnswerWhatDidYouTryAtOurRestoraunt_Muckalica().click();
		
		Browser.getBrowser().switchTo().parentFrame();
		
		Methods.waitingElementIsClickable(kitchen.getQuestionairePage().getDidYouLikeTheFood_FeedbackRequestForm());
		kitchen.getQuestionairePage().getDidYouLikeTheFood_FeedbackRequestForm().click();
		Methods.waitingElementIsClickable(kitchen.getQuestionairePage().getRating_Medicore());
		kitchen.getQuestionairePage().getRating_Medicore().click();
		kitchen.getQuestionairePage().getYourFeedbackField().sendKeys("Feedback test");
		
		Methods.waitingElementIsClickable(kitchen.getQuestionairePage().getSubmitFeedbackButton());
		kitchen.getQuestionairePage().getSubmitFeedbackButton().click();
		
		Browser.getBrowser().switchTo().frame(kitchen.getQuestionairePage().getThirdIframe());
	
		act.dragAndDropBy(kitchen.getQuestionairePage().getBadExcellentSlider(), 50, 0).build().perform();
		
		Browser.getBrowser().switchTo().parentFrame();
		
		Methods.waitingElementIsClickable(kitchen.getQuestionairePage().getRateOurStaff_10());
		kitchen.getQuestionairePage().getRateOurStaff_10().click();

		Browser.getBrowser().switchTo().frame(kitchen.getQuestionairePage().getSecondIframe());
		
		kitchen.getQuestionairePage().getYourFeedbackField_SecondIframe().sendKeys("All is good!");
		
		Browser.getBrowser().switchTo().parentFrame();
		
		Methods.waitingElementIsClickable(kitchen.getQuestionairePage().getSubmitQuestionaire());
		kitchen.getQuestionairePage().getSubmitQuestionaire().click();
		
		String cookiesData = (String) js.executeScript("return document.cookie");
		String enteredData = String.join(",", "food","m","Feedback test","Sarma","muckalica","All is good!","6","10");
		
		System.out.println(cookiesData + "  >>>  Cookies data");
		System.out.println(enteredData + "  >>>  Entered data");
		
		assertEquals(enteredData,cookiesData);
		
	}

}
