package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityGroupsPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityGroupsPageTest() throws Exception {
		open();
		selenium.click("//div[2]/div/table/tbody/tr/td[2]/h3/a");//������� �� ������ "��������� ����������� � �����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ����������� � �����"));

	}

}
