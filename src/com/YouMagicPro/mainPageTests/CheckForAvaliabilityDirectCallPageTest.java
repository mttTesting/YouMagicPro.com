package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityDirectCallPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityDirectCallPageTest() throws Exception {
		open();
		selenium.click("//div[3]/ul/li/a");//������� �� ������ "������ ��������� �����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������ ��������� �����"));
	}

}
