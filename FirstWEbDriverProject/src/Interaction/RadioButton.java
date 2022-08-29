package Interaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RadioButton {

	
	WebDriver driver;
	@Test
	public  void RadioBtn() throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Software Download\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/mortgage-payoff-calculator.html");
		driver.manage().window().maximize();
		
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//label[@for='cpayoff1']//span[@class='rbmark']"));
		WebElement Radiobtn = driver.findElement(By.xpath("//label[@for='cpayoff1']//span[@class='rbmark']"));
		//Actions act = new Actions(driver);
		//act.moveToElement(Radiobtn).click().build().perform();
		
	      System.out.println("The Output of the IsSelected " +
	         driver.findElement(By.xpath("//label[@for='cpayoff1']//span[@class='rbmark']")).isSelected());
	      System.out.println("The Output of the IsEnabled " +
	         driver.findElement(By.xpath("//label[@for='cpayoff1']//span[@class='rbmark']")).isEnabled());
	      System.out.println("The Output of the IsDisplayed " +
	         driver.findElement(By.xpath("//label[@for='cpayoff1']//span[@class='rbmark']")).isDisplayed());
		
	}
}