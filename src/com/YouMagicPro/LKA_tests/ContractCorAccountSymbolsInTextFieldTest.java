package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractCorAccountSymbolsInTextFieldTest extends TestBase{
	@Test
	public void contractCorAccountSymbolsInTextFieldTest_C15003() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_cor("!;:?*()_+=@#$%^&", "����.���� ����� ��������� ������ �����.");//���� �������� � ���� ����� ���. �����
	}
}
