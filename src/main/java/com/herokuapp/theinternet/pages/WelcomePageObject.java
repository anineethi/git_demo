package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {
	
	

      String pageUrl ="https://the-internet.herokuapp.com/";
	 private  By formAuthenicationLinkLocator = By.linkText("Form Authentication");
	 private By checkBoxLinkLocator =By.linkText("Checkboxes");
	 private By dropdownLinkLocator =By.linkText("Dropdown");
	 private By javaScriptAlertsLinkLocator=By.linkText("JavaScript Alerts");
	 private By multipleWindowsLinkLocator =By.linkText("Multiple Windows");
	 private By clickEditorLinkLocator =By.linkText("WYSIWYG Editor");
	 private By keyPressesLinkLocator =By.linkText("Key Presses");
	 private By fileUploadLinkLocator =By.linkText("File Upload");
	 private By dragAndDropLinkLocator =By.linkText("Drag and Drop");
	 private By hoversLinkLocator =By.linkText("Hovers");
	 private By horizontalSliderLinkLocator =By.linkText("Horizontal Slider");
	 private By jsErrorLinkLocator =By.linkText("JavaScript onload event error");
	 
	public WelcomePageObject(WebDriver driver,Logger log) {
		
		super(driver,log);
		
	}
	public void openPage() {
		log.info("open page:"+ pageUrl);
		openUrl(pageUrl);
		log.info("page opened!");
	}
	
	public LoginPage clickformauthentication() {
		log.info("click on form authentication link");
		click(formAuthenicationLinkLocator);
		return  new LoginPage(driver,log);
	}
	public CheckBoxPage clickCheckBoxPageLink() {
		log.info("click on checkbox link");
		click(checkBoxLinkLocator);
		return new  CheckBoxPage(driver,log);
	}
	public DropdownPage clickDropdownPageLink() {
		log.info("click on Dropdown link");
		click(dropdownLinkLocator);
		return new  DropdownPage(driver,log);
	}
	public JavaScriptAlertsPage clickJavaScriptAlerts() {
		log.info("click on javascriptalerts link");
		click(javaScriptAlertsLinkLocator);
		return new JavaScriptAlertsPage(driver,log);
	}
	public MultipleWindowsPage clickMultipleWindowsLink() {
		log.info("click on MultipleWindows link");
		click(multipleWindowsLinkLocator);
		return new MultipleWindowsPage(driver,log);
	}
	public EditorPage clickWYSIWYGEditorLink() {
		log.info("click on WYSIWYG Editor link");
		click(clickEditorLinkLocator );
		return new EditorPage (driver,log);
		
		
	}
	public KeyPressesPage clickKeyPressLinkLocator() {
		log.info("click on Key Presses link");
		click(keyPressesLinkLocator);
		return new KeyPressesPage (driver,log);
		
		
	}
	public FileUploaderPage clickFileUploadLinkLocator() {
		log.info("click on File Upload link");
		click(fileUploadLinkLocator);
		return new FileUploaderPage (driver,log);
		
		
	}
	
	public DragAndDropPage clickDragAndDropLinkLocator() {
		log.info("click on drag and drop link");
		click(dragAndDropLinkLocator);
		return new  DragAndDropPage(driver,log);
		
	}
	public HoversPage clickHoversLinkLocator() {
		log.info("click on hovers page link");
		click(hoversLinkLocator);
		return new   HoversPage(driver,log);
		
	}
	public HorizontalSliderPage clickHorizontalSliderLinkLocator() {
		log.info("click on horizontal slider page link");
		click(horizontalSliderLinkLocator);
		return new   HorizontalSliderPage(driver,log);
	}
	public JSErrorPage  clickJSErrorLinkLocator() {
		log.info("click on javascript onload event error page link");
		click(jsErrorLinkLocator);
		return new    JSErrorPage  (driver,log);
	}

	}
	

