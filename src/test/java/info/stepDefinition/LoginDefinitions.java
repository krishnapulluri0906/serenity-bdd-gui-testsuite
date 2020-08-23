package info.stepDefinition;

import net.thucydides.core.annotations.Steps;
import info.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinitions {
	@Steps
	LoginSteps objLoginSteps;
	
	@Given("user is already on Login Page")
	public void user_is_already_on_Login_Page() {
		objLoginSteps.launchURL();

	}

	@When("title of login page is Free CRM")
	public void title_of_login_page_is_Free_CRM() {
		objLoginSteps.getLoginCRMTitle("#1 Free CRM for Any Business: Online Customer Relationship Software");
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String username, String password) throws InterruptedException {
		objLoginSteps.clickLoginButton();
		Thread.sleep(2000);
		objLoginSteps.enterLoginDetails(username, password);
	  
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		objLoginSteps.clickSubmitButton();
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
	//	objLoginSteps.getHomeTitle("CRMPRO");
	}

	@Then("Close the browser")
	public void close_the_browser() {
		objLoginSteps.closeBrowser();
	   
	}

}
