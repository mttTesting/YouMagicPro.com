package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class VoiceMenuSetNumber7ToRetryOfListeningTest extends TestBase {
	@Test
	public void voiceMenuSetNumber7ToRetryOfListeningTest_C15347() {
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
	
	driver.findElement(By.id("edit-ivr-name")).sendKeys("�1");
	
	driver.findElement(By.xpath("//div[@id='ivr-action-7']/span")).click();
	driver.findElement(By.xpath("//div[7]/div/span/span/span")).click();
	driver.findElement(By.xpath("//div[@id='edit-group-7-ivr-action-7-wrapper']/span/ul/li[7]")).click();
	
	
	sleep();
	driver.findElement(By.id("edit-submit")).click();
	sleep();
	driver.findElement(By.xpath("//div[2]/div[4]/a[2]/span")).click();
	driver.findElement(By.xpath("//td/a/div")).click();
	
	}
}