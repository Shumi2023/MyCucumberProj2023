package hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class MyHooks  {

	WebDriver driver;
	ConfigReader configReader;
	//DriverFactory driverFactory;
	 
	@Before
	public void setup() {
		
	    configReader = new ConfigReader();
        Properties Prop = configReader.initializeProperties();
	    //driverFactory = new DriverFactory();
	    driver = DriverFactory.initiazeBrowser(Prop.getProperty("browserName"));	
//		driver.get(Prop.getProperty("url_dell"));
//		driver.get(Prop.getProperty("url_fb"));
//		driver.get(Prop.getProperty("url_yahoo"));
	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
