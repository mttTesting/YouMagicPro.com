package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AgreementOPFTest extends TestBaseReg{
	@Test
	public void addAndDeleteNoticesTest() throws Exception {
		openAndLogin();
		selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		selenium.click("css=span.modal_cansel_button_text");
		
		selenium.click("link=��������");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[2]"); //����� � ���������� ������ "���"
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[3]"); //����� � ���������� ������ "���"
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[4]"); //����� � ���������� ������ "��"
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[5]"); //����� � ���������� ������ "������"
		selenium.click("css=span.text");
		selenium.click("css=ul.dropdown > li"); //����� � ���������� ������ "���"
	}
}