package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsPageTest  extends TestBaseReg{
	@Test
	public void settingsPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=���������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		
		selenium.click("//span[4]/a");//������� � ���� "���������"
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-user-password"));//��������, ������������ �� �� �������� �������� id=edit-user-password, id=edit-submit , css=div.block_for_a_instr > a
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-pass1"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-pass2"));
	}

}