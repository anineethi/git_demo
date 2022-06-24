package com.herokuapp.theinternet.windowstests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.MultipleWindowsPage;
import com.herokuapp.theinternet.pages.NewWindowPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;


public class WindowsTests extends TestUtilities {
	@Test
	public void newWindowTest() {
		log.info("Starting newWindow test");

		 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
		 welcomePage.openPage();
		 MultipleWindowsPage windowsPage =welcomePage.clickMultipleWindowsLink();
		 windowsPage.openNewWindow(); 
		 sleep(1000);
		 // switch to new window page
		 NewWindowPage newWindowPage =windowsPage.switchToNewWindowPage();
		 
		 String pageSource =newWindowPage.getCurrentPageSource();
		 
		 //verification of new window page contains text
		 
		 Assert.assertTrue(pageSource.contains("New Window"),"new page doesn't contains expected text");
}
}
