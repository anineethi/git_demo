package com.herokuapp.theinternet.pages;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DragAndDropPage  extends  BasePageObject{
	private By columnA = By.id("column-a");
	private By columnB = By.id("column-b");
	
	
	public DragAndDropPage(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}
	 public void dragAToB() {
		 log.info("drag and drop A box to B box");
		 performDragAndDrop(columnA,columnB);
	 }
	 
	 
	 public String getColumnAText() {
		 String text =find(columnA).getText();
		 log.info("column A Text:"+text);
		 return text;
	 }
	 public String getColumnBText() {
		 String text =find(columnB).getText();
		 log.info("column B Text:"+text);
		 return text;
	 }


}
