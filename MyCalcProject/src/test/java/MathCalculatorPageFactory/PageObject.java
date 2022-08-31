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
	
	
	
	
	@FindBy (how = How.XPATH, using ="//span[normalize-space()='0']")  
	WebElement n0;
	
	@FindBy (how = How.XPATH, using ="//span[normalize-space()='1']")
	WebElement n1;
	
	@FindBy (how = How.XPATH, using ="//span[normalize-space()='2']")
	WebElement n2;
	
	@FindBy (how = How.XPATH, using ="//span[normalize-space()='3']")
	WebElement n3;
	
	 @FindBy (how = How.XPATH, using ="//span[normalize-space()='4']")
	 WebElement n4;
	 
	 @FindBy (how = How.XPATH, using ="//span[normalize-space()='5']")
	WebElement n5;
	 
	 @FindBy (how = How.XPATH, using ="//span[normalize-space()='6']")
	 WebElement n6;
	 
	@FindBy (how = How.XPATH, using ="//span[normalize-space()='7']")
	WebElement n7;
	
	@FindBy (how = How.XPATH, using ="//span[normalize-space()='8']")
	WebElement n8;
	
	@FindBy (how = How.XPATH, using ="//span[normalize-space()='9']")
	WebElement n9;
	
	@FindBy (how = How.XPATH, using ="//span[normalize-space()='×']")
	WebElement OpM;
	
	
	@FindBy (how = How.XPATH, using ="//span[normalize-space()='÷']")
	WebElement OpD;
	
	@FindBy (how = How.XPATH, using ="//span[contains(text(),'–')]")
	WebElement OpS;
	
	@FindBy (how = How.XPATH, using ="//span[normalize-space()='+']")
	WebElement OpP;
	

	
	@FindBy (how = How.XPATH, using ="//span[normalize-space()='AC']")
	WebElement ClearBtn;
	
	@FindBy (how = How.XPATH, using= "//*[@id=\"sciOutPut\"]")
    WebElement ZoneResult;
	
	
	
	public void ClearCal() {
		ClearBtn.click();
			}
	
	public boolean logoT() {
		return logoTest.isDisplayed();
		}
	
	public  String testTitle() {
		String title = driver.getTitle();
		//Assert.assertEquals(title,"Math Calculators");
		return title;
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

