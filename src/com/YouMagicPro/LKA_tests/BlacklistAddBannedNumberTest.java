package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class BlacklistAddBannedNumberTest extends TestBase {
	@Test
	public void BlacklistChooseMainNumberTest_C15150() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "���������"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
	
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//�������� �������� ��������
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	driver.findElement(By.xpath("//div[6]/a/div")).click();//�������� "������ ������"
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/span")));//�������� �������� ��������
	
	driver.findElement(By.xpath("//div[2]/div/div/div/div/div[2]/input")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/input")));//�������� �������� ��������
	driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys("89857297409");
	sleep();
	driver.findElement(By.id("edit-submit")).click();
	sleep();
	
	driver.findElement(By.xpath("//div[2]/input[2]")).click();
	sleep();
	
	}
}