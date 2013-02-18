package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnPromoTest extends TestBaseReg{
	@Test
public void clickOnPromoTest () throws Exception {	 
		openAndLogin();

		selenium.click("//div[4]/a");
		
		selenium.click("//a[contains(@href, '/promo/nojs/code-dialog')]");//������� ������ "������ ��������"
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("������� ���������� ��������"));//���������, ��� �� �������� ���� ����� "��������"
	 }

}