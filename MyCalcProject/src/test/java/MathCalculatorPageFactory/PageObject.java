package MathCalculatorPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageObject {

WebDriver driver;
	
	public  PageObject(WebDriver driver) {
		this.driver = driver
				;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (how = How.XPATH, using = "//div[@id = 'logo']")
	WebElement logoTest;
	
	
	@FindBy (how = How.XPATH, using = "/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td/div/div[2]")
	WebElement CurrentValue;
	
	@FindBy (how = How.XPATH, using ="//*[@id=\"sciout\"]/div[2]/div[4]/span[1]")  
	WebElement n0;
	
	@FindBy (how = How.XPATH, using ="//*[@id=\"sciout\"]/div[2]/div[3]/span[1]")
	WebElement n1;
	
	@FindBy (how = How.XPATH, using ="//*[@id=\"sciout\"]/div[2]/div[3]/span[2]")
	WebElement n2;
	
	@FindBy (how = How.XPATH, using ="//*[@id=\"sciout\"]/div[2]/div[3]/span[3]")
	WebElement n3;
	
	 @FindBy (how = How.XPATH, using ="//*[@id=\"sciout\"]/div[2]/div[2]/span[1]")
	 WebElement n4;
	 
	 @FindBy (how = How.XPATH, using ="//*[@id=\"sciout\"]/div[2]/div[2]/span[2]")
	WebElement n5;
	 
	 @FindBy (how = How.XPATH, using ="//*[@id=\"sciout\"]/div[2]/div[2]/span[3]")
	 WebElement n6;
	 
	@FindBy (how = How.XPATH, using ="//*[@id=\"sciout\"]/div[2]/div[1]/span[1]")
	WebElement n7;
	
	@FindBy (how = How.XPATH, using ="//*[@id=\"sciout\"]/div[2]/div[1]/span[2]")
	WebElement n8;
	
	@FindBy (how = How.XPATH, using ="//*[@id=\"sciout\"]/div[2]/div[1]/span[3]")
	WebElement n9;
	
	@FindBy (how = How.XPATH, using ="/html/body/div[3]/div[1]/table[1]/tbody/tr/td/div[2]/div[3]/span[4]")
	WebElement OpM;
	
	
	@FindBy (how = How.XPATH, using ="/html/body/div[3]/div[1]/table[1]/tbody/tr/td/div[2]/div[4]/span[4]")
	WebElement OpD;
	
	@FindBy (how = How.XPATH, using ="//*[@id=\"sciout\"]/div[2]/div[2]/span[4]")
	WebElement OpS;
	
	@FindBy (how = How.XPATH, using ="/html/body/div[3]/div[1]/table[1]/tbody/tr/td/div[2]/div[1]/span[4]")
	WebElement OpP;
	

	
	@FindBy (how = How.XPATH, using ="/html/body/div[3]/div[1]/table[1]/tbody/tr/td/div[2]/div[5]/span[3]")
	WebElement ClearBtn;
	
	@FindBy (how = How.XPATH, using= "//*[@id=\"sciOutPut\"]")
    WebElement ZoneResult;
	
	
	
	public void ClearCal() {
		ClearBtn.click();
			}
	
	public boolean logoT() {
		return logoTest.isDisplayed();
		}
	
	public  void testTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title,"Math Calculators");
	    }
	
	public void SetFunctionTest() throws InterruptedException {
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
}	

