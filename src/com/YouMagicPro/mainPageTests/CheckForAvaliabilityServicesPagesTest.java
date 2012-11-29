package com.YouMagicPro.mainPageTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import com.registration.tests.TestBaseReg;



//10. �������� ����������� ������� ���� "������"
public class CheckForAvaliabilityServicesPagesTest extends TestBaseReg{
	@Test
	public void checkForAvaliabilityServicesPageTest() throws Exception {
		open();
		selenium.click("//li[3]/ul/li/a");//������� �� ������ "������ ��������� �����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������ ��������� �����"));
		selenium.click("//li[3]/ul/li[3]/a");//������� �� ������ "��������� ����������� � �����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ����������� � �����"));
		selenium.click("//li[3]/ul/li[5]/a");//������� �� ������ "��������� �����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ����� (Voice to Email)"));
		selenium.click("//li[3]/ul/li[7]/a");//������� �� ������ "��������� �������� �������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� �������� �������"));
		selenium.click("//li[3]/ul/li[9]/a");//������� �� ������ "��������� ����������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ����������"));
		selenium.click("//li[3]/ul/li[11]/a");//������� �� ������ "������ ������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������ ������"));
		selenium.click("//li[3]/ul/li[2]/a");//������� �� ������ "�������������� ����������..."
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("�������������� ����������"));
		selenium.click("//li[3]/ul/li[4]/a");//������� �� ������ "��������� ����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ����"));
		selenium.click("//li[3]/ul/li[6]/a");//������� �� ������ "����������� ����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� ����"));
		selenium.click("//li[3]/ul/li[8]/a");//������� �� ������ "�������������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("�������������"));
		selenium.click("//li[3]/ul/li[10]/a");//������� �� ������ "������� � ����������� �������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� � ����������� �������"));
		selenium.click("//li[3]/ul/li[12]/a");//������� �� ������ "��������� � ������� ���"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� � ������� ���"));
	}

}
