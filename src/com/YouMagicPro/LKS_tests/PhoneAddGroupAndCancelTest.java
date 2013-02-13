package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneAddGroupAndCancelTest extends TestBaseReg{
	@Test
	public void  phoneAddGroupAndCancelTest_C15354 () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=������������� ��������");//������� �� ����� "������������� ��������" � ���� �������� �������
		Thread.sleep(3000);
		selenium.click("link=�������� ������");//������� �� ������ "�������� ������"
		Thread.sleep(3000);
		selenium.type("id=edit-group-name", "g2");//���� ����� ������ ("g1")
		selenium.click("id=edit-cancel");//������� ������ "��������"
		AssertJUnit.assertFalse(selenium.isTextPresent("g2"));//��������, ���� �� �� �������� ����� "g1"
	}
}