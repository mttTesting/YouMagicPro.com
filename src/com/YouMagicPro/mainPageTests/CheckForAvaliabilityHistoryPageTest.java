package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityHistoryPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityHistoryPageTest() throws Exception {
		open();
		selenium.click("id=s3");
		selenium.click("//div[3]/div[3]/div/table/tbody/tr/td[2]/h3/a");//������� �� ������ "������� � ����������� �������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� � ����������� �������"));
		
	}

}
