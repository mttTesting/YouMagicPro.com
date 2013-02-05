package com.YouMagicPro.LKS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class HistoryFullNumberTest  extends TestBase{
	@Test
	public void historyFullNumberTest_C15177 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/history')]")).click();
		sleep();//�������� �������� ��������
		driver.findElement(By.id("edit-account-filter")).sendKeys("883140776028001");
		sleep();
		driver.findElement(By.id("edit-submit")).click();
		sleep();//�������� �������� ��������
		assertEquals(driver.findElement(By.xpath("//td[3]/span[2]")).getText(), "883140776028001");
	}
}


