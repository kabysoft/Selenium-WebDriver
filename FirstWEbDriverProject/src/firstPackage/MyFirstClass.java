package firstPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class MyFirstClass {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Download\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https:www.google.com");
		
		//WebElement element = driver.findElement(By.cssSelector("lnXdpd"));
		
		//Javascript js = (Javascript)driver;
		
		//WebElement luckyBtn = driver.findElement(By.name("btnI"));
		//WebElement link = driver.findElement(By.linkText("store"));
		//link.click();
		
		
		driver.navigate().to("https://www.yahoo.fr/");
		//driver.get("https://www.yahoo.fr/");
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
		//File srcFile1 = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		//Files.copy(srcFile1, new File("./yahoo.png"));
		Thread.sleep(2000);
		driver.navigate().back();
		//driver.close();
		//driver.quit();
		
		//File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile, new File("./saptarshi.png"));
        //Files.copy(srcFile,  new File ("./image.png"));
		
		WebElement element1 = driver.findElement(By.cssSelector(".lnXdpd"));
		File srcFile3 = ((TakesScreenshot)element1).getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile, new File("./logo.png"));
	}
}

