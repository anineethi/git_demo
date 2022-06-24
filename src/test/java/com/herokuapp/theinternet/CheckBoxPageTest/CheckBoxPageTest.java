package com.herokuapp.theinternet.CheckBoxPageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.CheckBoxPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;

public class CheckBoxPageTest  extends TestUtilities{
	@Test
	public void selectingCheckBoxTest() {
		log.info("Starting CheckBox test");

		 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
		 welcomePage.openPage();
		 CheckBoxPage checkBoxPage = welcomePage.clickCheckBoxPageLink();
		 
			checkBoxPage.selectAllCheckBoxes();	 
			Assert.assertTrue(checkBoxPage.areAllCheckBoxesSelected(), "all checkboxes are not selected");
		
	}

}
