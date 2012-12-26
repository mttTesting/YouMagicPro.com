package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractInnChooseFormTest  extends TestBase{
	@Test
	public void contractInnChooseForm_C15047() {
	waitContractPageToLoad();
	//driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	//driver.findElement(By.xpath("//td[2]/div/span")).click();
	//�������� ����� 10 ���� ��� ��������������-�������� ����� ���
	sendKeysAndAssert("1234321220", "��������� ������������ ���������� �������� � ���������", "//span/ul/li");
	driver.findElement(By.xpath("//div[3]/div[2]/span/a")).click(); //������� "��������"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
	//�������� ����� 10 ���� ��� ��������������-�������� ����� ���
	sendKeysAndAssert("1234321520", "��������� ������������ ���������� �������� � ���������", "//span/ul/li[2]");
	driver.findElement(By.xpath("//div[3]/div[2]/span/a")).click(); //������� "��������"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
	//�������� ����� 10 ���� ��� ��������������-�������� ����� ���
	sendKeysAndAssert("1234321320", "��������� ������������ ���������� �������� � ���������", "//span/ul/li[3]");

	}


	private void sendKeysAndAssert(String keys, String errorString, String xPathDropdownList)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
		//driver.findElement(By.id("edit-bank-details-inn")).click();// ��� ����� � ������� ���� �� �����������
		driver.findElement(By.id("edit-bank-details-inn")).clear();
		driver.findElement(By.id("edit-bank-details-inn")).sendKeys(keys);	//������ keys � ���� ����� ���
		driver.findElement(By.xpath("//span/span/span")).click();
		driver.findElement(By.xpath(xPathDropdownList)).click();
		driver.findElement(By.id("edit-submit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bDocWrap > h1")));//�������� �������� ��������
		assertEquals(driver.findElement(By.cssSelector("div.section-title")).getText(), errorString);
	}
	

}
