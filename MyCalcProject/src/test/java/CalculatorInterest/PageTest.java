package CalculatorInterest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class PageTest extends Base {

	WebDriver driver;

	@BeforeMethod
	
	      public void setUpPro() {
		  driver = setProperty();
	     }

	@Test 
	public void t_case_01_txtBoxSp() throws InterruptedException, IOException {
		PageObject TxtBox = new PageObject(driver);
		;
		TxtBox.setStartingP("50000");
		TxtBox.setAnnualCont("5000");
		TxtBox.setMonthlyCont("120");
		Thread.sleep(3000);
		TxtBox.setContEnd();
		TxtBox.setInterestR("3");
		TxtBox.setCompound("monthly");
		TxtBox.setAfterYears("7");
		TxtBox.setTaxRAte("3");
		TxtBox.setInflationRAte("2");
		TxtBox.setBtnCalculate();
		
		// Take a Screenshot for page Test Result.
		Thread.sleep(3000);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		Files.copy(SrcFile, new File("D:/Screenshot/interesrtP.jpg"));
		
		}
	
	@AfterMethod
	
	public void TearDown() throws InterruptedException {
	Thread.sleep(5000);
    driver.close();
    driver.quit();
    }

}
