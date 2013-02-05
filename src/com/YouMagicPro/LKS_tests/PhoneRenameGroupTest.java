package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneRenameGroupTest extends TestBaseReg{
	@Test
	public void phoneRenameGroupTest_C15330 () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=������������� ��������");//������� ������ "������������� ��������"
		Thread.sleep(4000);
		selenium.click("//tr[3]/td[2]/a"); //������� �� "��������"
		Thread.sleep(4000);
		selenium.type("id=edit-group-name", "test1");//�������������� ����� ������
		selenium.click("id=edit-save");//���������
		Thread.sleep(4000);
		AssertJUnit.assertTrue(selenium.isTextPresent("test1"));//�������� ������� ������ "test1"
		selenium.click("//tr[3]/td[2]/a");//������� �� "��������"
		Thread.sleep(4000);
		selenium.type("id=edit-group-name", "test");//���� ������ ����� ������
		selenium.click("id=edit-save");//���������
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//���������
		Thread.sleep(4000);
	}
}