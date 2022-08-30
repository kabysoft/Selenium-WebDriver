package Exception_Handling;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ExceptionHandling {
	
	WebDriver driver;
	@Test
	public  void firstN() throws InterruptedException, IOException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Software Download\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		try {	
			
	
		WebElement FirstName =driver.findElement(By.xpath("//input[@placeho0lder='First Name']"));
		
		
		FirstName.sendKeys("SALAH");
		Thread.sleep(5000);
		String expectedTXT= "SALAH";
		String ActualTXT= FirstName.getAttribute("value") ;
		System.out.println("The Expected Text =  " + expectedTXT);
		System.out.println("The Founf Text =  " + ActualTXT);
		Thread.sleep(5000);
		Assert.assertEquals(expectedTXT,ActualTXT);
		
		
		}catch (Exception e1) {System.out.println("Something went wrong. Element  is not found");
		
		// Take a screenshot which will be helpful for analysis.
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		Files.copy(SrcFile, new File("D:/Screenshot/Screen.png"));
//	      File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	      Files.copy(screenshot, new File("D:\\framework\\screenshots.jpg"));
	      throw(e1);
	    
	     
	    }
		
		  driver.close();
	}

}
