package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	WebDriver driver1;
	public WebDriver setProperty() {
			
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Download\\\\Selenium\\\\chromedriver_win32 (1)/chromedriver.exe");
		
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.get("https://www.homedepot.com/auth/view/createaccount/diy?redirect=/&ref=null");
		return driver1;
}
}
