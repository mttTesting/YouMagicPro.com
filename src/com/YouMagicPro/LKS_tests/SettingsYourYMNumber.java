package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class SettingsYourYMNumber extends TestBaseReg{
	@Test
	public void settingsYourYMNumber_C15278 () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=���������");//������� � ���� "���������"
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isElementPresent("css=div.bCSTable__eLine"));//�������� ������� �������� �� ��������
	}
}