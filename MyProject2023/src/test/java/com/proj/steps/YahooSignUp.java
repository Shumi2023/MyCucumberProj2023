package com.proj.steps;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.proj.pages.Yahoosignuppage;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ConfigReader;


public class YahooSignUp {

	WebDriver driver;
	Yahoosignuppage signup;
	//DriverFactory driverFactory; 
    ConfigReader configReader;
    Properties Prop; 
    
	@Given("^user visits to yahoo signup page$")
	public void user_visits_to_yahoo_signup_page() throws Throwable {
		
		//driverFactory = new DriverFactory();
		driver=DriverFactory.getDriver();
		configReader = new ConfigReader();
		Prop = new Properties();
	    Prop = configReader.initializeProperties();
		driver.get(Prop.getProperty("url_yahoo"));
		

	}

	@When("^user types \"([^\"]*)\",\"([^\"]*)\" new \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_types_new_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		try {

			signup = new Yahoosignuppage(driver);
			signup.typeFName().sendKeys(arg1);
			signup.typeLName().sendKeys(arg2);
			signup.New_email().sendKeys(arg3);
			Select dropdown1 = new Select(signup.emailType);
			dropdown1.selectByVisibleText("myyahoo.com");
			signup.New_pass().sendKeys(arg4);

		} catch (Exception e) {
			System.out.println("no such element exception found");
		}
	}

	@When("^user selects dropdown Month and type birth day \"([^\"]*)\" and birth year \"([^\"]*)\"$")
	public void user_selects_dropdown_Month_and_type_birth_day_and_birth_year(String arg1, String arg2)
			throws Throwable {
		try {
			signup = new Yahoosignuppage(driver);
			Select dropdown2 = new Select(signup.select_Month);
			dropdown2.selectByVisibleText("February");
			signup.Day().sendKeys(arg1);
			signup.Year().sendKeys(arg2);

		} catch (Exception e) {
			System.out.println("no such element exception found");
		}
	}

	@Then("^user clicked continue button$")
	public void user_clicked_continue_button() throws Throwable {
		signup = new Yahoosignuppage(driver);
		WebDriverWait wait = new WebDriverWait(driver,2);
//		JavascriptExecutor jse =(JavascriptExecutor)driver;
//		jse.executeScript("argument[0].click()",signup.Continue());
		signup.Continue().click();
		wait.until(ExpectedConditions.elementToBeClickable(signup.Continue()));
		

	}

}
