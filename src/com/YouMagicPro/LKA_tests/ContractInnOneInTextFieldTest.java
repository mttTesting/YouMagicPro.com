package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractInnOneInTextFieldTest  extends TestBase{
	@Test
	public void contractInnOneInTextFieldTest_C15028() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_inn("1","��� ������ �������� �� 10 ��� 12 ��������.");
	}
}
