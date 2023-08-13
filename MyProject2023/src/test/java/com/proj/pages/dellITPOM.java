package com.proj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellITPOM {

	WebDriver driver;
	
	//Constructor
	
	public dellITPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='IT Infrastructure']")
	WebElement DellIT;
	public WebElement hoverIT() {
		return  DellIT;
	}
	
	@FindBy(xpath="//button[text()='Products']")
	WebElement Product;
	public WebElement hoverProduct() {
		return  Product;
	}
	
	@FindBy(xpath="//a[text()='Networking']")
	WebElement Networking;
	public WebElement ClickNetworking() {
		return  Networking;
	}
}
