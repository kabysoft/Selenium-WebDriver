package firstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo_auto {

	WebDriver driver;
	@Test
	public  void firstN() throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Software Download\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement FirstName =driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		FirstName.sendKeys("SALAH");
		Thread.sleep(5000);
		String expectedTXT= "SALAH";
		String ActualTXT= FirstName.getAttribute("value") ;
		System.out.println("The Expected Text =  " + expectedTXT);
		System.out.println("The Founf Text =  " + ActualTXT);
		Thread.sleep(5000);
		Assert.assertEquals(expectedTXT,ActualTXT);
		
		
		
		 

	}

}
