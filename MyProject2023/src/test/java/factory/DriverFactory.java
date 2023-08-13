package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	static WebDriver driver = null;

	public static WebDriver initiazeBrowser(String browserName) {

		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			
			//------Headless Browser Code--------
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless");
			//driver = new ChromeDriver(options);
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
