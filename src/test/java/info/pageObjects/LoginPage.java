package info.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import info.reusables.reusable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{
	reusable objReusable = new reusable();
	
	WebDriver driver = objReusable.newDriver();
	
	@FindBy(name = "username")
	protected WebElementFacade txtUsername;
	
	@FindBy(name = "password")
	protected WebElementFacade txtPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	protected WebElementFacade  btnSubmit;
	
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
		txtUsername.sendKeys(password);
	}
	
	public String getLoginCRMTitle()
	{
		String title = driver.getTitle();
		
		return title;
	}
	
	public String getHomeTitle()
	{
		String title = driver.getTitle();
		
		return title;
	}
}