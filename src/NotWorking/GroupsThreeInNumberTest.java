package NotWorking;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.YouMagicPro.LKA_tests.TestBase;

public class GroupsThreeInNumberTest extends TestBase{
	@Test
	public void groupsThreeInNumberTest_C15189() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "������"
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
		
		driver.findElement(By.xpath("//div[3]/a/div")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
		driver.findElement(By.xpath("//td[2]/div/span")).click();//��������� ����������� ����
		
		driver.findElement(By.xpath("//a/div/span")).click();//�������� �� ������ ���������� ������
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/label")));
		driver.findElement(By.id("edit-group-name")).sendKeys("������");//��������� ������ ������
		driver.findElement(By.id("edit-group-id")).sendKeys("111");//��������� ������ ������
		driver.findElement(By.id("edit-submit")).click();//�������� ���������
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));
		assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), "������ ������ ������ ������ ���� �� 3 �� 4 ����.");//���������, �������� �� ������
	}
}