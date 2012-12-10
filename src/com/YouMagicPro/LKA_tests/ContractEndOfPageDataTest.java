package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

	public class ContractEndOfPageDataTest  extends TestBase{

    	@Test
    	public void contractEndOfPageDataTest_C15062() {
    		waitContractPageToLoad();
    		driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
    		assertEquals(driver.findElement(By.xpath("//strong")).getText(), "74997043123]"); //�������� ���������� ������ ������������
    		assertEquals(driver.findElement(By.xpath("//tr[2]/td/div/div/strong")).getText(), "74997043123"); //�������� ������ �������� YM.Pro 
    		assertEquals(driver.findElement(By.xpath("//tr[3]/td/div/div/strong")).getText(), "AT � ���������� SIP");//��� ������������ ����������
    		assertEquals(driver.findElement(By.xpath("//td[2]/div/strong")).getText(), "��� ���һ");//����� ��������� �����
    		assertEquals(driver.findElement(By.xpath("//tr[2]/td[2]/div/strong")).getText(), "�������");//�������� ����
    		assertEquals(driver.findElement(By.xpath("//tr[3]/td[2]/div/strong")).getText(), "���������");//����� ��������
    	}
 
}
