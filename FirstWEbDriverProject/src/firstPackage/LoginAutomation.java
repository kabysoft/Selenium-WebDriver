package firstPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginAutomation {

public class selenium3 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriver driver;
	@Test
		public void login() throws InterruptedException {
			
	    System.setProperty("webdriver.chrome.driver", "F:\\Software Download\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		
		WebElement username=driver.findElement(By.id("//input[@id='user_email_login']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='user_password']"));
		WebElement login=driver.findElement(By.xpath("//input[@id='user_submit']"));
		username.sendKeys("boutemeursalah2018@gmail.com");
		password.sendKeys("123456");
		login.click();
		Thread.sleep(5000);
		String actualUrl="https://www.browserstack.com/user/choose-intent";
		System.out.println(driver.getCurrentUrl());
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		}
		}
	

}
