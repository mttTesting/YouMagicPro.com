package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ContractInnLettersInTextFieldTest  extends TestBase{
	@Test
	public void contractInnLettersInTextFieldTest_C15030() {
		waitContractPageToLoad();

    	sendKeysAndAssert_inn("sdsdsdcf","��� ����� ��������� ������ �����.");
	}
}