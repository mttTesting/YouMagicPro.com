package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AgreementOPFTest extends TestBaseReg{
	@Test
	public void agreementOPFTest_C14983() throws Exception {
		openAndLogin();

		selenium.click("link=��������");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[2]"); //����� � ���������� ������ "���"
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[3]"); //����� � ���������� ������ "���"
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[4]"); //����� � ���������� ������ "��"
		selenium.click("css=span.text");
		selenium.click("css=ul.dropdown > li"); //����� � ���������� ������ "���"
	}
}