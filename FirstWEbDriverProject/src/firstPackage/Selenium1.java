package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Download\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https:www.google.com");
		
		
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		// Opens LambdaTest homepage in the newly opened tab
//		driver.navigate().to("https://www.lambdatest.com/");
		
		
		
		//driver.get("https://www.google.com/");
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		// Opens LambdaTest homepage in the newly opened window
		driver.navigate().to("https://www.lambdatest.com/");
		
	}

}
