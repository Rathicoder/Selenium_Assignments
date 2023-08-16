package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");		
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	
		driver.findElement(By.className("decorativeSubmit")).click();
		
		WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
		crm.click();
		
		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();
		
		WebElement Newlead = driver.findElement(By.linkText("Create Lead"));
		Newlead.click();
		
		WebElement indus = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry =new Select(indus);
		industry.selectByVisibleText("Health Care");
		
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership =new Select(owner);
		ownership.selectByIndex(3);
		
		
	}

}

