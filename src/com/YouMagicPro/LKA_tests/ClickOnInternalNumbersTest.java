package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnInternalNumbersTest extends TestBaseReg{
	@Test
public void clickOnInternalNumbersTest () throws Exception {	 
		openAndLogin();
		selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		selenium.click("css=span.modal_cansel_button_text");
		selenium.click("//div[4]/a");

		
		selenium.click("//div[8]/div/span/a"); //������� ������ � ������� ��������
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("���� ������")); //���������, ��� �� �������� ���� ����� "���� ������"

	 }
}