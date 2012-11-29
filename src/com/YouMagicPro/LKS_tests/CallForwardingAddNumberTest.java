package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CallForwardingAddNumberTest extends TestBaseReg{
	@Test
	public void callForwardingAddNumberTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=���������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("120000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		selenium.click("link=������������� �������");//������� ������ "������������� �������"
		Thread.sleep(5000);
		selenium.click("id=edit-schedule-add-number");//������� ������ ���������� ������
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-schedule-1-followme-number"));//�������� ������� ���������
		AssertJUnit.assertTrue(selenium.isElementPresent("id=1_always"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-schedule-1-schedule-from-week-day"));
	}
}