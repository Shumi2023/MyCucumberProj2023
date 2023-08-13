package com.proj.steps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import com.proj.pages.dellITPOM;

import io.cucumber.java.en.*;


public class DellActionSteps {

    WebDriver driver;
	dellITPOM actionpage;

	@Given("^User is already in the dell homepage$")
	public void user_is_already_in_the_dell_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dell.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		action.moveToElement(actionpage.hoverProduct()).build().perform();
	}

	@When("^user click the Networking option$")
	public void user_click_the_Networking_option() throws Throwable {
		
		actionpage =new dellITPOM(driver);
		actionpage.ClickNetworking().click();
		Thread.sleep(3000);
		
	}

	@Then("^user should redirect to the Networking homepage$")
	public void user_should_redirect_to_the_Networking_homepage() throws Throwable {

		driver.quit();
	}





}
