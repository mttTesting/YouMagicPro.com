package NotWorking;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.YouMagicPro.LKA_tests.TestBase;

public class ContractInnChooseFormIPTest  extends TestBase{
	@Test
	public void contractInnTest_C15032() {
	waitContractPageToLoad();
	
	driver.findElement(By.xpath("//div[3]/div[2]/span/a")).click(); //������� "��������"
	//�������� ����� 12 ���� ��� ��������������-�������� ����� ��
	sendKeysAndAssert("123456332012", "��������� ������������ ���������� �������� � ���������", "//span/ul/li[4]");
	}


	private void sendKeysAndAssert(String keys, String errorString, String xPathDropdownList)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("a.bPopup__eLink.close")));//�������� �������� ��������
		
		driver.findElement(By.cssSelector("a.bPopup__eLink.close")).click();
		driver.findElement(By.xpath("//td[2]/div/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-bank-details-inn")));//�������� �������� ��������
		//driver.findElement(By.xpath("//div[5]/div/input")).click();// ��� ����� � ������� ���� �� �����������
		driver.findElement(By.xpath("//div[5]/div/input")).clear();
		driver.findElement(By.xpath("//div[5]/div/input")).sendKeys(keys);	//������ keys � ���� ����� ���
		wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-submit")));//�������� �������� ��������
		
		driver.findElement(By.xpath("//span/span/span")).click();
		driver.findElement(By.xpath("//span/ul/li[4]")).click();
		driver.findElement(By.id("edit-submit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bDocWrap > h1")));//�������� �������� ��������
		assertEquals(driver.findElement(By.cssSelector("div.section-title")).getText(), errorString);
	}
	

}
