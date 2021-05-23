package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GlbHomepage {
	
	private WebDriver driver;
	
	//Define element locators here
	private By loginLocator = By.cssSelector("[id='login']");
	private By signupLocator = By.cssSelector("[id='signup']");
	
	
	
	public GlbHomepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickLogin() {
		this.driver.findElement(loginLocator).click();
	}
	
	public void clickSignup() {
		this.driver.findElement(signupLocator).click();
	}
	
	public String getTitle() {
		return this.driver.getTitle();
	}
}
