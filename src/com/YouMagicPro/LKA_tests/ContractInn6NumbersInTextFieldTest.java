package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContractInn6NumbersInTextFieldTest  extends TestBase{
	@Test
	public void contractInn6NumbersInTextFieldTest_C15029() {
	waitContractPageToLoad();
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	sendKeysAndAssert_inn("123456","��� ������ �������� �� 10 ��� 12 ��������.");
	}
}
