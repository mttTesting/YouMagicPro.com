package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DiscSpaceTest  extends TestBase{
	@Test
	public void discSpaceTest() {
		waitAdminPageToLoad();
		
		driver.findElement(By.id("free_space_all")).isDisplayed();//�������� ������� ������� � ������������ ���������� �����
		driver.findElement(By.id("music_space_all")).isDisplayed();
		
		assertEquals(driver.findElement(By.xpath("//div[6]/div/div/span[2]")).getText(), "199.06 ��");//�������� ����������� ���������� �����
		
	}
}
