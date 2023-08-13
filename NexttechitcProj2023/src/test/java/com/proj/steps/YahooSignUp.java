package com.proj.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.proj.pages.Yahoosignuppage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class YahooSignUp {

	WebDriver driver;
	Yahoosignuppage signup;

	@Given("^user visits to yahoo signup page$")
	public void user_visits_to_yahoo_signup_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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
		signup.Continue().click();
		Thread.sleep(3000);
		driver.quit();

	}

}
