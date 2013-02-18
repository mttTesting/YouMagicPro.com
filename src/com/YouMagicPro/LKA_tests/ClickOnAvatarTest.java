package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnAvatarTest extends TestBaseReg{
	@Test
public void clickOnAvatarTest () throws Exception {	 
		openAndLogin();

		selenium.click("css=img.imagecache.imagecache-customer-logo"); //���� �� ����������� YouMagic
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ��������")); //���������, ��� �� �������� ���� ����� "����������� ����������� ������� ��� �� ��������� ����� "
	 }

}