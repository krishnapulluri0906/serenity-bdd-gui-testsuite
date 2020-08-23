package info.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import info.pageObjects.LoginPage;
import info.reusables.reusable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

	LoginPage objLoginPage;
	reusable objResuable = new reusable();
	public final static String Framework_specifications_property_path = "testproperties/";
	public final static String Application_url_property_file = "globalSettings.properties";

	@Step
	public void enterLoginDetails(String userName, String password) throws InterruptedException {

		objLoginPage.enterUserName(userName);
		Thread.sleep(1000);
		objLoginPage.enterPassword(password);
	}

	@Step
	public void clickSubmitButton() throws InterruptedException {

		objLoginPage.clickOnSubmit();
		Thread.sleep(2000);
	}

	@Step
	public void getLoginCRMTitle(String expectedTitle) {
		String title = objLoginPage.getLoginCRMTitle();
		//assertEquals(title, expectedTitle);
	}

	@Step
	public void getHomeTitle(String expectedTitle) {
		String title = objLoginPage.getHomeTitle();
		//assertEquals(title, expectedTitle);
	}

	@Step
	public void launchURL() {
		getDriver().get("https://www.freecrm.com/index.html");
		getDriver().manage().window().maximize();
	}

	@Step
	public void getUrl() {
		String appurl = objResuable.readProperty(Application_url_property_file,
				"url");
		getDriver().get(appurl);
	}
	
	public void closeBrowser(){
		getDriver().quit();
		
	}
	
	public void clickLoginButton()
	{
		objLoginPage.clickLoginButton();
	}
}
