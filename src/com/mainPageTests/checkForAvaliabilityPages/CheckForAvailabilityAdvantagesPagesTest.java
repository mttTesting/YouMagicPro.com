package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

//9. �������� ����������� ������� ���� "������������"
public class CheckForAvailabilityAdvantagesPagesTest extends TestBase{
	@Test
	public void  checkForAvailabilityAdvantagesPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("//li/ul/li/a"); //������ �� ������ "������������ " -> "����������� ��� ��� �������� �� �������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� ��� ��� �������� �� �������"));
		selenium.click("//li/ul/li[3]/a");//������ �� ������ "������������ " -> "����������� �������������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� �������������"));
		selenium.click("//li/ul/li[5]/a");//������ �� ������ "������������ " -> "������������ ������ ������� ����������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������������ ������ ������� ����������"));
		selenium.click("//li/ul/li[7]/a");//������ �� ������ "������������ " -> "������������ ������������� ������������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������������ ������������� ������������"));
		selenium.click("//li/ul/li[9]/a");//������ �� ������ "������������ " -> "5 ���������� ���������� �������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("5 ���������� ���������� �������"));
		selenium.click("//li/ul/li[11]/a");//������ �� ������ "������������ " -> "������� ������� ��������������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� ������� ��������������"));
		selenium.click("//li/ul/li[13]/a");//������ �� ������ "������������ " -> "����������������� ���������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������������� ���������"));
		selenium.click("//li/ul/li[2]/a");//������ �� ������ "������������ " -> "���������� ������ ������ ����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("���������� ������ ������ ����"));
		selenium.click("//li/ul/li[4]/a");//������ �� ������ "������������ " -> "������� �������� �����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� �������� �����"));
		selenium.click("//li/ul/li[6]/a");//������ �� ������ "������������ " -> "����������� � ����� ����� � � ����� �����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� � ����� ����� � � ����� �����"));
		selenium.click("//li/ul/li[8]/a");//������ �� ������ "������������ " -> "������� ������ �����������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� ������ �����������"));
		selenium.click("//li/ul/li[10]/a");//������ �� ������ "������������ " -> "��������� ������ ����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ������ ����"));
		selenium.click("//li/ul/li[12]/a");//������ �� ������ "������������ " -> "����������� �� ���� �����������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� �� ���� �����������"));
		selenium.click("//li/ul/li[14]/a");//������ �� ������ "������������ " -> "��������� � ������� ���"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� � ������� ���"));	
	}

}
