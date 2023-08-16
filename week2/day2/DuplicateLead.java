package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		
		WebElement Email = driver.findElement(By.linkText("Email"));
		Email.click();
		
		WebElement email = driver.findElement(By.name("emailAddress"));
		email.sendKeys("ss@gmail.com");
		
		WebElement Findlead = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		Findlead.click();
		
		Thread.sleep(2000);
		WebElement leadId=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String View = leadId.getText();
		System.out.println(View);
		//Lead Id = 11494
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		driver.findElement(By.className("subMenuButton")).click();
		String title = driver.getTitle();
        System.out.println(title);
        
        driver.findElement(By.className("smallSubmit")).click();
        Thread.sleep(1000);
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email'] ")).click();
		driver.findElement(By.xpath("(//div[@class=\"x-form-element\"])[22]/input")).sendKeys("ss@gmail.com");
		driver.findElement(By.xpath("(//button[@class=\"x-btn-text\"])[7]")).click();
		String FN1 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]//a[@class='linktext']")).getText();
        String FN2 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[2]//a[@class='linktext']")).getText();
        System.out.print(FN1); // doubt unable to get the first and second element after search
        System.out.print(  FN2);
        driver.close();
        
	}
}
