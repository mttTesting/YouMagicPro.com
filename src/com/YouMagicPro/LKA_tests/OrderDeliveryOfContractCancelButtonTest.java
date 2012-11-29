package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderDeliveryOfContractCancelButtonTest  extends TestBase{
	@Test
	public void orderDeliveryOfContractCancelButtonTest() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//�������� �������� ��������
		
		driver.findElement(By.xpath("//div/div/div[3]/div/a")).click();//������� ������ ��������
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[3]/div/div[2]/div/div/div")));//�������� �������� ��������
		driver.findElement(By.xpath("//td[3]/div/div[2]/div/div/div")).isDisplayed();
	}

}

