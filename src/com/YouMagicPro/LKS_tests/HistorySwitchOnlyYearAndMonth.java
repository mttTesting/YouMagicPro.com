package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class HistorySwitchOnlyYearAndMonth extends TestBaseReg{
	@Test
	public void historyPageTest () throws Exception {	 
		openAndLoginLKS();
		
		selenium.click("link=�������"); //������� �� ������ "�������"
		Thread.sleep(3000);
		selenium.click("id=edit-from-date-datepicker-popup-0");//������� �� ������ ����
		selenium.click("//tbody[3]/tr[2]/td[3]/a/span");
		selenium.click("id=edit-from-date-datepicker-popup-0");//����� ����
		selenium.click("css=th.datepickerGoPrev > a > span");
		selenium.click("css=th.datepickerGoPrev > a > span");
		selenium.click("id=edit-from-date-datepicker-popup-0");//����� ������
		selenium.click("link=���");//
		selenium.click("id=edit-from-date-datepicker-popup-0");//����� ���
		AssertJUnit.assertEquals(selenium.getValue("id=edit-from-date-datepicker-popup-0"), "2013-01-01"); //��������
	}
}