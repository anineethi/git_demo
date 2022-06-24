package com.herokuapp.theinternet.pages;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;






public class JavaScriptAlertsPage extends BasePageObject {
	private By jsAlertsButtonLocator =By.xpath("//button[text()='Click for JS Alert']");
	private By jsConfirmButtonLocator= By.xpath("//button[text()='Click for JS Confirm']");
	private By jsPromptButtonLocator =By.xpath("//button[text()='Click for JS Prompt']");
	private By resultTextLocator =By.id("result");
	
	public JavaScriptAlertsPage(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}
public void openJSAlert() {
	log.info("clicking on 'click for JS alert' button");
	click(jsAlertsButtonLocator);
	
}
public void openJSConfirm() {
	log.info("clicking on 'click for JS confirm' button");
	click(jsConfirmButtonLocator);
	
}
public void openJSPrompt() {
	log.info("clicking on 'click for JS Prompt' button");
	click(jsPromptButtonLocator);
}
public String getAlertText() {
	Alert alert = switchToAlert();
	String AlertText =alert.getText();
	log.info("alert says :"+ AlertText);
	return(AlertText);
}
 public void acceptAlert() {
	 log.info("switching to alert and pressing Ok");
	 Alert alert = switchToAlert();
	 alert.accept();
 }
public void dismissAlert() {
	log.info("switching to alert and pressing cancel");
	 Alert alert = switchToAlert();
	 alert.dismiss();
	
}
public void typeTextIntoAlert(String text) {
	log.info("switching to alert and typing text");
	 Alert alert = switchToAlert();
	 alert.sendKeys(text);
	 alert.accept();
	
}
public String getResultText() {
	String result = find(resultTextLocator).getText();
	log.info("result text" +result);
	return result;
	
}

}
