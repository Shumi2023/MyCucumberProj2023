package com.proj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellNetworkPage {

	WebDriver driver;
	
	public DellNetworkPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='Flip the Switch to Open Networking with PowerSwitch']")
	
	WebElement Networking_Nome;
	public WebElement Homepage() {
		return Networking_Nome;
	}
	
	
	
	
	
	
	
	
	
	
	
}
