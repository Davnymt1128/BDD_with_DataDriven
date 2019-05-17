package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends BasePage {

	@FindBy(how = How.LINK_TEXT, using = "MY ACCOUNT")
	private WebElement myAccountLocator;
	@FindBy(how = How.LINK_TEXT, using = "Sign Up")
	private WebElement SignUpLocator;
	
	// constructor
	public MainPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	// method
	public SignUpPage clickSignUp()
	{
		myAccountLocator.click();
		SignUpLocator.click();
		
		return new SignUpPage(driver);
	}
	
	
}
