package MathCalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCalculator  extends Base{

WebDriver driver;
	
	//@BeforeMethod
    @BeforeClass
	
	public void setupPro() {
		
		driver = setProperty();
		 
		}
	
	@Test
	
	public void tc_01_PageTitleTest() {
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals(title,"Math Calculators");
		}
	
	@Test
	public void tc_02_gyperLink_Home() throws InterruptedException {
	
	WebElement link =driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/span[1]/a/span"));
	link.click();
	Thread.sleep(2000);
	driver.navigate().back();
	}
	
	@Test
	public void tc_03_Random_Calc() throws InterruptedException {
		WebElement n0 =driver.findElement(By.xpath("//span[normalize-space()='0']"));   
		n0.click();
		WebElement n1 =driver.findElement(By.xpath("//span[normalize-space()='1']"));
		n1.click();
		WebElement n2 =driver.findElement(By.xpath("//span[normalize-space()='2']"));
		n2.click();
		WebElement n3 =driver.findElement(By.xpath("//span[normalize-space()='3']"));
		n3.click();
		WebElement n4 =driver.findElement(By.xpath("//span[normalize-space()='4']"));
		n4.click();
		WebElement n5 =driver.findElement(By.xpath("//span[normalize-space()='5']"));
		n5.click();
		WebElement n6 =driver.findElement(By.xpath("//span[normalize-space()='6']"));
		n6.click();
		WebElement n7 =driver.findElement(By.xpath("//span[normalize-space()='7']"));
		n7.click();
		WebElement n8 =driver.findElement(By.xpath("//span[normalize-space()='8']"));
		n8.click();
		WebElement n9 =driver.findElement(By.xpath("//span[normalize-space()='9']"));
		n9.click();
		
		WebElement OpM =driver.findElement(By.xpath("//span[normalize-space()='×']"));
		OpM.click();
		
		WebElement OpD =driver.findElement(By.xpath("//span[normalize-space()='÷']"));
		OpD.click();
		
		WebElement OpS =driver.findElement(By.xpath("//span[contains(text(),'–')]"));
		OpS.click();
		WebElement OpP =driver.findElement(By.xpath("//span[normalize-space()='+']"));
		OpP.click();
		
		Thread.sleep(2000);
		
		WebElement ClearBtn =driver.findElement(By.xpath("//span[normalize-space()='AC']"));
		ClearBtn.click();
		
		WebElement ZoneResult =driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
		
				
		n1.click();
		OpP.click();
		n3.click();
		String txt = ZoneResult.getText();
		//System.out.println(txt);
		Thread.sleep(2000);
		Assert.assertEquals(txt, " 4");
	
		ClearBtn.click();
		
		Thread.sleep(2000);
		n7.click();
		n4.click();
		OpS.click();
		n4.click();
		n0.click();
		String txt1 = ZoneResult.getText();
		Thread.sleep(2000);
		Assert.assertEquals(txt1, " 34");
		
		ClearBtn.click();
		
		Thread.sleep(2000);
		n9.click();
		n0.click();
		OpD.click();
		n2.click();
		
		String txt2 = ZoneResult.getText();
		Thread.sleep(2000);
		Assert.assertEquals(txt2, " 45");
		
		ClearBtn.click();
		Thread.sleep(2000);
		n9.click();
		n0.click();
		n0.click();
		OpM.click();
		n4.click();
		
		String txt3 = ZoneResult.getText();
		Thread.sleep(2000);
		Assert.assertEquals(txt3, " 3600");
	}
	
	//@AfterMethod
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
		





