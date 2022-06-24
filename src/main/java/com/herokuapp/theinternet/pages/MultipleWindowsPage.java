package com.herokuapp.theinternet.pages;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MultipleWindowsPage extends BasePageObject {
	private By clickHereLinkLocator=By.linkText("Click Here");
	public MultipleWindowsPage(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}
	public void openNewWindow() {
		log.info("clicking 'click here' link");
		click(clickHereLinkLocator);
		
	}
	public NewWindowPage switchToNewWindowPage() {
		log.info("looking for 'new window' page");
		switchToNewWindowWithTitle("New Window");
		return new NewWindowPage(driver,log);
	}

}
