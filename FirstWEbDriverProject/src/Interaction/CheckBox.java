package Interaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {
	
	
	WebDriver driver;
	@Test
	public  void CheckBx() throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Software Download\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("checkbox1"));
		WebElement checkBx = driver.findElement(By.id("checkbox1"));
		//checkBx.click();
		//Actions act = new Actions(driver);
		//act.moveToElement(Radiobtn).click().build().perform();
		
	      System.out.println("The Output of the IsSelected " +
	         driver.findElement(By.id("checkbox1")).isSelected());
	      System.out.println("The Output of the IsEnabled " +
	         driver.findElement(By.id("checkbox1")).isEnabled());
	      System.out.println("The Output of the IsDisplayed " +
	         driver.findElement(By.id("checkbox1")).isDisplayed());

	}

}
