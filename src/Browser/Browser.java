package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	private static ChromeDriver browser;
	
	public static ChromeDriver getBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chromedriver97.exe");
        if (browser == null) {
        	browser = new ChromeDriver();
        	}
        
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        return browser;
	}
}
