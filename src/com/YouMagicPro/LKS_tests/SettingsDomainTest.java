package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class SettingsDomainTest  extends TestBaseReg{
	@Test
	public void settingsDomainTest_C15280 () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=���������");//������� � ���� "���������"
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("voip.mtt.ru"));//�������� ������� �� �������� ������ "��� ������ ********"
	}
}