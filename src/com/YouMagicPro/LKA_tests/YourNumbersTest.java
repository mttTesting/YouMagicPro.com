package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class YourNumbersTest  extends TestBaseReg{
	@Test
	public void yourNumbersTest() throws Exception {
		openAndLogin();
		selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		selenium.click("css=span.modal_cansel_button_text");
	
		selenium.click("link=���������");// ������� � ���� "���������"
		Thread.sleep(8000);
		
		AssertJUnit.assertTrue(selenium.isElementPresent("id=74997043123"));//�������� ����������� �� �������� ��������������� ���������
		AssertJUnit.assertTrue(selenium.isElementPresent("id=bFilesFind_button_text"));
		
	}
}
