package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GroupsMelodyTest extends TestBase {
	@Test
	public void groupsMelodyTest_C25634() {
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
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[6]/a/span")));//���� �������� ��������
	
	driver.findElement(By.xpath("//td[6]/a/span")).click(); //�������� �������
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span/span/span")));
	driver.findElement(By.xpath("//span/span/span")).click();
	driver.findElement(By.xpath("//li[3]")).click();
	
	driver.findElement(By.xpath("//div[3]/input")).click();//�������� ���������
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[6]/a/span")));//���� �������� ��������
	
	}
}