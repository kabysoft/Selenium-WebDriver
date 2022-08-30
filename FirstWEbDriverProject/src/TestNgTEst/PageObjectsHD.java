package TestNgTEst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectsHD {
	
	
	WebDriver driver1;
	public  PageObjectsHD(WebDriver driver1) {
		this.driver1 = driver1;
		PageFactory.initElements(driver1, this);
		
	}
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement email1;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"password-input-field\"]")
	WebElement password1;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"zipCode\"]")
	WebElement ZipCode;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement Phone1;
	
	public void setEmail(String sendemail1) {
		email1.sendKeys(sendemail1);
	}
	
	public void setPassWord(String sendPass) {
		password1.sendKeys(sendPass);
	
	}
	
	public void setzipCode(String sendZip) {
		ZipCode.sendKeys(sendZip);
	}
	public void PhoneNum(String sendPhone) {
		Phone1.sendKeys(sendPhone);
	}
}


