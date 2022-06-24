package com.herokuapp.theinternet.editortests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.EditorPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;

@Test
public class EditorPageTests extends TestUtilities {
	public void defaultEditorValueText() {
		log.info("Starting  defaultEditorValueText test");

		 WelcomePageObject welcomePage =new  WelcomePageObject(driver,log);
		 welcomePage.openPage();
		 sleep(1000);
		 welcomePage.scrollToBottom();
		 sleep(1000);
         EditorPage editorPage =welcomePage.clickWYSIWYGEditorLink();
         
         String editorText =editorPage.getEditorText();
         //verification
         Assert.assertTrue(editorText.equals("Your content goes here."),"this is not editor default text");
}
}
