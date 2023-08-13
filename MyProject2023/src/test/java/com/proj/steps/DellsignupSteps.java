package com.proj.steps;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.proj.pages.DellSignuppage;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ConfigReader;



public class DellsignupSteps {

    WebDriver driver;
	DellSignuppage signup;
	//DriverFactory driverFactory; 
    ConfigReader configReader;
    Properties Prop; 
	
	@Given("^user navigate to dell homepage$")
	public void user_navigate_to_dell_homepage() throws Throwable {
		
		//driverFactory = new DriverFactory();
		driver=DriverFactory.getDriver();
		configReader = new ConfigReader();
		Prop = new Properties();
	    Prop = configReader.initializeProperties();
		driver.get(Prop.getProperty("url_dell"));
		
	}

	@When("^user mouse hover to sign In option & click create Account button$")
	public void user_mouse_hover_to_sign_In_option_click_create_Account_button() throws Throwable {

		Actions act = new Actions(driver);
		signup = new DellSignuppage(driver);
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,5);
		act.moveToElement(signup.SignIN()).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(signup.SignIN()));
		signup.Account().click();
		Thread.sleep(3000);

	}

	@When("^user enters \"([^\"]*)\"  \"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {

		try {
			signup = new DellSignuppage(driver);
			signup.TypeFname().sendKeys(arg1);
			signup.TypeLname().sendKeys(arg2);
			signup.TypeEmail().sendKeys(arg3);
			signup.TypePass().sendKeys(arg4);
			Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println("Exception found");
		}
	}

	@When("^user cheaked email notification$")
	public void user_cheaked_email_notification() throws Throwable {
		signup = new DellSignuppage(driver);
		signup.Checkbox().click();
		Thread.sleep(3000);
	}

	@When("^user clicked create account button$")
	public void user_clicked_create_account_button() throws Throwable {
		signup = new DellSignuppage(driver);
		signup.ClickAccountButton().click();
		Thread.sleep(3000);
	}

	@Then("^a user account should be successfully created$")
	public void a_user_account_should_be_successfully_created() throws Throwable {

		
	}






}
