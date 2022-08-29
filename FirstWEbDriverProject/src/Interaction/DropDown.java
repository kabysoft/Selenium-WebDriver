package Interaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDown {

	WebDriver driver;
	
	@Test
	public  void DropDwn() throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Software Download\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		//Puts a Implicit wait, Will wait for 10 seconds before throwing exception
		WebElement skills = driver.findElement(By.id("Skills"));
		Select dropdown = new Select(skills);
	      dropdown.selectByVisibleText("Analytics");
	      
	      System.out.println("The Output of the IsSelected " +
	    		  skills.isSelected());
	    	      System.out.println("The Output of the IsEnabled " +
	    	      skills.isEnabled());
	    	      System.out.println("The Output of the IsDisplayed " +
	    	      skills.isDisplayed());
	    	      
	    	      
	    	    String expectedTXT= "Analytics";
	  			String ActualTXT= skills.getAttribute("value") ;
	  			System.out.println("The Expected Selection =  " + expectedTXT);
	  			System.out.println("The Found Selection =  " + ActualTXT);
	  			Thread.sleep(5000);
	  			Assert.assertEquals(expectedTXT,ActualTXT);
	      
	}
}
