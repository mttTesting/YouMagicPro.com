package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneCreateEmptyNameGroupTest extends TestBaseReg{
	@Test
	public void  phoneCreateAndDeleteGroupTest_C15327 () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=������������� ��������");//������� �� ����� "������������� ��������" � ���� �������� �������
		Thread.sleep(15000);
		selenium.click("link=�������� ������");//������� �� ������ "�������� ������"
		Thread.sleep(3000);
		selenium.click("id=edit-save");//������� ������ "���������"
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("���"));//��������, ���� �� �� �������� ����� "���" (������� ����, ��� ���������� ����������)

	}
}