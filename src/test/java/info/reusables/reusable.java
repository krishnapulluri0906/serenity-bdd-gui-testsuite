package info.reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.webdriver.DriverSource;

public class reusable  implements DriverSource{

	WebDriver driver = null;
	@Override
	public WebDriver newDriver() {
		
		String browserType = "";
		
		switch(browserType)
		{
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver","driver path");
			driver = new ChromeDriver();
		}
		return null;
	}

	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return false;
	}

}
