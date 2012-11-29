package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilitySupportPagesTest extends TestBase{
	@Test
	public void checkForAvaliabilitySupportPagesTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");

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
