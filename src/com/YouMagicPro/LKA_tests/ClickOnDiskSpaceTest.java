package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnDiskSpaceTest extends TestBaseReg{
	@Test
public void clickOnDiskSpaceTest () throws Exception {	 
		openAndLogin();

		selenium.click("css=a > span.lMenuBlocks__hrefs"); //������� ������ �� ��������� ������ �� �����
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=free_space_all"));//���������, ��� �� �������� ���� �����  � �������� ������
	 }
}