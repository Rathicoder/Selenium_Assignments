package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Day1 {

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
		
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LCU");
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tom");
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Cruise");
	   driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Stunt"); 
	   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Movies");
	   driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing the edit lead form in webpage");
	   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testdata@hotmail.com");
	   driver.findElement(By.className("smallSubmit")).click();
	   
	   WebElement Editlead = driver.findElement(By.linkText("Edit"));
	   Editlead.click();
	   
	   driver.findElement(By.id("updateLeadForm_description")).clear();
		
		 driver.findElement(By.id("updateLeadForm_description")).sendKeys("Updating Description");
		driver.findElement(By.name("submitButton")).click();	
		
		String title = driver.getTitle();
        System.out.println(title);

	}

}
