package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityContactsPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityContactsPageTest() throws Exception {
		open();
		selenium.waitForPageToLoad("30000");
		selenium.click("//h6[2]/a");//������� �� ������ "��������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������"));
	}

}
