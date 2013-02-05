package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class SupportTopicDropdownMenuTest extends TestBase{
	@Test
	public void supportToopicDropdownMenuTest_C15197() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//span[4]/a")).click();//�������� �� "���������"
		driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	sleep();

    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div/div")));//�������� �������� ��������
		
		
		
		driver.findElement(By.xpath("//span/span/span")).click();//������� �� ����������� ������
		driver.findElement(By.xpath("//div[@id='bSupport_theme-wrapper']/span/ul/li[2]")).click();
		driver.findElement(By.xpath("//span/span/span")).click();
		driver.findElement(By.xpath("//div[@id='bSupport_theme-wrapper']/span/ul/li[3]")).click();
		driver.findElement(By.xpath("//span/span/span")).click();
		driver.findElement(By.xpath("//div[@id='bSupport_theme-wrapper']/span/ul/li[4]")).click();
	}
}