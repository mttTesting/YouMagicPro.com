package com.YouMagicPro.LKA_tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


	public class TestBase { 
		public static ChromeDriver driver;
		public static Wait wait;
	 
		@SuppressWarnings("deprecation")
		@BeforeClass(alwaysRun = true)
		
	    protected void startWebDriver() throws SecurityException, IOException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
	    	driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
	    	wait = new WebDriverWait(driver, 120);
	    }
	 
	    @AfterClass(alwaysRun = true)
	    protected void closeSession() {
		    driver.close();
	    }
	 
	    public static void assertEquals(Object actual, Object expected) {
	    	Assert.assertEquals(actual, expected);
	    }
	    public static void sendKeysAndAssert_bik(String keys, String errorString)
		{
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    	
			driver.findElement(By.id("edit-bank-details-bik")).click();// без клика и очистки поле не заполняется
			driver.findElement(By.id("edit-bank-details-bik")).clear();
			driver.findElement(By.id("edit-bank-details-bik")).sendKeys(keys);	//Ввод в поле ввода БИК
			driver.findElement(By.id("edit-submit")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//ожидание загрузки страницы
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
		}
	    public static void sendKeysAndAssert_bankAccount(String keys, String errorString)
		{
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    	
			driver.findElement(By.id("edit-bank-details-bank-account")).click();// без клика и очистки поле не заполняется
			driver.findElement(By.id("edit-bank-details-bank-account")).clear();
			driver.findElement(By.id("edit-bank-details-bank-account")).sendKeys(keys);	//Ввод в поле ввода БИК
			
			driver.findElement(By.id("edit-submit")).click();
	    	
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//ожидание загрузки страницы
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
		}
	    public static void sendKeysAndAssert_cor(String keys, String errorString)
	    {
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    	
	    	driver.findElement(By.id("edit-bank-details-kor-account")).click();// без клика и очистки поле не заполняется
	    	driver.findElement(By.id("edit-bank-details-kor-account")).clear();
	    	driver.findElement(By.id("edit-bank-details-kor-account")).sendKeys(keys);	//Ввод в поле ввода Кор. счета
	    	
	    	driver.findElement(By.id("edit-submit")).click();
	    	
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//ожидание загрузки страницы
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
	    }
	    public static void sendKeysAndAssert_kpp(String keys, String errorString)
	    {
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    	
	    	driver.findElement(By.id("edit-bank-details-kpp")).click();// без клика и очистки поле не заполняется
	    	driver.findElement(By.id("edit-bank-details-kpp")).clear();
	    	driver.findElement(By.id("edit-bank-details-kpp")).sendKeys(keys);	//Ввод в поле ввода Кор. счета
	    	
	    	driver.findElement(By.id("edit-submit")).click();

			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//ожидание загрузки страницы
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
	    }
	    public static void sendKeysAndAssert_ogrn(String keys, String errorString)
	    {
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    	
	    	driver.findElement(By.id("edit-bank-details-ogrn")).click();// без клика и очистки поле не заполняется
	    	driver.findElement(By.id("edit-bank-details-ogrn")).clear();
	    	driver.findElement(By.id("edit-bank-details-ogrn")).sendKeys(keys);	//Ввод в поле ввода Кор. счета
	    	
	    	driver.findElement(By.id("edit-submit")).click();

			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//ожидание загрузки страницы
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
	    }
	    public static void sendKeysAndAssert_inn(String keys, String errorString)
	    {
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    	
	    	driver.findElement(By.id("edit-bank-details-inn")).click();// без клика и очистки поле не заполняется
	    	driver.findElement(By.id("edit-bank-details-inn")).clear();
	    	driver.findElement(By.id("edit-bank-details-inn")).sendKeys(keys);	//Ввод в поле ввода Кор. счета
	    	
	    	driver.findElement(By.id("edit-submit")).click();

			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//ожидание загрузки страницы
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
	    }
	    public static void waitAdminPageToLoad()
	    {
	    	/*driver.get("http://account.umagicpro-pp.rnd.mtt/user/login/");
	    	
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//ввод логина пароля
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
	    	driver.findElement(By.id("edit-submit-1")).click();//нажатие на кнопку "Вход"
	    	*/
	    	
	    	driver.get("http://youmagic.pro/");//открытие портала
	    	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='entrance']/span")));
	    	//driver.findElement(By.xpath("//a[@id='entrance']/span")).click();
	    	//driver.findElement(By.xpath("//a[@href='http://account.youmagic.pro/user/login']")).click();//нажатие на кнопку "Вход"

	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("$('.gradient_back, .gradient_back_two, .div_abs_for_ifr').css({ 'display': 'block'  }); var atr_adm = $('.administrator').attr(\"href\"); $(\".iframe_rega\").attr({src: atr_adm}).css({ display: \"none\"});$(\".iframe_rega\").load(function () {$('.bLoginFormWrap_kn').css({'display': 'block'});$(this).css({ visibility: \"visible\", display:\"block\" });});");
	    	
	    	
	    	
	    	
	    	WebElement myElement = driver.findElement(By.xpath("//a[@id='entrance']/span"));
	    	Actions builder = new Actions(driver);
	    	//builder.click(myElement).build().perform();
	    	
	    	
	    	
	    	driver.switchTo().frame("iframe_autor");

	    	wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-name-1")));
	    	driver.findElement(By.id("edit-name-1")).sendKeys("303187");//ввод логина, пароля
	    	
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");
	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='edit-submit-1']")));
	    	//driver.findElement(By.xpath("//input[@id='edit-submit-1']")).click();//нажатие на кнопку "Вход"
	    	
	    	myElement = driver.findElement(By.xpath("//input[@id='edit-submit-1']"));
	    	builder.click(myElement).build().perform();
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    }
	    public static void waitAdminPageToLoadSecondAccount()
	    {
	    	/*driver.get("http://account.umagicpro-pp.rnd.mtt/user/login/");
	    	
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//ввод логина пароля
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
	    	driver.findElement(By.id("edit-submit-1")).click();//нажатие на кнопку "Вход"
	    	*/
	    	
	    	driver.get("http://youmagic.pro/");//открытие портала
	    	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='entrance']/span")));
	    	//driver.findElement(By.xpath("//a[@id='entrance']/span")).click();
	    	//driver.findElement(By.xpath("//a[@href='http://account.youmagic.pro/user/login']")).click();//нажатие на кнопку "Вход"

	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("$('.gradient_back, .gradient_back_two, .div_abs_for_ifr').css({ 'display': 'block'  }); var atr_adm = $('.administrator').attr(\"href\"); $(\".iframe_rega\").attr({src: atr_adm}).css({ display: \"none\"});$(\".iframe_rega\").load(function () {$('.bLoginFormWrap_kn').css({'display': 'block'});$(this).css({ visibility: \"visible\", display:\"block\" });});");
	    	
	    	
	    	
	    	
	    	WebElement myElement = driver.findElement(By.xpath("//a[@id='entrance']/span"));
	    	Actions builder = new Actions(driver);
	    	//builder.click(myElement).build().perform();
	    	
	    	
	    	
	    	driver.switchTo().frame("iframe_autor");

	    	wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-name-1")));
	    	driver.findElement(By.id("edit-name-1")).sendKeys("303327");//ввод логина, пароля
	    	
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");
	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='edit-submit-1']")));
	    	//driver.findElement(By.xpath("//input[@id='edit-submit-1']")).click();//нажатие на кнопку "Вход"
	    	
	    	myElement = driver.findElement(By.xpath("//input[@id='edit-submit-1']"));
	    	builder.click(myElement).build().perform();
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    }
	    public static void  waitContractPageToLoad(){
    	/*driver.get("http://account.umagicpro-pp.rnd.mtt/user/login/");
    	
    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//ввод логина пароля
    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
    	driver.findElement(By.id("edit-submit-1")).click();//нажатие на кнопку "Вход"
    	*/
    	
    	driver.get("http://youmagic.pro/");//открытие портала
    	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='entrance']/span")));
    	//driver.findElement(By.xpath("//a[@id='entrance']/span")).click();
    	//driver.findElement(By.xpath("//a[@href='http://account.youmagic.pro/user/login']")).click();//нажатие на кнопку "Вход"

    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("$('.gradient_back, .gradient_back_two, .div_abs_for_ifr').css({ 'display': 'block'  }); var atr_adm = $('.administrator').attr(\"href\"); $(\".iframe_rega\").attr({src: atr_adm}).css({ display: \"none\"});$(\".iframe_rega\").load(function () {$('.bLoginFormWrap_kn').css({'display': 'block'});$(this).css({ visibility: \"visible\", display:\"block\" });});");
    	
    	
    	
    	
    	WebElement myElement = driver.findElement(By.xpath("//a[@id='entrance']/span"));
    	Actions builder = new Actions(driver);
    	//builder.click(myElement).build().perform();
    	
    	
    	
    	driver.switchTo().frame("iframe_autor");

    	wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-name-1")));
    	driver.findElement(By.id("edit-name-1")).sendKeys("303187");//ввод логина, пароля
    	
    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='edit-submit-1']")));
    	//driver.findElement(By.xpath("//input[@id='edit-submit-1']")).click();//нажатие на кнопку "Вход"
    	
    	myElement = driver.findElement(By.xpath("//input[@id='edit-submit-1']"));
    	builder.click(myElement).build().perform();
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    	
	    	driver.findElement(By.xpath("//div[5]/div[2]/span/a")).click(); //Нажатие "Оформить"
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	    }
	}
