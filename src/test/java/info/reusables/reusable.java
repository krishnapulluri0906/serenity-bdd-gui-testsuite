package info.reusables;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;

public class reusable  implements DriverSource{

	
	@Override
	public WebDriver newDriver() {
		
		String browserType = "";
		WebDriver driver = null;
		 String strExecutionPlatform = System.getProperty("executionPlatform").trim().toUpperCase();
		//System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
		 try {
			 ChromeOptions chromeOptions;
			URL testGridUrl = new URL("http://192.168.99.100:4444/wd/hub");
			
			switch(strExecutionPlatform)
			{
			case "LOCAL_CHROME": 
				chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--disable-dev-shm-usage");
                chromeOptions.addArguments("start-maximized");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptions);
                break;
			case "GRID_CHROME":
				DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
                chromeOptions = new ChromeOptions();
                desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                driver = new RemoteWebDriver(testGridUrl, desiredCapabilities);
                break;
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver = new ChromeDriver();
		return driver;
	}

	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public final static String PROPERTY_PATH = "testproperties/";
	
	public String readProperty(String fileName, String propertyName)
	{
		String propertyValue = "";
		InputStream inputStream;
		
		try {
			Properties prop = new Properties();
			String propFileName = PROPERTY_PATH + fileName;
			
			inputStream = ClassLoader.getSystemClassLoader().getSystemResourceAsStream(propFileName);
			if(inputStream != null) {
				prop.load(inputStream);
			}
			
			propertyValue = prop.getProperty(propertyName);
			
			inputStream.close();
		}
		catch(Exception e){
			
			System.out.println("Issue with properties" + e.getMessage());
		}
		return propertyValue;
	}
}
