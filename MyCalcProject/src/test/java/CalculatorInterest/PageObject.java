package CalculatorInterest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObject {

	
WebDriver driver;
	
	public  PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
		
		@FindBy (how = How.ID, using = "cstartingprinciple")
		WebElement TxtBoxStartingPrincipal;
		
		@FindBy (how = How.ID, using = "cannualaddition" )
		WebElement TxtBoxAnnualContribution;
		
		@FindBy (how = How.ID, using = "cmonthlyaddition")
		WebElement TxtBoxMonthlyContribution;
		
		@FindBy (how = How.ID, using = "cadditionat1")
		WebElement RadioBtnbeginning;
		
		@FindBy (how = How.ID, using = "cadditionat2")
		WebElement RadioBtnEnd;
		
		@FindBy (how = How.ID, using = "cinterestrate")
		WebElement txtBoxInterestRate;
		
		@FindBy (how = How.ID, using = "ccompound")
		WebElement Compound;
		
		@FindBy (how = How.ID, using = "cyears")
		WebElement After;
		
		@FindBy (how = How.ID, using = "ctaxtrate")
		WebElement TaxRate;
		
		@FindBy (how = How.ID, using = "cinflationrate")
		WebElement InflationRate;
		
		@FindBy (how = How.XPATH, using = "//*[@id=\"calinputtable\"]/tbody/tr[10]/td/input[2]")
		WebElement BtnCalculate;
		
		
		public void setStartingP(String val) {
			TxtBoxStartingPrincipal.clear();
			TxtBoxStartingPrincipal.sendKeys(val);
			
		}
		public void setAnnualCont(String val) {
			TxtBoxAnnualContribution.clear();
			TxtBoxAnnualContribution.sendKeys(val);
			
		}
		public void setMonthlyCont(String val) {
			TxtBoxMonthlyContribution.clear();
			TxtBoxMonthlyContribution.sendKeys(val);
			
		}
		public void setContBegin() {
			RadioBtnbeginning.click();;
			
		}
		public void setContEnd() {
			Actions act = new Actions(driver); 
			act.moveToElement(RadioBtnEnd).click().build().perform();
			
			
		}
		public void setInterestR(String val) {
			txtBoxInterestRate.clear();
			txtBoxInterestRate.sendKeys(val);
			
		}
		public void setCompound(String val) {
			Select dropdown = new Select(Compound);
			dropdown.selectByValue(val);
		
			
		}
		public void setAfterYears(String val) {
			After.clear();
			After.sendKeys(val);
			
		}
		public void setTaxRAte(String val) {
			TaxRate.clear();
			TaxRate.sendKeys(val);
			
		}
		public void setInflationRAte(String val) {
			InflationRate.clear();
			InflationRate.sendKeys(val);
			
		}
		
		public void setBtnCalculate() {
			
			BtnCalculate.click();
		
		}
	
}
