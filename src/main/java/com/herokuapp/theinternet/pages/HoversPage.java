package com.herokuapp.theinternet.pages;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HoversPage extends  BasePageObject{
	
	
	private By profileLocator =By.className("figure");
	private By viewProfileLinkLocator =By.xpath(".//a[contains(text(),'View profile')]");
	
	public HoversPage(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}
	
	public void openUserProfile(int i) {
		List<WebElement> profiles= findAll(profileLocator);
		WebElement specifiedUserProfile=profiles.get(i-1);
		hoverOverElement(specifiedUserProfile);
		specifiedUserProfile.findElement(viewProfileLinkLocator).click();
		
	}

}
