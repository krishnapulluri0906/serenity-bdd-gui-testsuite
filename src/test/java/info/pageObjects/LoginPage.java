package info.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import info.reusables.reusable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{
	//reusable objReusable = new reusable();
	
	WebDriver driver = null;
	
	@FindBy(xpath = "//input[@name='email']")
	protected WebElementFacade txtUsername;
	
	@FindBy(xpath = "//input[@name='password']")
	protected WebElementFacade txtPassword;
	
	@FindBy(xpath = "//div[text()='Login']")
	protected WebElementFacade  btnSubmit;
	
	@FindBy(xpath="//span[text()='Log In']")
	protected WebElementFacade btnLogin;
	
	public void clickOnSubmit()
	{
		btnSubmit.click();
	}
	
	public void enterUserName(String username)
	{
		txtUsername.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public String getLoginCRMTitle()
	{
		String title = getDriver().getTitle();
		
		return title;
	}
	
	public String getHomeTitle()
	{
		String title = getDriver().getTitle();
		
		return title;
	}
	
	public void clickLoginButton()
	{
		btnLogin.click();
	}
}