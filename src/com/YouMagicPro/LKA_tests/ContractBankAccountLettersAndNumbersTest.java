package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractBankAccountLettersAndNumbersTest extends TestBase{
	@Test
	public void contractBankAccountLettersAndNumbersTest_C14496() {
		waitContractPageToLoad();

		sendKeysAndAssert_bankAccount("abcdefgh12345", "����� ����������� ����� ����� ��������� ������ �����.");//���� ���� � ���� � ���� ����� ����������� �����
	}

}
