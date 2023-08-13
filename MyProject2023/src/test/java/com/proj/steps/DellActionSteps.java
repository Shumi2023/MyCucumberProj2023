package com.proj.steps;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.proj.pages.DellNetworkPage;
import com.proj.pages.dellITPOM;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ConfigReader;


public class DellActionSteps {

   WebDriver driver;
	dellITPOM actionpage;
	DellNetworkPage home;
	//DriverFactory driverFactory; 
    ConfigReader configReader;
    Properties Prop; 
	
	@Given("^User is already in the dell homepage$")
	public void user_is_already_in_the_dell_homepage() throws Throwable {
		
		//driverFactory = new DriverFactory();
		driver=DriverFactory.getDriver();
		configReader = new ConfigReader();
		Prop = new Properties();
	    Prop = configReader.initializeProperties();
		driver.get(Prop.getProperty("url_dell"));
		
	}

	@When("^user mouse hover to the IT Insfrastructure tab$")
	public void user_mouse_hover_to_the_IT_Insfrastructure_tab() throws Throwable {

		try {
			Actions action = new Actions(driver);
			actionpage = new dellITPOM(driver);
			action.moveToElement(actionpage.hoverIT()).build().perform();
		}
		catch(Exception e) {
			System.out.println("Execption found");
		}

	}

	@When("^user mouse hover to the product menu$")
	public void user_mouse_hover_to_the_product_menu() throws Throwable {
		
		Actions action = new Actions(driver);
		actionpage =new dellITPOM(driver);
		//Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,2);
		action.moveToElement(actionpage.hoverProduct()).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(actionpage.hoverProduct()));
	}

	@When("^user click the Networking option$")
	public void user_click_the_Networking_option() throws Throwable {
		
		actionpage =new dellITPOM(driver);
		//WebDriverWait wait = new WebDriverWait(driver,2);
		actionpage.ClickNetworking().click();
		//wait.until(ExpectedConditions.elementToBeClickable(actionpage.ClickNetworking()));
		Thread.sleep(3000);
		
	}

	@Then("^user should redirect to the Networking homepage$")
	public void user_should_redirect_to_the_Networking_homepage() throws Throwable {
        home = new DellNetworkPage(driver);
		Assert.assertTrue(home.Homepage().isDisplayed());
	}





}
