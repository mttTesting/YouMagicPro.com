package com.YouMagicPro.LKS_tests;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;
import com.thoughtworks.selenium.Selenium;


public class AddAndDeleteContactTest extends TestBaseReg{
	@Test
	public void addAndDeleteContactTest () throws Exception {	
    	
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=���������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		Thread.sleep(7000);
		//selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		selenium.click("//td[2]/a");//������� ������ ���������� ��������
		Thread.sleep(7000);
		selenium.type("//div[2]/input", "x3");// ���� ������ ��������
		selenium.type("id=edit-contact-telephone1", "333");
		selenium.click("id=edit-save"); //"���������"
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isTextPresent("333")); //�������� �� ������� ������ "333" � ������� ���������
		AssertJUnit.assertTrue(selenium.isTextPresent("x3"));
		selenium.click("link=������������� ��������"); //������� �� ������ �������������� ���������
		Thread.sleep(5000);
		selenium.click("xpath=(//a[contains(text(),'��.')])[3]"); //�������� ��������
		selenium.click("id=edit-submit");//"���������"
		Thread.sleep(10000);
		AssertJUnit.assertFalse(selenium.isTextPresent("333")); //�������� �� ������� ������ "333" � ������� ���������
		
		

	}
}