package com.YouMagicPro.LKA_tests;


import org.testng.annotations.Test;

public class ContractOgrnLettersAndNumbersInTextFieldTest  extends TestBase{
	@Test
	public void contractOgrnLettersAndNumbersInTextFieldTest_C15057() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_ogrn("as123454jklq","���� ����� ��������� ������ �����.");//������ ����� � ����� � ���� ����� ����
	}

}
