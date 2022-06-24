package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {
	
	
	private By usernameLocator = By.id("username");
	private By passwordLocator =By.name("password");
	private By loginbuttonLocator =By.tagName("button");
	private By errorMessage =By.id("flash");

	public LoginPage(WebDriver driver,Logger log) {
		
		super(driver,log);
		
	}
	
	public SecureAreaPage logIn(String username ,String password) {
		
		log.info("login with username and password");
		type(username,usernameLocator);
		type(password,passwordLocator);
		click(loginbuttonLocator);
		return new SecureAreaPage(driver,log);
	}
	
	public  void negativeLogIn(String username, String password) {
		log.info("login with username and password");
		type(username,usernameLocator);
		type(password,passwordLocator);
		click(loginbuttonLocator);
		
	}
	public void waitForErrorMessage() {
		
		waitforVisibilityOf(errorMessage,5);
	}
	
	public String getErrorMessageText() {
		return find(errorMessage).getText();
		
	}
	}
	


