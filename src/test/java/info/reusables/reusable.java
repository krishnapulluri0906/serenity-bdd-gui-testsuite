package info.reusables;

import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.thucydides.core.webdriver.DriverSource;

public class reusable  implements DriverSource{

	
	@Override
	public WebDriver newDriver() {
		
		String browserType = "";
		WebDriver driver = null;
		//System.out.println("Krishna path for driver" + System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","driver path");
		//ChromeOptions chrOptions = new ChromeOptions();
		//chrOptions.setExperimentalOption("userAutomationExtension", false);
		//System.setProperty("http.nonProxyHosts","0.0.0.0|localhost*|127.0.0.1|");
		//driver = new ChromeDriver(chrOptions);
		driver = new ChromeDriver();
		
		/*switch(browserType)
		{
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver","driver path");
			driver = new ChromeDriver();
		}*/
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
