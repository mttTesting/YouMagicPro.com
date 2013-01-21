package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsAddManyEmployeesToGroupCancelTest extends TestBase {
	@Test
	public void groupsAddManyEmployeesToGroupCancelTest_C25640() {
	waitAdminPageToLoadSecondAccount();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/span/a")));//���� �������� ��������
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "���������"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//��������� ����������� ����
	//driver.findElement(By.xpath("//div[@id='instructionContent']/div/div[4]/a")).click();
	
	driver.findElement(By.xpath("//div[3]/a/div")).click();//�������� "������
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/div/span")));//���� �������� ��������
	
	driver.findElement(By.xpath("//div[@id='bgroup_0']/div/table/tbody/tr/td[5]/a/span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[2]/span[2]")));//���� �������� ��������

	driver.findElement(By.xpath("//div[3]/div/span[2]")).click();
	driver.findElement(By.xpath("//div[3]/div/span[2]")).click();
	driver.findElement(By.xpath("//center/div/a")).click();//������
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//div[@id='bgroup_0']/div/table/tbody/tr/td[5]/a/span")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[2]/span[2]")));//���� �������� ��������
	
	Assert.assertFalse(driver.findElements(By.xpath("//div[2]/div/span[2]")).size() != 0);
	Assert.assertFalse(driver.findElements(By.xpath("//form/div/div[2]/div")).size() != 0);
	
	}
}