package com.YouMagicPro.LKS_tests;

import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class HistoryCalendarWorkingTest extends TestBaseReg{
	@Test
	public void historyCalendarWorkingTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=���������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		Thread.sleep(30000);
		selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		selenium.click("//div/span[3]/a");//������� �� ������ "�������"
		Thread.sleep(5000);
		selenium.click("id=edit-from-date-datepicker-popup-0");//�������� ����������������� ���������
		selenium.click("//tbody[3]/tr[2]/td[3]/a/span");
		selenium.click("//tr[2]/td[3]/a/span");
		selenium.click("//tr[3]/td[5]/a/span");
	}
}
