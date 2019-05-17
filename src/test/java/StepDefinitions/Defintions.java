package StepDefinitions;

import PageObjects.MainPage;
import PageObjects.PersonalPage;
import PageObjects.SignUpPage;
import PreTest.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Defintions extends BaseTest {

	@Given("^initialize the Chrome browser to navigate to \"([^\"]*)\" site$")
	public void initializeTheChromeBrowserToNavigateToSite(String url) throws Throwable {

		// initialize chrome browser and navigate to PHPTravels site
		initializeBrowser();
		driver.get(url);
		
	}


	@When("^user clicks on Sign Up button after click on my account button on the landing page$")
	public void userClicksOnSignUpButtonAfterClickOnMyAccountButtonOnTheLandingPage() throws Throwable {

		MainPage main = new MainPage(driver);
		main.clickSignUp();
		
	}

	@Then("^user enters required information on \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and clicks SIGN UP$")
	public void userEntersRequiredInformationOnAndClicksSIGNUP(String firstName, String lastName, String phone, String email, String password) throws Throwable {

		SignUpPage signUp = new SignUpPage(driver);
		signUp.inputInfoToRegister(firstName, lastName, phone, email, password);
		
	}

	@Then("^verify user is registered successfully$")
	public void verifyUserIsRegisteredSuccessfully() throws Throwable {

		PersonalPage personal = new PersonalPage(driver);
		
		if(personal.getAccountName().isDisplayed())
		{
			System.out.println("Registered successfully!");
		}
		else
		{
			System.out.println("Error!");
		}
		
	}

}
