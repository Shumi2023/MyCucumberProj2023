package com.proj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellSignuppage {

	WebDriver driver;
	
	//Constructor
	
	public DellSignuppage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@id=\"um-si-label\"]")
	WebElement Sign;
	public WebElement SignIN() {
		return Sign;
	}
	
	@FindBy(xpath="//a[normalize-space()='Create an Account']")
	WebElement CreateAcc;
	public WebElement Account() {
		return CreateAcc;
	}
	
	@FindBy(xpath="//input[@id=\"FirstName\"]")
	WebElement Firstname;
	public WebElement TypeFname() {
		return  Firstname;
	}
	
	@FindBy(xpath="//input[@id=\"LastName\"]")
	WebElement Lastname;
	public WebElement TypeLname() {
		return Lastname;
	}
	
	@FindBy(xpath="//input[@id=\"EmailAddress\"]")
	WebElement Email;
	public WebElement TypeEmail() {
		return Email;
	}
	
	@FindBy(xpath="//input[@id=\"userPwd_UserInputSecret\"]")
	WebElement Password;
	public WebElement TypePass() {
		return Password;
	}
	
	@FindBy(xpath="//input[@id=\"CreateAccountOptInCheckbox\"]")
	WebElement Check;
	public WebElement Checkbox() {
		return Check;
	}
	
	@FindBy(xpath="//input[@id=\"btnCreateAccount\"]")
	WebElement Accountbutton;
	public WebElement ClickAccountButton() {
		return  Accountbutton;
	}
}

