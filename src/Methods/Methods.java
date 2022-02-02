package Methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;

public class Methods {
	
	public static void getHeader(String name) {
		System.out.println("_________________________________________________________________________");
		System.out.println("\n" + name);
		System.out.println("_________________________________________________________________________\n");
	}
	
	public static String dateConvert(String date) {
		return date.substring(4,8) + "-" + date.substring(2,4) + "-" + date.substring(0,2);
	}
	
	public static String timeConvert(String time) {
		return time.substring(0,2) + ":" + time.substring(2,4);
	}
	
	public static int checkDataFromLocalStorage (String variable, String variableName) {
		
		JavascriptExecutor js = (JavascriptExecutor)Browser.getBrowser();
		
		int error = 0;
		
		String script = "return localStorage.getItem('"+ variableName +"')";
		
		String dataLS = (String) js.executeScript(script);
		
		if (variable.equals(dataLS)) {
			System.out.println(variableName + " -> pass");
		}
		else {
			System.out.println(variableName + " -> fail");
			error = 1;
		}
		
		return error;
	}
	
	public static void waitingElementIsClickable (WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public static void waitingElementIsVisible (WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 30);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static void pageScrollDown () {
		
		JavascriptExecutor scroll = (JavascriptExecutor)Browser.getBrowser();
		scroll.executeScript("window.scrollBy(0,590)");
		
	}

}
