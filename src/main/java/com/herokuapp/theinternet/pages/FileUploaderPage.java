package com.herokuapp.theinternet.pages;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage extends  BasePageObject{
	
	private By choseFileFieldLocator =By.id("file-upload");
	private By uploadButtonLocator =By.id("file-submit");
	private By uploadedFilesLocator =By.id("uploaded-files");
	
	public FileUploaderPage(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}
	
	public void selectFile (String fileName) {
		log.info(" selecting the file ");
		String filepath ="C://Users//NeethiAni//eclipse-workspace1//advanced-selenium-webdriver-1//BEGINNING//advanced-selenium-webdriver//src//main//resources//files//logo.png";
	    type (filepath,choseFileFieldLocator);
	    log.info("file selected");
	}
	
	public void pushUploadButton() {
		log.info("clicking upload button");
		click(uploadButtonLocator );
	}
    public String getUploadedFilesNames() {
    	String names= find(uploadedFilesLocator).getText();
    	log.info("upload file:"+ names);
    	return names;
    }
}
