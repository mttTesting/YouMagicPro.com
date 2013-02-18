package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnPasswordChangeTest extends TestBaseReg{
	@Test
public void clickOnPasswordChangeTest_C15122 () throws Exception {	 
		openAndLogin();

		selenium.click("//div[4]/a");
		
		selenium.click("//a[contains(text(),'������� ������')]"); //������� ������ "������� ������"
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("������ ������")); //���������, ��� �� �������� ���� ����� "������ ������ "
	}
}