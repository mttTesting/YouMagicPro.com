package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityFastRegistrationPageTest  extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityFastRegistrationPageTest() throws Exception {
		open();
		selenium.click("//div[3]/div/div/div/div/table/tbody/tr/td[2]/a");//������� �� ������ "������� ������ �����������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� ������ �����������"));
	}
}
