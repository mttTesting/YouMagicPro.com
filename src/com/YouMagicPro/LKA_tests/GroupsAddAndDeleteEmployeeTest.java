package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GroupsAddAndDeleteEmployeeTest extends TestBase {
	@Test
	public void groupsAddAndDeleteEmployeeTest_C25636() {
	waitAdminPageToLoadSecondAccount();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "���������"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//��������� ����������� ����
	//driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	driver.findElement(By.xpath("//div[3]/a/div")).click();//�������� "������
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/div/span")));//���� �������� ��������

	
	
	
	}
}