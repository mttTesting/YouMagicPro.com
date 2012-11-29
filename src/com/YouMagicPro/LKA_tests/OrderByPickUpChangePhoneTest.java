package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderByPickUpChangePhoneTest  extends TestBase{
	@Test
	public void OrderByPickUpChangePhoneTest_C25666() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//�������� �������� ��������
		
		driver.findElement(By.xpath("//span/span/span")).click();//���� �� ����������� ������, ����� ���� �������� - ���������
		driver.findElement(By.xpath("//span/ul/li[2]")).click();
		
		driver.findElement(By.id("edit-phone")).sendKeys("1121111");//�������� ���� ����� ������ � �����
		
	}
}
