package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnAvatarTest extends TestBaseReg{
	@Test
public void clickOnAvatarTest () throws Exception {	 
		openAndLogin();
		selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		selenium.click("css=span.modal_cansel_button_text");
		
		selenium.click("css=img.imagecache.imagecache-customer-logo"); //���� �� ����������� YouMagic
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ��������")); //���������, ��� �� �������� ���� ����� "����������� ����������� ������� ��� �� ��������� ����� "
	 }

}