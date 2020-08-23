/*package info.stepDefinition;

import org.openqa.selenium.WebDriver;

import info.reusables.reusable;
import info.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

public class LoginStepDefinition {

	WebDriver driver;
	LoginSteps objLoginSteps = new LoginSteps();

	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {

		objLoginSteps.getUrl();

	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM() {
		objLoginSteps.getLoginCRMTitle("#1 Free CRM for Any Business: Online Customer Relationship Software");
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		objLoginSteps.enterLoginDetails(username, password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {

		objLoginSteps.clickSubmitButton();
		
	}

	@Then("^user is on home page$")
	public void user_is_on_hopme_page() {

		objLoginSteps.getHomeTitle("CRMPRO");

	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}*/