package com.herokuapp.theinternet.jserrortests;

import com.herokuapp.theinternet.base.TestUtilities;

import java.util.List;

import org.openqa.selenium.logging.LogEntry;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.herokuapp.theinternet.pages.JSErrorPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;

@Test
public class JSErrorTests extends  TestUtilities{
	
	public void jsErrorTest() {
		log.info("starting js error Test");
		SoftAssert softAssert =new SoftAssert();
		WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
		welcomePage.openPage();
		
		JSErrorPage jsErrorPage =welcomePage.clickJSErrorLinkLocator();
		//get logs
		List<LogEntry> logs =getBrowserLogs();
		
		for (LogEntry logEntry:logs) {
			if(logEntry.getLevel().toString().equals("SEVERE")) {
				softAssert.fail("severe error:"+logEntry.getMessage());
			}
		}
		softAssert.assertAll();
	}

}
