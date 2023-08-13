package com.proj.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.proj.pages.DellSignuppage;

import io.cucumber.java.en.*;



public class DellsignupSteps {

	WebDriver driver;
	DellSignuppage signup;

	@Given("^user navigate to dell homepage$")
	public void user_navigate_to_dell_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dell.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^user mouse hover to sign In option & click create Account button$")
	public void user_mouse_hover_to_sign_In_option_click_create_Account_button() throws Throwable {

		Actions act = new Actions(driver);
		signup = new DellSignuppage(driver);
		act.moveToElement(signup.SignIN()).build().perform();
		signup.Account().click();

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

		Thread.sleep(3000);
		driver.quit();
	}






}
