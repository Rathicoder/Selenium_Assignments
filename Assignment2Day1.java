package week4day1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Day1 {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://buythevalue.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement product = driver.findElement(By.xpath("//a[@href='/products/urban-fit-x-smart-watch']"));
	product.click();
	driver.findElement(By.xpath("//input[@id='wk_zipcode']")).sendKeys("606601");		
	driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']")).click();
	driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();
	
	driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();
	
	driver.findElement(By.xpath("//div[@class='cart-buttons inner-right inner-left']/input[2]")).click();
	
	Alert simplealert = driver.switchTo().alert();
	simplealert.accept();
	System.out.print(driver.getTitle());
	driver.close();	
	}

}
