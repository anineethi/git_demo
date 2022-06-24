package com.herokuapp.theinternet.hoverstests;
import com.herokuapp.theinternet.base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.pages.HoversPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;
@Test
public class HoversTests extends TestUtilities{
	public void user2ProfileTest() {
		log.info("Starting user 2 profile test");

	 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
	 welcomePage.openPage();
	 
	 //opening hovers page
	 
	 HoversPage hoversPage =welcomePage.clickHoversLinkLocator();
	 // opening user 2 profile
	 
	 hoversPage.openUserProfile(2);
	 
	 Assert.assertTrue( hoversPage.getCurrentUrl().contains("/users/2"),"opened  profile page is not as selected profile page");
}
}
