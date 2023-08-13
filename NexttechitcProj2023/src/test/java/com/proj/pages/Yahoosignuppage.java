package com.proj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yahoosignuppage {
	
WebDriver driver;
	
	//Constructor
	
	public Yahoosignuppage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"usernamereg-firstName\"]")
	WebElement Firstname;
	public WebElement typeFName() {
		return Firstname;
	}

	
	@FindBy(xpath="//input[@id=\"usernamereg-lastName\"]")
	WebElement Lastname;
	public WebElement typeLName() {
		return Lastname;
	}
	
	@FindBy(xpath="//input[@name=\"userId\"]")
	WebElement Email;
	public WebElement New_email() {
		return Email;
	}
	
	@FindBy(xpath="//input[@id=\"usernamereg-password\"]")
	WebElement Password;
	public WebElement New_pass() {
		return Password;
	
	}
	@FindBy(xpath="//select[@id=\"yid-domain-selector\"]")
	public WebElement emailType;
	
	@FindBy(xpath="//select[@id=\"usernamereg-month\"]")
	public WebElement select_Month;
	
	@FindBy(xpath="//input[@id=\"usernamereg-day\"]")
	WebElement Birthday;
	public WebElement Day() {
		return Birthday;
    }
	
	@FindBy(xpath="//input[@id=\"usernamereg-year\"]")
	WebElement Birthyear;
	public WebElement Year() {
		return Birthyear;
    }
	
	@FindBy(xpath="//button[@id=\"reg-submit-button\"]")
	WebElement ContinueButton;
	public WebElement Continue() {
		return ContinueButton;
	}
	
}