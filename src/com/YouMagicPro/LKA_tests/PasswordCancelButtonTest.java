package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PasswordCancelButtonTest  extends TestBase{
	@Test
	public void passwordCancelButtonTest_C15127() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[2]/span/a")).click(); //������� "�������� ������"
		wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-old-password")));//�������� �������� ��������
		driver.findElement(By.xpath("//div/div/div[3]/div/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
		
		assertEquals(driver.findElement(By.cssSelector("div.bContent__innerHeader")).getText(), "������");//���������, �������� �� ��������������	
	}

}