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
		selenium.open("http://youmagic.pro/"); //���� �� ���� http://umagicpro-pp/
	}
	public void openAndLogin() {
		// TODO Auto-generated method stub
		selenium.open("http://youmagic.pro/"); //���� �� ���� http://umagicpro-pp/
		selenium.click("link=�������������");
		selenium.waitForPageToLoad("90000");
		 sleep();
		selenium.type("id=edit-name-1", "303187"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
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
		selenium.open("http://youmagic.pro/"); //���� �� ���� http://umagicpro-pp/
		selenium.click("link=���������");
		selenium.waitForPageToLoad("90000");
		selenium.type("id=edit-name-1", "0776006416"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("90000");
		
		selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		sleep();
	}

}
