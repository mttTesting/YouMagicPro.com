package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class EmployeesEditProfileFillInDataTest extends TestBase{
	@Test
	public void employeesEditProfileFillInDataTest_C15253() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "���������"
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//�������� �������� ��������
    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	driver.findElement(By.xpath("//td[2]/div/span")).click();
    	
		driver.findElement(By.xpath("//div[2]/a/div")).click();//�������� "����������"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/a/span")));//�������� �������� ��������
		driver.findElement(By.xpath("//td[2]/div/span")).click();
		
		driver.findElement(By.xpath("//div[2]/div[3]/a/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-employee-middlename")));//�������� �������� ��������

		driver.findElement(By.id("edit-employee-lastname")).clear();
		driver.findElement(By.id("edit-employee-lastname")).sendKeys("������");
		
		driver.findElement(By.id("edit-employee-middlename")).clear();
		driver.findElement(By.id("edit-employee-middlename")).sendKeys("��������");
		
		driver.findElement(By.id("edit-employee-firstname")).clear();
		driver.findElement(By.id("edit-employee-firstname")).sendKeys("����");
		
		
		driver.findElement(By.xpath("//div[2]/input")).clear();
		driver.findElement(By.xpath("//div[2]/input")).sendKeys("1234");
		
		
		driver.findElement(By.id("edit-submit")).click();
		sleep();
		
		assertEquals(driver.findElement(By.xpath("//td[3]/div/div[2]/div/div/div")).getText(), "����������");
		
		
		}
}
