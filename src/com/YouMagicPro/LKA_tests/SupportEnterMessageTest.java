package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class SupportEnterMessageTest extends TestBase{
	@Test
	public void supportEnterMessageTest_C15198() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//span[4]/a")).click();//нажимаем на "Поддержка"
		driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	sleep();

    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div/div")));//ожидание загрузки страницы
    	driver.findElement(By.id("bSupport_MessageText")).sendKeys("11564589132 abcs ,@!.;\\/ ");
    	

	}
}