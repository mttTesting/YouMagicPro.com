package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilityTariffsPageTest extends TestBase{
	@Test
	public void  checkForAvaliabilityTariffsPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//div[4]/div/div/div/div/table/tbody/tr/td[2]/a");//������� �� ������ "������"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������ �� ������"));

	}

}
