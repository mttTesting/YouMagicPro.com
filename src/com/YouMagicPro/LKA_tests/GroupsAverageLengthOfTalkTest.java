package com.YouMagicPro.LKA_tests;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GroupsAverageLengthOfTalkTest extends TestBase {
	@Test
	public void groupsMiddleLengthOfTalkTest_C25633() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "���������"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//��������� ����������� ����
	sleep();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	sleep();
	
	driver.findElement(By.xpath("//div[3]/a/div")).click();//�������� "������
	sleep();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	sleep();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/div/span")));//���� �������� ��������
	driver.findElement(By.xpath("id('main_enter')/div[1]/a/div/span[1]")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-group-name")));

	Assert.assertEquals("30", driver.findElement(By.id("edit-average-duration")).getAttribute("value"));
	
	}
}