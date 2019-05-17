package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalPage extends BasePage {

	@FindBy(how = How.LINK_TEXT, using = "YOYO")
	private WebElement myAccountNameLocator;
	
	
	// constructor
	public PersonalPage(WebDriver driver) {
		super(driver);

	}
	
	
	// method to get account name
	public WebElement getAccountName()
	{
		return myAccountNameLocator;
	}

}
