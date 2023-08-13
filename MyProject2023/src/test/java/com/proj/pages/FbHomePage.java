package com.proj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbHomePage {

WebDriver driver;
	
	public FbHomePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Welcome to Facebook, Tom']")
	
	WebElement FB_Home;
	public WebElement FBHomepage() {
		return FB_Home;
	}
}
