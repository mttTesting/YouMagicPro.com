package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneChangeContactFirstNameTest extends TestBaseReg{
	@Test
	public void  phoneCreateAndDeleteGroupTest () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=������������� ��������");//������� �� ����� ���� "�������������� ���������"
		Thread.sleep(4000);
		selenium.click("xpath=(//a[contains(text(),'���.')])[2]");//������� �� ������ �������������� ��������
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "B1");//�������� ������� ("B1")
		selenium.click("id=edit-save");//���������
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//���������
		Thread.sleep(4000);
		AssertJUnit.assertTrue(selenium.isTextPresent("B1"));//�������� ���������� ��������
		selenium.click("link=������������� ��������");//������� �� ����� ���� "�������������� ���������"
		Thread.sleep(4000);
		selenium.click("xpath=(//a[contains(text(),'���.')])[2]");//������� �� ������ �������������� ��������
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "x1");//�������� ��� ��������
		selenium.click("id=edit-save");//���������
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//���������
		Thread.sleep(4000);
	}
}