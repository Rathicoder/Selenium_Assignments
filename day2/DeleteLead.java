package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		//http://leaftaps.com/opentaps/control/main
		 
		//Delete Lead:
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
		WebElement Phone = driver.findElement(By.linkText("Phone"));
		Phone.click();
		WebElement PhoneNumber = driver.findElement(By.name("phoneNumber"));
		PhoneNumber.sendKeys("8489188587");
		WebElement Findlead = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		Findlead.click();	
		Thread.sleep(2000);
		WebElement leadId=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String View = leadId.getText();
		System.out.println(View);
		//Lead Id = 11639
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();	
		driver.findElement(By.xpath("(//div[@class=\"x-form-element\"])[18]/input")).sendKeys("View");//doubt didn't get leadid in dom page ??
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		String Msg = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();//doubt
		System.out.print("Msg");
		
		driver.close();
	}
}
//driver.findElement(By.className("x-btn-text")).click();