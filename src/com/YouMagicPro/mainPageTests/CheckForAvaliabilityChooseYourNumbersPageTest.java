package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityChooseYourNumbersPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityAboutCompanyPageTest() throws Exception {
		open();
		selenium.click("//div[3]/div/div/span[2]");//������� �� ������ "�������� ������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("�������� ������"));

	}
}