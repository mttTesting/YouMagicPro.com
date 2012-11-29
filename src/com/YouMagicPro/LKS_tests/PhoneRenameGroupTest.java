package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneRenameGroupTest extends TestBaseReg{
	@Test
	public void settingsPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=���������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		selenium.click("link=������������� ��������");//������� ������ "������������� ��������"
		Thread.sleep(4000);
		selenium.click("//tr[2]/td[2]/a"); //������� �� "��������"
		Thread.sleep(4000);
		selenium.type("id=edit-group-name", "test1");//�������������� ����� ������
		selenium.click("id=edit-save");//���������
		Thread.sleep(4000);
		AssertJUnit.assertTrue(selenium.isTextPresent("test1"));//�������� ������� ������ "test1"
		selenium.click("//tr[2]/td[2]/a");//������� �� "��������"
		Thread.sleep(4000);
		selenium.type("id=edit-group-name", "test");//���� ������ ����� ������
		selenium.click("id=edit-save");//���������
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//���������
		Thread.sleep(4000);
	}
}