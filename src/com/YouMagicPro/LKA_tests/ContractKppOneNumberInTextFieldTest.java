package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractKppOneNumberInTextFieldTest extends TestBase{
	@Test
	public void contractKppTest_C15048() {
	waitContractPageToLoad();

	sendKeysAndAssert_kpp("1","���������� ���� � ��� ������ ���� 9.");//������ 1 � ���� ����� ���
	}

}
