package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BuyingAdditionalNumberChooseNumbersFromListTest extends TestBase{
	@Test
	public void BuyingAdditionalNumberChooseNumbersFromListTest_C15106() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//tr[2]/td[3]/span/a")).click();//������� "��������"
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.content_body_header")));//�������� �������� ��������
		//�������� ������� ������� ���������
		driver.findElement(By.xpath("//li/label/input")).isDisplayed();
		driver.findElement(By.xpath("//li[2]/label/span")).isDisplayed();
		driver.findElement(By.xpath("//li[2]/label/input")).isDisplayed();
		driver.findElement(By.xpath("//div[3]/li[2]/label/span")).isDisplayed();
		driver.findElement(By.xpath("//div[3]/li[2]/label/input")).isDisplayed();
	}

}
