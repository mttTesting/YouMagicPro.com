package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsPageTest  extends TestBaseReg{
	@Test
	public void settingsPageTest () throws Exception {	 
		openAndLoginLKS();
		
		selenium.click("//span[4]/a");//������� � ���� "���������"
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-user-password"));//��������, ������������ �� �� �������� �������� id=edit-user-password, id=edit-submit , css=div.block_for_a_instr > a
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-pass1"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-pass2"));
	}

}