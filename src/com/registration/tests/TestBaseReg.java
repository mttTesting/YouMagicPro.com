package com.registration.tests;

import org.testng.annotations.*;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
 
public class TestBaseReg {

	protected Selenium selenium;

	@Parameters({"browser"})
	@BeforeClass
	public void setUp(@Optional String browser) throws Exception {
		if (browser == null) browser = "*googlechrome C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
		//if (browser == null) browser = "*firefox";
		selenium = new DefaultSelenium("localhost", 4444, browser, "http://youmagic.pro/");
		selenium.start();
		//selenium = (LoggingDefaultSelenium) SeleniumHelper.getSelenium(this.getClass().getSimpleName(),
		//"localhost", 4444, browser, "http://umagicpro-pp.rnd.mtt/");
	}


	@AfterClass
	public void tearDown() throws Exception {
		//SeleniumHelper.dismissSelenium(this.getClass().getSimpleName());
		  selenium.stop();
	}

	public void open() {
		// TODO Auto-generated method stub
		selenium.open("http://youmagic.pro/"); //¬ход на сайт http://umagicpro-pp/
	}
	public void openAndLogin() {
		// TODO Auto-generated method stub
		selenium.open("http://youmagic.pro/"); //¬ход на сайт http://umagicpro-pp/
		selenium.click("link=јдминистратор");
		selenium.waitForPageToLoad("90000");
		 sleep();
		selenium.type("id=edit-name-1", "303187"); //ввод логина и парол€
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "¬ход"
		selenium.waitForPageToLoad("60000");
		sleep();
	}
	 public static void sleep(){
	    	try {
	    		Thread.sleep(4000);
	    	} catch (InterruptedException e) {
	    		e.printStackTrace();
	    	}
	    }
	public void openAndLoginLKS() {
		// TODO Auto-generated method stub
		selenium.open("http://youmagic.pro/"); //¬ход на сайт http://umagicpro-pp/
		selenium.click("link=—отрудник");
		selenium.waitForPageToLoad("90000");
		selenium.type("id=edit-name-1", "0776006416"); //ввод логина и парол€
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "¬ход"
		selenium.waitForPageToLoad("90000");
		
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		sleep();
	}

}
