package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Day2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(("https://en-gb.facebook.com/"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//div[@class=\"_5dbb\"]/input[@name=\"firstname\"]")).sendKeys("Robert");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Oppenheimer");
		//driver.findElement(By.xpath("//div[@class=\"uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput\"]/input")).sendKeys("Oppenheimer");
		//(//div[@class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput"])[3]/input[@name="reg_email__"] --doubt please correct this line
		driver.findElement(By.name("reg_email__")).sendKeys("testfb@yahoo.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testfb@yahoo.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password@123");
		driver.findElement(By.id("day")).sendKeys("6");
		driver.findElement(By.id("month")).sendKeys("NOV");
		driver.findElement(By.id("year")).sendKeys("2000");
		driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();
		driver.findElement(By.xpath("//div[@class=\"_1lch\"]")).click();
	}
	
}
