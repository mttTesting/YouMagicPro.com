package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityFiveNumbersPageTest  extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityFiveNumbersPageTest() throws Exception {
		open();
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[2]/span[2]");//������� �� ������ "5 ���������� ���������� �������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("5 ���������� ���������� �������"));

	}

}
