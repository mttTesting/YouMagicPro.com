package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PasswordWrongOldPasswordTest  extends TestBase{
	@Test
	public void PasswordWrongOldPasswordTest_C27054() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[2]/span/a")).click(); //������� "�������� ������"
		wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-old-password")));//�������� �������� ��������
		
		driver.findElement(By.id("edit-old-password")).sendKeys("12"); //���� ��������� ������� ������
		driver.findElement(By.id("edit-new-password-pass1")).sendKeys("1234");
		driver.findElement(By.id("edit-new-password-pass2")).sendKeys("1234");
		driver.findElement(By.id("edit-submit")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//�������� �������� ��������
		
		assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), "������� ������ ��������.");//���������, �������� �� ��������������	
	}

}