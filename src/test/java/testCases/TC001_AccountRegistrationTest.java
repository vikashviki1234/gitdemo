package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	
	
	
	@Test
	public void verify_account_registration() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAcoount();
		hp.clickRegister();
		
		RegistrationPage register = new RegistrationPage(driver);
		
		/*
		  register.setFirstName("vickey"); register.setLastName("viki");
		  register.setEmailid("htbixko386@jomail.online");
		  register.setPassword("qwerty123");
		*/
		 
		 //random
		 register.setFirstName(RandomStrings().toUpperCase()); 
		 register.setLastName(RandomStrings().toUpperCase());
		 register.setEmailid(RandomAlphaNumeric()+"@gmail.com");
		 Thread.sleep(3000);
		 register.setPassword(RandomStrings());
		 
		Thread.sleep(3000);
		register.selectAgreebox();
		Thread.sleep(3000);
		register.clickButton();
		
		String confmsg = register.createdMessage();
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
	}
		

	
}
