package com.herokuapp.theinternet.LogInTest;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.CsvDataProviders;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;

public class NegativeLogInTests extends TestUtilities {

	
	@Test(priority = 1,dataProvider="csvReader",dataProviderClass=CsvDataProviders.class)
	public void negativeLogInTest(Map<String, String> testData ) {
		
		
		//data
		
		String no =testData.get("no");
		String username =testData.get("username");
		String password =testData.get("password");
		String expectedErrorMessage =testData.get("expectedMessage");
		String description =testData.get("description");
		
	
			log.info("Starting negativeTest  #" + no +  " for " + description);

		// open main page
		
		WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
		 welcomePage.openPage();
		 log.info("main page is opened");

		// Click on Form Authentication link
		
		 LoginPage login= welcomePage.clickformauthentication();
		 login.negativeLogIn(username, password);
          login.waitForErrorMessage();

		

		// Verification
		String actualErrorMessage = login.getErrorMessageText();
		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"actualErrorMessage does not contain expectedErrorMessage\nexpectedErrorMessage: "
						+ expectedErrorMessage + "\nactualErrorMessage: " + actualErrorMessage);
	}


	
}
