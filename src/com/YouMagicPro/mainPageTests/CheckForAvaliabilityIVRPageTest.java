package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityIVRPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityIVRPageTest() throws Exception {
		open();
		selenium.click("//div[4]/div/table/tbody/tr/td[2]/h3/a");//������� �� ������ "��������� ���� (IVR)"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ���� (IVR)"));
		
	}

}
