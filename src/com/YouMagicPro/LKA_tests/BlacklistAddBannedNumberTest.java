package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class BlacklistAddBannedNumberTest extends TestBase {
	@Test
	public void BlacklistChooseMainNumberTest_C15150() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	sleep();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	sleep();
	driver.findElement(By.xpath("//div[6]/a/div")).click();//нажимаем "Черный Список"
	sleep();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	sleep();
	driver.findElement(By.id("edit-blacklist-items-add-bl-owner")).click();
	sleep();
	driver.findElement(By.id("edit-blacklist-items-new-number-items-new-number-destination")).sendKeys("89857297409");
	sleep();
	driver.findElement(By.id("edit-submit")).click();
	sleep();
	
	driver.findElement(By.xpath("//input[2]")).click();
	sleep();
	
	}
}