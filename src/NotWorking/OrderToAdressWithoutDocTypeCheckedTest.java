package NotWorking;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.YouMagicPro.LKA_tests.TestBase;

public class OrderToAdressWithoutDocTypeCheckedTest  extends TestBase{
	@Test
	public void orderToAdressWithoutDocTypeCheckedTest_C25674() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//�������� �������� ��������
		
		driver.findElement(By.xpath("//form/div/div/div/div/div/span")).click();//������� ������� � ����� ����������
		driver.findElement(By.xpath("//div/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//form/div/div/div/div/div[3]/span")).click();
		driver.findElement(By.xpath("//div[4]/span")).click();
		
		driver.findElement(By.id("edit-address-postcode")).sendKeys("141070");//��������� ���� � �������
		driver.findElement(By.id("edit-address-city")).sendKeys("����");
		driver.findElement(By.id("edit-address-street")).sendKeys("qqqq");
		driver.findElement(By.id("edit-address-house")).sendKeys("14");
		driver.findElement(By.id("edit-address-apartment")).sendKeys("1");
		
		driver.findElement(By.xpath("//form/div/div/div/div[3]/input")).click();//������� �� "���������"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/div[2]/div/div/div/div")));//�������� �������� ��������
		assertEquals(driver.findElement(By.xpath("//div/div/div[2]/div/div/div/div")).getText(), "���������� ������� ��� ���������. �� ����� ������� ������������ ����� ��� ���������� ������ ��������. ����������, ��������� ����.");
		
	}

}

