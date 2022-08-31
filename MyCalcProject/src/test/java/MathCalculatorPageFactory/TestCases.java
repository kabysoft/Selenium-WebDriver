package MathCalculatorPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases extends BAse{
	WebDriver driver;

    @BeforeMethod

    public void SetProperty() {
    driver = setProperty();

    }
    @Test
    public void t_case_01_LogoT() throws InterruptedException {
		PageObject Tlogo = new PageObject(driver);
		Tlogo.logoT();
		Assert.assertEquals(Tlogo.logoT(), true);
    }
    
    @Test
    public void t_case_02_titleT() throws InterruptedException {
    	PageObject title = new PageObject(driver);
		title.testTitle();
		System.out.println("Result expected for tiltle is  Math Calculators");
		System.out.println(" Actual Title is  " + title.driver.getTitle());
		Assert.assertEquals(title.testTitle(),"Math Calculators");
    }
    
    @Test
    public void t_case_02_setFunction() throws InterruptedException {
    	PageObject functioncalc = new PageObject(driver);
		functioncalc.SetFunctionTest();
		
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
    Thread.sleep(3000);	   
    driver.close();
    driver.quit();
    }

}
