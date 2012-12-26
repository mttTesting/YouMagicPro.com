package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractCorAccount19NumbersTest extends TestBase{
	@Test
	public void contractCorAccount19NumbersTest_C15005() {
	waitContractPageToLoad();
	
	//driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	//driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
	driver.findElement(By.id("edit-bank-details-kor-account")).click();// ��� ����� � ������� ���� �� �����������
	driver.findElement(By.id("edit-bank-details-kor-account")).clear();
	driver.findElement(By.id("edit-bank-details-kor-account")).sendKeys("1234567890123456789");	//������ keys � ���� ����� ���
	driver.findElement(By.id("edit-submit")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bDocWrap > h1")));//�������� �������� ��������
	assertEquals(driver.findElement(By.cssSelector("div.section-title")).getText(), "��������� ������������ ���������� �������� � ���������");
	
	}
}
