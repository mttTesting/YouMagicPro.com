package com.YouMagicPro.LKS_tests;

import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PhoneAddNumberToContactTest extends TestBaseReg{
	@Test
	public void  phoneAddNumberToContactTest_C15321 () throws Exception {	 
		openAndLoginLKS();

		selenium.click("//td[2]/a");//������� ������ ���������� ��������
		Thread.sleep(7000);
		selenium.type("//form/div/div/div[2]/input", "y1");// ���� ������ ��������
		selenium.type("id=edit-contact-telephone1", "1");
		selenium.click("id=edit-save"); //"���������"
		Thread.sleep(4000);
		
		selenium.click("//div[4]/nobr/a");
		Thread.sleep(4000);
		selenium.click("//tr[4]/td[2]/a");
		Thread.sleep(4000);	
		
		selenium.type("id=edit-contact-telephone2", "333");//���������� ������
		selenium.click("id=edit-save");//������� ������ "���������"
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//������� ������ "���������"
		Thread.sleep(4000);
		
		
		selenium.click("//div[4]/nobr/a");
		Thread.sleep(4000);
		selenium.click("//td[2]/a[2]");
		Thread.sleep(3000);
		selenium.click("xpath=(//input[@id='edit-submit'])[2]");
		Thread.sleep(3000);
		
	}
}