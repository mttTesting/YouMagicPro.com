	package com.YouMagicPro.LKS_tests;

	import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
	import com.registration.tests.TestBaseReg;


	public class PhoneAddGroupWithEmptyNameTest extends TestBaseReg{
		@Test
		public void  PhoneAddGroupWithEmptyNameTest_C15327 () throws Exception {	 
			openAndLoginLKS();
			selenium.click("link=������������� ��������");//������� �� ����� "������������� ��������" � ���� �������� �������
			Thread.sleep(3000);
			selenium.click("link=�������� ������");//������� �� ������ "�������� ������"
			Thread.sleep(3000);
			selenium.type("id=edit-group-name", "");//���� ����� ������ ("g1")
			selenium.click("id=edit-save");
			Thread.sleep(3000);
			
			AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-group-name"));//��������, ���� �� �� �������� ����� "g1"
			
			
		}
	}