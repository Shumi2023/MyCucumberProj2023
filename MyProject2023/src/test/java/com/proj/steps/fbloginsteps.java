package com.proj.steps;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.proj.pages.FbHomePage;
import com.proj.pages.FbLoginPOM;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ConfigReader;


public class fbloginsteps {

	WebDriver driver;

	FbLoginPOM login;
	FbHomePage FBHM;
	//DriverFactory driverFactory; 
    ConfigReader configReader;
    Properties Prop; 

	@Given("^user navigates to FB login page$")
	public void user_navigates_to_FB_login_page() throws Throwable {
		
		//driverFactory = new DriverFactory();
		driver=DriverFactory.getDriver();
		configReader = new ConfigReader();
		Prop = new Properties();
	    Prop = configReader.initializeProperties();
		driver.get(Prop.getProperty("url_fb"));
		

	}

	@When("^user types username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_types_username_and_password(String arg1, String arg2) throws Throwable {

		try {
			login = new FbLoginPOM (driver);
			login.typeEmail().sendKeys(arg1);
			Thread.sleep(3000);
			login.typePass().sendKeys(arg2);
			Thread.sleep(3000);

		}
		catch (Exception e) {

			System.out.println("Element not found");
		}
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {

		login = new FbLoginPOM (driver);
		login.Clicklogin().click();
		Thread.sleep(3000);

	}

	@When("^user types valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_types_valid_username_and_password(String phone_number, String password) throws Throwable {

		login = new FbLoginPOM (driver);  
		login.typeEmail().sendKeys(phone_number);
		Thread.sleep(3000);
		login.typePass().sendKeys(password);
		
	}


	@Then("^user should be able to logged in successfully$")
	public void user_should_be_able_to_logged_in_successfully() throws Throwable {
		FBHM = new FbHomePage(driver);
		Assert.assertEquals("Welcome to Facebook, Tom",FBHM.FBHomepage().getText());
	}



}
