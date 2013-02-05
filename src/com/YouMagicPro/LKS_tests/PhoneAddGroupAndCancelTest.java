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
		selenium.type("//div[2]/input", "g2");//���� ����� ������ ("g1")
		selenium.click("css=a.bPopup__eClose.close");//������� ������ "��������"
		selenium.click("//div[@id='contacts-block-wrapper']/dl[2]/dt/div");
		AssertJUnit.assertFalse(selenium.isTextPresent("g2"));//��������, ���� �� �� �������� ����� "g1"
	}
}