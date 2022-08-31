package Interaction;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllLinks {
	
	WebDriver driver;
	@Test
	public  void FindLinks() throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Software Download\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net");
		driver.manage().window().maximize();
	
		List<WebElement> links1 = driver.findElements(By.tagName("a"));
	      System.out.println("Number of Links in the Page is " + links1.size());
	      
	      
	      
	      for (int i = 1; i<=links1.size(); i = i+1) {
	         System.out.println("Name of Link# " + i + links1.get(i).getText());
	         Thread.sleep(2000);
	         
	         driver.close();
	      }
		
	}
	@Test
	
	public  void FindLinksOpen() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Download\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.calculator.net");
				driver.manage().window().maximize();
			
				List<WebElement> links= driver.findElements(By.tagName("a"));
			    for(int i = 0; i < links.size(); i++){

			        String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			        driver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			        Thread.sleep(5000);

			    }

			    //Opens all the tabs
			    Set<String> getTitleinWindow = driver.getWindowHandles(); 
			    Iterator<String> it = getTitleinWindow.iterator();

			    while(it.hasNext())
			    {

			          driver.switchTo().window(it.next());
			          System.out.println(driver.getTitle());
			    }
			      }
				
			}


