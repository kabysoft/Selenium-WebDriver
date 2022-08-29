package Interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
WebDriver driver;
	
	@Test
	public  void DragDrop() throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Software Download\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://preview.keenthemes.com/metronic-v4/theme/admin_1/ui_tree.html");
		driver.manage().window().maximize();

		WebElement From = driver.findElement(By.xpath(".//*[@id='j3_7']/a"));
	      WebElement To = driver.findElement(By.xpath(".//*[@id='j3_1']/a"));
	      
	      Actions builder = new Actions(driver);
	      Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
	      
	      dragAndDrop.perform();
		
		
		
		
	}
}
