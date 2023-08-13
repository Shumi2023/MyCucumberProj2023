package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	
	public  Properties initializeProperties() {
		
		prop = new Properties();
		//File propFile = new File(System.getProperty(("user.dir")+"\\resources\\config.properties"));
	
		try {
			FileInputStream fis = new FileInputStream ("./resources/config.properties");
			prop.load(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return prop;
	}

}
