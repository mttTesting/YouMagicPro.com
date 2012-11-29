package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class HistoryPageTest  extends TestBaseReg{
	@Test
	public void historyPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=���������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		selenium.click("//div/span[3]/a");//������� �� ������ "�������"
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-from-date-datepicker-popup-0"));//�������� ������� ���������
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-to-date-datepicker-popup-0"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-account-filter"));
	}

}