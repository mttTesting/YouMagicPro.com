package com.YouMagicPro.LKS_tests;

import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneAddFiveNumbersForContactTest extends TestBaseReg{
	@Test
	public void  phoneAddGroupAndCancelTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=���������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		selenium.click("//div[@id='block-umagicpro_contacts-0']/div/div/table/tbody/tr/td[2]/a");//������� �� ������ "�������� �����"
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "t1");//���� ����� � 5 ������� ��� ��������
		selenium.type("id=edit-contact-telephone1", "001");
		selenium.type("id=edit-contact-telephone2", "002");
		selenium.type("id=edit-contact-telephone3", "003");
		selenium.type("id=edit-contact-telephone4", "004");
		selenium.type("id=edit-contact-telephone5", "005");
		selenium.click("id=edit-save");//������� ������ "���������"
		Thread.sleep(8000);
		selenium.click("//div[@onclick='callByContacts(\"005\"); return false;']");//������������� ������� �� 5 �������
		Thread.sleep(12000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("//div[@onclick='callByContacts(\"004\"); return false;']");
		Thread.sleep(12000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("//div[@onclick='callByContacts(\"003\"); return false;']");
		Thread.sleep(12000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("//div[@onclick='callByContacts(\"002\"); return false;']");
		Thread.sleep(12000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("link=������������� ��������");//������� �� ����� "������������� ��������" � ���� �������� �������
		Thread.sleep(5000);
		selenium.click("//td[2]/a[2]");//�������� ��������
		selenium.click("id=edit-submit");
		Thread.sleep(3000);
	}
}