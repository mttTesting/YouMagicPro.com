package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;


public class CheckForAvaliabilityBlackListPage extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityAboutCompanyPageTest() throws Exception {
		open();
		selenium.click("xpath=(//a[contains(text(),'������ ������')])[4]");//������� �� ������ "������ ������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������ ������"));
	}
}