package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContractInnLettersInTextFieldTest  extends TestBase{
	@Test
	public void contractInnLettersInTextFieldTest_C15030() {
	waitContractPageToLoad();
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	sendKeysAndAssert_inn("sdsdsdcf","ИНН может содержать только цифры.");
	}
}