package Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import Browser.Browser;
import Kitchen.Kitchen;

public class BaseTest {

protected static Kitchen kitchen;
	
	@BeforeClass
	public static void setup() {
		kitchen = new Kitchen();
	}
	
	@AfterClass
	public static void cleanup() {
		Browser.getBrowser().quit();
	}
	
}