package info.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import info.pageObjects.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
	
	LoginPage objLoginPage;
	
	@Step
	public void enterLoginDetails(String userName,String password) {
		
		objLoginPage.enterUserName(userName);
		objLoginPage.enterPassword(password);
	}
	
	@Step
	public void clickSubmitButton() {
		
		objLoginPage.clickOnSubmit();
	}
	
	@Step
	public void getLoginCRMTitle(String expectedTitle)
	{
		String title = objLoginPage.getLoginCRMTitle();
		assertEquals(title,expectedTitle);
	}
	
	@Step
	public void getHomeTitle(String expectedTitle)
	{
		String title = objLoginPage.getHomeTitle();
		assertEquals(title,expectedTitle);
	}
}
