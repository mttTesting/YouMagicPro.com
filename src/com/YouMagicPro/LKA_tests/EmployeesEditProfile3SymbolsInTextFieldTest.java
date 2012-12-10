package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class EmployeesEditProfile3SymbolsInTextFieldTest extends TestBase{
	@Test
	public void employeesEditProfile3SymbolsInTextFieldTest_C15256() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "���������"
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//�������� �������� ��������
    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	driver.findElement(By.xpath("//td[2]/div/span")).click();
    	
		driver.findElement(By.xpath("//div[2]/a/div")).click();//�������� "����������"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/a/span")));//�������� �������� ��������
		driver.findElement(By.xpath("//td[2]/div/span")).click();
		
		driver.findElement(By.xpath("//div[3]/a/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-employee-extension")));//�������� �������� ��������
		
		driver.findElement(By.id("edit-employee-extension")).clear();
		driver.findElement(By.id("edit-employee-extension")).sendKeys("531");
		driver.findElement(By.id("edit-submit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[3]/div/div[2]/div/div/div")));
		
		assertEquals(driver.findElement(By.xpath("//td[3]/div/div[2]/div/div/div")).getText(), "����������");
		}
}
