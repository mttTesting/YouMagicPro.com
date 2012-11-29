package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



//10. �������� ����������� ������� ���� "����"
public class CheckForAvaliabilityPricesPagesTest extends TestBaseReg{
	@Test
	public void checkForAvaliabilityPricesPageTest() throws Exception {
	open();
	
	selenium.click("//li[2]/ul/li/a");//������� �� ������ "�������� ������"
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("�������� ������"));
	selenium.click("//li[2]/ul/li[2]/a");//������� �� ������ "������ �� ������"
	selenium.waitForPageToLoad("30000");
	selenium.click("//div[@id='ipBlock-seccion01']/div[2]/h1");
	AssertJUnit.assertTrue(selenium.isTextPresent("������ �� ������"));
	selenium.click("//li[2]/ul/li[3]/a");//������� �� ������ "����������� ����� � ������ ������"
	selenium.waitForPageToLoad("30000");
	selenium.click("//div[@id='ipBlock-seccion01']/div/h1");
	AssertJUnit.assertTrue(selenium.isTextPresent("����������� ����� � ������ ������"));
	selenium.click("//li[2]/ul/li[4]/a");
	selenium.waitForPageToLoad("30000");
	selenium.click("//div[@id='ipBlock-seccion01']/div/h1");//������� �� ������ "�������� ������������"
	AssertJUnit.assertTrue(selenium.isTextPresent("�������� ������������"));
	selenium.click("//li[2]/ul/li[5]/a");
	selenium.waitForPageToLoad("30000");
	selenium.click("//div[@id='ipBlock-seccion06']/div/h1");//������� �� ������ "��������� ������������"
	AssertJUnit.assertTrue(selenium.isTextPresent("��������� ������������"));
	selenium.click("//li[2]/ul/li[6]/a");//������� �� ������ "�������� ����������"
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("�������� ����������"));
	selenium.click("//li[2]/ul/li[7]/a");//������� �� ������ "��������� � ������� ���"
	selenium.waitForPageToLoad("30000");
	selenium.click("//div[@id='ipBlock-seccion01']/div/h1");
	AssertJUnit.assertTrue(selenium.isTextPresent("��������� � ������� ���"));
	
	}
}
