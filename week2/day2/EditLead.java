package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		
		WebElement FindLeads = driver.findElement(By.linkText("Find Leads"));
		FindLeads.click();
        
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]//a[@class='linktext']")).click();
		
		String title = driver.getTitle();
		System.out.print(title);
		
		WebElement Editlead = driver.findElement(By.linkText("Edit"));
		Editlead.click();
		   
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Edited Company");
		
		driver.findElement(By.name("submitButton")).click();
		String View = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.print(View);

		driver.close();
		
	}

}
