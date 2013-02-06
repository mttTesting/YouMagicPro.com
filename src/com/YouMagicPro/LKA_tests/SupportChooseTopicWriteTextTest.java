package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SupportChooseTopicWriteTextTest extends TestBase{
	@Test
	public void supportChooseTopicWriteTextTest_C15200() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//span[4]/a")).click();//�������� �� "���������"
		driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	sleep();
    	driver.findElement(By.id("umagicproConfirmDialog-bf937244a640ee341e7fcc4c86fb5fa7-umagicpro-cansel-dialog-action")).click();
    	sleep();
    	
    	driver.findElement(By.id("bSupport_MessageText")).sendKeys("�������� ��������� 123 ,@!.;\\/ ");
    	
    	driver.findElement(By.xpath("//div[@id='bSupport_theme-wrapper']/span/span/span")).click();//������� �� ����������� ������
		driver.findElement(By.xpath("//div[@id='bSupport_theme-wrapper']/span/ul/li[2]")).click();
		sleep();
		driver.findElement(By.id("edit-contact-send")).click();
		sleep();
		
		Assert.assertEquals(driver.findElement(By.xpath("//td[3]/div/div/div/div")).getText(), "�������, ���� ��������� ���������� � ������ ���������. ��� ����������� �������.");
	}
}