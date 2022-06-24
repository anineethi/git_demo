package com.herokuapp.theinternet.horizontalslidertests;
import com.herokuapp.theinternet.base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.pages.HorizontalSliderPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;
@Test

	

public class HorizontalSliderTests extends TestUtilities{
	public void sliderTest() {
		log.info("Starting  slider test");

	 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
	 welcomePage.openPage();
	 
	 // opening horizontal slider page
	 HorizontalSliderPage horizontalSliderPage = welcomePage.clickHorizontalSliderLinkLocator();
	 
	 String value ="3.5";
	 // moving the slider to 3.5
	 
	 horizontalSliderPage.setSliderTo(value);
	 
	 //getting slider value 
	 
	 String sliderValue= horizontalSliderPage.getSliderValue();
	 Assert.assertTrue(sliderValue.contains("3.5"),"slider value is not as expected");
	 
	 

}
}
