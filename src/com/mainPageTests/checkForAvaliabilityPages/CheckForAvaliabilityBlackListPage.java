package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;


public class CheckForAvaliabilityBlackListPage extends TestBase{
	@Test
	public void  checkForAvaliabilityAboutCompanyPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("xpath=(//a[contains(text(),'������ ������')])[4]");//������� �� ������ "������ ������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������ ������"));
	}
}