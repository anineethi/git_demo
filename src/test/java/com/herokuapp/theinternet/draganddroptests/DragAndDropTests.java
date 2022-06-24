package com.herokuapp.theinternet.draganddroptests;

import com.herokuapp.theinternet.base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.pages.DragAndDropPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;
@Test
public class DragAndDropTests extends TestUtilities{
	
	public void DragAToBTest() {
		log.info("Starting  Drag A to Btest");

	 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
	 welcomePage.openPage();
	 
	 // opening drag and drop page
	 DragAndDropPage dragAndDropPage =welcomePage.clickDragAndDropLinkLocator();
	 // drag and drop box A to box B
	 dragAndDropPage.dragAToB();
	 
	 //getting column A text
	 String columnAtext=dragAndDropPage.getColumnAText();
	 Assert.assertTrue(columnAtext.equals("B"), "column A  header should be 'B'" );
	 
	 //getting column B Text
	 
	 String columnBtext=dragAndDropPage.getColumnBText();
	 Assert.assertTrue(columnBtext.equals("A"), "column B header should be 'A'" );
	 
	 
			 
}
}
