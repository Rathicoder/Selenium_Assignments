package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Day1 {

	public static void main(String[] args) throws InterruptedException {
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
		
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Member");
	   driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dummy"); 
	   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
	   driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample to test the create lead form in webpage");
	   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testdata@yahoo.com");
	   driver.findElement(By.className("smallSubmit")).click();
	   
	}

}
