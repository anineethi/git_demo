package com.theherokuapp.theinternet.keypressestests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.KeyPressesPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;
@Test

public class KeyPressesTests extends TestUtilities{
	public void pressKeyTest() {
		log.info("Starting  PressKey test");

	
	
	
	 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
	 welcomePage.openPage();
	 KeyPressesPage keyPressesPage =welcomePage.clickKeyPressLinkLocator();
	 keyPressesPage.pressKey(Keys.ENTER);
	 
	 String result =keyPressesPage.getResultText();
	 Assert.assertTrue(result.equals("You entered: ENTER"),"result is not expected");

}
	@Test
	public void pressKeyWithActionsTest() {
		log.info("Starting  PressKeywithActions test");

		
		
		
		 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
		 welcomePage.openPage();
		 KeyPressesPage keyPressesPage =welcomePage.clickKeyPressLinkLocator();
		 keyPressesPage.pressKeyWithActions(Keys.SPACE);
		 
		 String result =keyPressesPage.getResultText();
		 Assert.assertTrue(result.equals("You entered: SPACE"),"result is not expected");

		
	}
}
