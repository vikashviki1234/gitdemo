package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage
{
	public RegistrationPage(WebDriver driver) 
	{
		super(driver); 
	}
	
//locators
	@FindBy(xpath="//input[@id='input-firstname']") WebElement firstNametxt;
	@FindBy(xpath="//input[@id='input-lastname']")  WebElement lastNametxt;
	@FindBy(xpath="//input[@id='input-email']") WebElement emailIdtxt;
	@FindBy(xpath="//input[@id='input-password']") WebElement passwordTxt;
    @FindBy(xpath="//input[@name='agree']") WebElement agreeBox;
	@FindBy(xpath="//button[normalize-space()='Continue']") WebElement clickBtn;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement createdMsg;
	
//actionMethods
	public void setFirstName(String fname)
	{
		firstNametxt.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		lastNametxt.sendKeys(lname);
	}
	
	public void setEmailid(String email)
	{
		emailIdtxt.sendKeys(email);
	}
	
	public void setPassword(String password) 
	{
		passwordTxt.sendKeys(password);
	}
	
	public void selectAgreebox()
	{
		agreeBox.click();
	}
	
	public void clickButton()
	{
		
		clickBtn.click();
	}
	
	public String createdMessage()
	{
		try
		{
			return(createdMsg.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
}



