package com.herokuapp.theinternet.pages;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage  extends BasePageObject{
	
	private By checkbox =By.xpath("//input[@type='checkbox']");

	public CheckBoxPage(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}

	
	public void selectAllCheckBoxes() {
		log.info("selecting all checkboxes");
		List<WebElement> checkboxes = findAll(checkbox);
		for (WebElement checkbox :checkboxes) {
			if(!checkbox.isSelected()) {
				checkbox.click();
			}
		}
		
		
	}
	 public boolean areAllCheckBoxesSelected() {
		 log.info("verifying all checkboxes selected");
		 List<WebElement> checkboxes = findAll(checkbox);
			for (WebElement checkbox :checkboxes) {
				if(!checkbox.isSelected()) {
					return false;
				}
				
				
	 }
			return true;	
	 }
}
