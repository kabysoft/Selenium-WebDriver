package POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TcHomeDepot extends Base{
	

	WebDriver driver1;

	@BeforeMethod

	      public void setUpPro() {
		  driver1 = setProperty();
		  
		  }

	
	
	@Test      

	      public void t_case_01_Register() throws InterruptedException {
		PageObjectsHD reg = new PageObjectsHD(driver1);
		
		reg.setEmail("salah@gmail.com");
		reg.setPassWord("MyPassword1#");
		reg.PhoneNum("720.720.7777");
		reg.setzipCode("80231");
		Thread.sleep(2000);
	    
	     }

	@AfterMethod

	      public void TearDown() throws InterruptedException {
		//driver1.wait(1);
		  driver1.quit();
		  }

}
