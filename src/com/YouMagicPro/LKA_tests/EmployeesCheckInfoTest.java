package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class EmployeesCheckInfoTest extends TestBase{
	@Test
	public void employeesCheckInfoTest_C15252() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "���������"
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//�������� �������� ��������
    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	driver.findElement(By.xpath("//td[2]/div/span")).click();
    	
		driver.findElement(By.xpath("//div[2]/a/div")).click();//�������� "����������"
		
		driver.findElement(By.cssSelector("span.bEmployer_InnerName")).isDisplayed();
		driver.findElement(By.cssSelector("span.bEmployer_basketPicture")).isDisplayed();
		driver.findElement(By.cssSelector("span.bEmployer_Number_Text")).isDisplayed();
		driver.findElement(By.cssSelector("span.bSongEdit.bEmploer_margins_right")).isDisplayed();
		driver.findElement(By.xpath("//div[2]/div[2]/span[2]")).isDisplayed();
		
		
		}
}
