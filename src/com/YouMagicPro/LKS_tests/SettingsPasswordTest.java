package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class SettingsPasswordTest  extends TestBaseReg{
	@Test
	public void settingsPasswordTest_C15279 () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=���������");//������� � ���� "���������"
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("��� ������ ********"));//�������� ������� �� �������� ������ "��� ������ ********"
	}
}