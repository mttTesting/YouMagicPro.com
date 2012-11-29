package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExpenseStructureChooseAdditionalNumbersTest extends TestBase{
	@Test
	public void expenseStructureChooseAdditionalNumbersTest_C15100() {
		waitAdminPageToLoad();
		driver.findElement(By.xpath("//tr[3]/td[3]/span/a")).click();//�������� �� ������ "��������"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/span")));//�������� �������� ��������
		assertEquals(driver.findElement(By.xpath("//form/div/div/div/span")).getText(), "������ ���������� ������");//��������� ������� �� ������ ������ ���. ������
		}
}