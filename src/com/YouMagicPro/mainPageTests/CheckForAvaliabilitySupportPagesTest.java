package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilitySupportPagesTest extends TestBaseReg{
	@Test
	public void checkForAvaliabilitySupportPagesTest() throws Exception {
		open();
		selenium.click("//li[5]/ul/li/a");//������� �� ������ "�������� �����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("�������� �����"));
		selenium.click("//li[5]/ul/li[2]/a");//������� �� ������ "����� �������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����� �������"));
		selenium.click("//li[5]/ul/li[3]/a");//������� �� ������ "��������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������"));
	}
}
