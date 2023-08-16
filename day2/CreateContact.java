package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

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
		
		driver.findElement(By.xpath("//a[@href=\"/crmsfa/control/contactsMain\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/crmsfa/control/createContactForm\"]")).click();
		//driver.findElement(By.id("createContactForm_firstName")).sendKeys("New");
		driver.findElement(By.id("firstNameField")).sendKeys("Ken");
		driver.findElement(By.id("lastNameField")).sendKeys("Thomas");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("New");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Contact"); 
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@id=\"createContactForm_description\"]")).sendKeys("creation of new contact");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("newcontact@yahoo.com");
		
		WebElement ST = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state =new Select(ST);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("updation of contact");
		driver.findElement(By.xpath("(//input[@name=\"submitButton\"])[1]")).click();
		
		
		String title = driver.getTitle();
        System.out.println(title);
		
		
		
	}

}
