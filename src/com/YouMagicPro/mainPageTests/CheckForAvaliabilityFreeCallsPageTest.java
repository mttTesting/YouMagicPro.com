package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityFreeCallsPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityFreeCallsPageTest() throws Exception {
		open();
		selenium.click("//div[2]/span[2]");//������� �� ������ "5 ���������� ���������� �������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("5 ���������� ���������� �������"));
		
	}

}
