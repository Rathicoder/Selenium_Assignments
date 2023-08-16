package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Day1 {

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
		
		driver.findElement(By.xpath("//a[@href=\"/crmsfa/control/contactsMain\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/crmsfa/control/mergeContactsForm\"]")).click();
		
		driver.findElement(By.xpath("(//img[@src=\"/images/fieldlookup.gif\"])[1]")).click();
		Set <String> winhan = driver.getWindowHandles();
	    List <String> MCF = new ArrayList<String>(winhan);
	    driver.switchTo().window(MCF.get(1));
//	    System.out.print(driver.getTitle());
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	driver.findElement(By.xpath("(//a[@href=\"javascript:set_value('DemoCustomer');\"])[1]")).click();	
//	    driver.switchTo().window((MCF.get(1))).close();
	    
	    driver.switchTo().window(MCF.get(0));
	    driver.findElement(By.xpath("(//img[@src=\"/images/fieldlookup.gif\"])[2]")).click();
		Set <String> winhan1 = driver.getWindowHandles();
	    List <String> MCT = new ArrayList<String>(winhan1);
	    driver.switchTo().window(MCT.get(1));
//	    System.out.print(driver.getTitle());
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("(//a[@href=\"javascript:set_value('DemoLBCust');\"])[1]")).click();
	    
	    driver.switchTo().window(MCF.get(0));
	    driver.findElement(By.xpath("//a[text()='Merge']")).click();
	    
	    Alert alert = driver.switchTo().alert();
        // accept -->ok button
        alert.accept();
        alert.dismiss();
        
        String newwindow = driver.getTitle(); //doubt as merge not happening
	}

}
