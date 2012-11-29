package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class FilesFreeSpacePageTest  extends TestBaseReg{
	@Test
	public void filesFreeSpaceTest() throws Exception {
		openAndLogin();
		selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		selenium.click("css=span.modal_cansel_button_text");
		
		selenium.click("//div[4]/a"); //������� � ���� "�����"->"��� �����"
		selenium.click("//div/span[3]/a");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=free_space_all")); //��������, ������������ �� �� �������� ������� id=free_space_all
	}
}