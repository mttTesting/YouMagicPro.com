package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BuyingAdditionalInternalNumberCheckCost  extends TestBase{
	@Test
	public void buyingAdditionalInternalNumberCheckCost_C15113() {
		waitAdminPageToLoad();		
		driver.findElement(By.xpath("//tr[3]/td[3]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div")));//�������� �������� ��������
		assertEquals(driver.findElement(By.xpath("//form/div/div/div/div")).getText(), "��������� ����������� ������ 35.4 ���./���. (� ���)\n����� ����� ������� � ������ ����� �������� ������");//��������� ������� �� ������ ������ ���. ������
	}
}