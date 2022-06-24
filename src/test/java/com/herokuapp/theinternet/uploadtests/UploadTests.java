package com.herokuapp.theinternet.uploadtests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.FileUploaderPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;
@Test(dataProvider="files")

public class UploadTests extends TestUtilities{
	public void fileUploadTest(int no,String fileName) {
		log.info("Starting  file Upload test");

	 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
	 welcomePage.openPage();
	 FileUploaderPage fileUploadPage =welcomePage.clickFileUploadLinkLocator();
	 
	 //select file
	 
	 fileUploadPage.selectFile(fileName);
	 
	 //push upload button
	 fileUploadPage.pushUploadButton();
	 
	 String fileNames =fileUploadPage.getUploadedFilesNames();
	 Assert.assertTrue(fileNames.contains(fileNames),"this file is not the uploaded file");

}
}
