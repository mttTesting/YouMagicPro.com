package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractBik1inTextFieldTest  extends TestBase{
	@Test
	public void contractBikTest1inTextField_C15022() {
		waitContractPageToLoad();
		
		sendKeysAndAssert_bik("1", "���������� ���� � ��� ������ ���� 9.");//���� ������� � ���� ����� ���
	}
}