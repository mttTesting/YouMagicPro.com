package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractInn6NumbersInTextFieldTest  extends TestBase{
	@Test
	public void contractInn6NumbersInTextFieldTest_C15029() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_inn("123456","��� ������ �������� �� 10 ��� 12 ��������.");
	}
}
