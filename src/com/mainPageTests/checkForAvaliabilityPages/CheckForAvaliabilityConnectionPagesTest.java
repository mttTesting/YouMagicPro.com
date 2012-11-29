package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilityConnectionPagesTest extends TestBase{
	@Test
	public void  checkForAvaliabilityConnectionTest() throws Exception {
	selenium.open("http://umagicpro-pp.rnd.mtt/");
	selenium.waitForPageToLoad("30000");
	selenium.click("//li[4]/ul/li/a");//������� �� ������ "�����������"
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("�����������"));
	selenium.click("//li[4]/ul/li[2]/a");//������� �� ������ "���������"
	selenium.waitForPageToLoad("30000");
	selenium.click("//h1");
	AssertJUnit.assertTrue(selenium.isTextPresent("���������"));
	selenium.click("//li[4]/ul/li[3]/a");//������� �� ������ "�������� ������������"
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("�������� ������������"));
	selenium.click("//li[4]/ul/li[4]/a");//������� �� ������ "������������"
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("������������"));
	selenium.click("//li[4]/ul/li[5]/a");//������� �� ������ "����������"
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("����������"));
	selenium.click("//li[4]/ul/li[6]/a");//������� �� ������ "��������� � ������� ���"
	selenium.waitForPageToLoad("30000");
	selenium.click("css=h1");
	AssertJUnit.assertTrue(selenium.isTextPresent("��������� � ������� ���"));
	}
}
