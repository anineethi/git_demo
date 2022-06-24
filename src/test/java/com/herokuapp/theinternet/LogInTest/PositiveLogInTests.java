package com.herokuapp.theinternet.LogInTest;


import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.SecureAreaPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;

public class PositiveLogInTests extends  TestUtilities {

	@Test
	public void logInTest() {
		log.info("Starting logIn test");

		 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
		 welcomePage.openPage();
		 takeScreenshot("welcome page is opened");
		 LoginPage login= welcomePage.clickformauthentication();
		 takeScreenshot("login page is opened");
		 
		 //adding a new cookie
		 
		 Cookie ck =new Cookie("username","tomsmith","the-internet.herokuapp.com","/",null);
		 login.setCookie(ck);
		 
		  SecureAreaPage  secureAreaPage =login.logIn("tomsmith","SuperSecretPassword!" );
		  takeScreenshot("secure page is opened");
		  
		  //get cookies
		  String username =secureAreaPage.getCookie("username");
		  log.info("username cookie :" + username);
		  String session =secureAreaPage.getCookie("rack.session");
		  log.info("session cookie :" + session);
		
		

		// verifications
		// new url
		
		
		Assert.assertEquals(secureAreaPage.getCurrentUrl(), secureAreaPage.getPageUrl());

		// log out button is visible
		Assert.assertTrue(secureAreaPage.isLogOutButtonVisible(),"logOutButton is not visible.");

		// Successful log in message
		String expectedSuccessMessage = "You logged into a secure area!";
		String actualSuccessMessage = secureAreaPage.getSuccessMessageText();
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
				"actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
						+ expectedSuccessMessage + "\nactualSuccessMessage: " + actualSuccessMessage);

	

	}
}
