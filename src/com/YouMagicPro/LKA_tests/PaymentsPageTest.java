package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PaymentsPageTest extends TestBaseReg{
	@Test
	public void soundFilesTest() throws Exception {
		openAndLogin();

	
		selenium.click("link=�������"); //������� � ���� "�������"->"������� � ���������"
		Thread.sleep(3000);

		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-from-date-datepicker-popup-0")); //�������� ����������� �� �������� ��������������� ���������
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-to-date-datepicker-popup-0"));
		AssertJUnit.assertTrue(selenium.isElementPresent("css=b.trigger"));
	
}
}