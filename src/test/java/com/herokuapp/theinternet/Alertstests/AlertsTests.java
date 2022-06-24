package com.herokuapp.theinternet.Alertstests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.JavaScriptAlertsPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;

public class AlertsTests  extends TestUtilities{
	@Test
	public void jsAlertTest() {
		log.info("Starting jsAlert test");

		 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
		 welcomePage.openPage();
		 JavaScriptAlertsPage javaScriptAlertsPage = welcomePage.clickJavaScriptAlerts();
		 
		 javaScriptAlertsPage.openJSAlert();
		 // get alert text
		 String alertMessage =javaScriptAlertsPage.getAlertText();
         // click ok on alert message
		 javaScriptAlertsPage.acceptAlert();
		 String result =javaScriptAlertsPage.getResultText();
		// Verifications
			// 1 - Alert text is expected
			Assert.assertTrue(alertMessage.equals("I am a JS Alert"),
					"Alert message is not expected. \nShould be 'I am a JS Alert', but it is '" + alertMessage + "'");

			// 2 - Result text is expected
			Assert.assertTrue(result.equals("You successfully clicked an alert"),
					"result is not expected. \nShould be 'You successfuly clicked an alert', but it is '" + result + "'");
}
	@Test
	public void jsConfirmTest() {
		log.info("Starting jsConfirm test");

		 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
		 welcomePage.openPage();
		 JavaScriptAlertsPage javaScriptAlertsPage = welcomePage.clickJavaScriptAlerts();
		 
		 javaScriptAlertsPage.openJSConfirm();
		// get alert text
				 String alertMessage =javaScriptAlertsPage.getAlertText();
		         // click ok on alert message
				 javaScriptAlertsPage.dismissAlert();
				 String result =javaScriptAlertsPage.getResultText();
				// Verifications
					// 1 - Alert text is expected
					Assert.assertTrue(alertMessage.equals("I am a JS Confirm"),
							"Alert message is not expected. \nShould be 'I am a JS Confirm', but it is '" + alertMessage + "'");

					// 2 - Result text is expected
					Assert.assertTrue(result.equals("You clicked: Cancel"),
							"result is not expected. \nShould be 'You clicked: Cancel', but it is '" + result + "'");
				 
				 
	}
	@Test
	public void jsPromptTest() {
		log.info("Starting jsPrompt test");

		 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
		 welcomePage.openPage();
		 JavaScriptAlertsPage javaScriptAlertsPage = welcomePage.clickJavaScriptAlerts();
		 
		 javaScriptAlertsPage.openJSPrompt();
		// get alert text
				 String alertMessage =javaScriptAlertsPage.getAlertText();
		         // click ok on alert message
				 javaScriptAlertsPage.typeTextIntoAlert("hello,am anitha here");
				 String result =javaScriptAlertsPage.getResultText();
				 //verification
				 // 1. alert text is expected
				 
				 Assert.assertTrue(alertMessage.equals("I am a JS prompt"), "alert message is not expected");
				 // result text is expected
				 Assert.assertTrue(result.equals("You entered: hello,am anitha here"),"result is not expected");
		
		
	}
}
