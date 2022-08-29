package Interaction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MultiSelect {

	
	WebDriver driver;
	@Test
	public  void MultiSelect() throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Software Download\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//td[@id='ContentHolder_lbFeatures_LBI0T1']")).click();
	      //driver.findElement(By.id("ContentHolder_lbSelectionMode_DDD_L_LBI1T0")).click();
	      Thread.sleep(5000);
	      
	      // Perform Multiple Select
	      Actions builder = new Actions(driver);
	      WebElement select = driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));
	      List<WebElement> options = select.findElements(By.tagName("td"));
	      
	      System.out.println(options.size());
	      Action multipleSelect = 
	         builder.keyDown(Keys.CONTROL).click(options.get(2)).click(options.get(4)).click(options.get(6)).build();
	      
	      multipleSelect.perform();
		
		
		
		
	}
}
