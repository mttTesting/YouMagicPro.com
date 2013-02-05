package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractFillInDataTest  extends TestBase{

    	@Test
    	public void fillInContractDataTest_C14998() {  		
    		waitContractPageToLoad();
    		//driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	//driver.findElement(By.xpath("//td[2]/div/span")).click();
    		driver.findElement(By.id("edit-buisness-form-company")).sendKeys("1234");//���������� �������
    		driver.findElement(By.id("edit-bank-details-inn")).sendKeys("1234123411");
    		driver.findElement(By.id("edit-buisness-form-contact-man-wrapper-contact-man-base-value")).sendKeys("1234");
    		driver.findElement(By.id("edit-latitude")).clear();
    		driver.findElement(By.id("edit-latitude")).sendKeys("12345555555555555555555555555555555555555");
    		driver.findElement(By.id("edit-law-latitude")).clear();
    		driver.findElement(By.id("edit-law-latitude")).sendKeys("1234555555555555555555555555555555555555555");
    		driver.findElement(By.id("edit-company-phone")).sendKeys("1234");
    		driver.findElement(By.id("edit-bank-details-ogrn")).sendKeys("1234123412341");
    		driver.findElement(By.id("edit-bank-details-kpp")).sendKeys("123456789");
    		driver.findElement(By.id("edit-bank-details-bank-name")).sendKeys("1234");
    		driver.findElement(By.id("edit-bank-details-bank-filial")).sendKeys("1234");
    		driver.findElement(By.id("edit-bank-details-kor-account")).sendKeys("12345678901234567890");
    		driver.findElement(By.id("edit-bank-details-bank-account")).sendKeys("12345678901234567890");
    		driver.findElement(By.id("edit-bank-details-bik")).sendKeys("123456789");
    		
    		driver.findElement(By.id("edit-submit")).click();//������� �� ������ "���������"
    		
    		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bDocWrap > h1")));//�������� �������� ��������
    		assertEquals(driver.findElement(By.cssSelector("div.bDocWrap > h1")).getText(), "������� �� �������� ����� ����� � 303187");
    	}

}
