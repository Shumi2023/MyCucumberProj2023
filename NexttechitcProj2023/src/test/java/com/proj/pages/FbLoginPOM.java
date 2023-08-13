package com.proj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPOM {

WebDriver driver;
	
	//Constructor
	
	public FbLoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"email\"]")
	WebElement username;
	public WebElement typeEmail() {
		return  username;
	}
	@FindBy(xpath="//input[@id=\"pass\"]")
	WebElement Password;
	public WebElement typePass() {
		return  Password;
	}
	
	
	@FindBy(xpath="//button[@id=\"loginbutton\"]")
	WebElement LoginButton;
	public WebElement Clicklogin() {
		return  LoginButton;
	}
}
