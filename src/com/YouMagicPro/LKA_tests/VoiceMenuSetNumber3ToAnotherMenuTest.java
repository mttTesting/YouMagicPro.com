package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class VoiceMenuSetNumber3ToAnotherMenuTest extends TestBase {
	@Test
	public void voiceMenuSetNumber3ToAnotherMenuTest_C15343() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "���������"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
	
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//�������� �������� ��������
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	driver.findElement(By.xpath("//div[4]/a/div")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[2]/div/span")));//�������� �������� ��������
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	driver.findElement(By.xpath("//div[3]/div/a/span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/label")));
	assertEquals(driver.findElement(By.xpath("//div/label")).getText(), "��������");
	
	driver.findElement(By.id("edit-ivr-name")).sendKeys("����");
	
	driver.findElement(By.xpath("//div[@id='ivr-action-3']/span")).click();
	driver.findElement(By.xpath("//div[@id='edit-group-3-ivr-action-3-wrapper']/span/span/span")).click();
	driver.findElement(By.xpath("//div[@id='edit-group-3-ivr-action-3-wrapper']/span/ul/li[4]")).click();
	
	sleep();
	driver.findElement(By.id("edit-submit")).click();
	sleep();
	driver.findElement(By.xpath("//a[2]/span")).click();
	driver.findElement(By.xpath("//a/div/span")).click();
	
	}
}