package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class SupportChooseTopicNoTextTest extends TestBase{
	@Test
	public void supportChooseTopicNoTextTest_C15200() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//span[4]/a")).click();//�������� �� "���������"
		driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	sleep();
    	driver.findElement(By.xpath("//div[@id='umagicproConfirmDialog-d7db61d4eaa86fd123239ffe2246b1db']/div/div[2]/table/tbody/tr/td[2]/div/span")).click();
    	sleep();
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div/div")));//�������� �������� ��������
    	
    	//driver.findElement(By.id("bSupport_MessageText")).sendKeys("11564589132 abcs ,@!.;\\/ ");
    	
    	driver.findElement(By.xpath("//span/span/span")).click();//������� �� ����������� ������
		driver.findElement(By.xpath("//div[@id='bSupport_theme-wrapper']/span/ul/li[2]")).click();
		sleep();
		driver.findElement(By.id("edit-contact-send")).click();
		sleep();
		//driver.findElement(By.xpath("//div[@id='umagicproConfirmDialog-d7db61d4eaa86fd123239ffe2246b1db']/div/div[2]/table/tbody/tr/td[2]/div/span")).click();
		
		assertEquals(driver.findElement(By.xpath("//td[3]/div/div/div/div/div")).getText(), "����������, �������� ������");
	}
}