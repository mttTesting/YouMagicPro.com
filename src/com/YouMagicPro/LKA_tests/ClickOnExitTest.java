package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnExitTest extends TestBaseReg{
	@Test
public void clickOnExitTest () throws Exception {	 
		openAndLogin();
		selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		selenium.click("css=span.modal_cansel_button_text");
		
		//selenium.click("//td[2]/div/span"); 
		//selenium.click("//div[4]/a");
		
		selenium.click("css=span.logout_user > a"); //���� �� ������ "�����"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� ����������� ������� ��� �� ��������� �����!"));//���������, ��� �� �������� ���� ����� "����������� ����������� ������� ��� �� ��������� ����� "
	 }

}