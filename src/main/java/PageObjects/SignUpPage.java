package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

	//variables
	@FindBy(name="firstname")
	private WebElement firstnameLocator;
	@FindBy(name="lastname")
	private WebElement lastnameLocator;
	@FindBy(name="phone")
	private WebElement phoneLocator;
	@FindBy(name="email")
	private WebElement emailLocator;
	@FindBy(name="password")
	private WebElement passwordLocator;
	@FindBy(name="confirmpassword")
	private WebElement confirmPwLocator;
	@FindBy(css=".signupbtn.btn_full.btn.btn-action.btn-block.btn-lg")
	private WebElement submitBtnLocator;
	
	
	// Constructor
	public SignUpPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	// method to input necessary information
	public void inputInfoToRegister(String firstname, String lastname, String phone, String email, String password) throws Exception
	{
		try {
			firstnameLocator.sendKeys(firstname);
			lastnameLocator.sendKeys(lastname);
			phoneLocator.sendKeys(phone);
			emailLocator.sendKeys(email);
			passwordLocator.sendKeys(password);
			confirmPwLocator.sendKeys(password);
			submitBtnLocator.click();
			}
		catch(Exception e)
		{
			throw e;
		}
	}

}
