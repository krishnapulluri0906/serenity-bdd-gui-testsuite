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
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver_win32_1\\chromedriver.exe");
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
