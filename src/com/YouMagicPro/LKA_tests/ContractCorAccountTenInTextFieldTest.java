package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractCorAccountTenInTextFieldTest  extends TestBase{
	@Test
	public void contractCorAccountTenInTextFieldTest_C15000() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_cor("1234567890", "���������� ���� � ����.���� ������ ���� 19-20.");//���� 10�� ���� � ���� ����� ���. �����
	}
}
