package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityDocumentsPageTest extends TestBaseReg{
		@Test
		public void  checkForAvaliabilityDocumentsPageTest() throws Exception {
			open();
			selenium.click("//h6[3]/a");//������� �� ������ "���������"
			selenium.waitForPageToLoad("30000");
			AssertJUnit.assertTrue(selenium.isTextPresent("���������"));
			
		}
}
