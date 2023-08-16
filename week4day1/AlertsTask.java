package week4day1;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTask {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[text()='Show']")).click();
        // to handle the alert -bring the focus of driver to alert box
        Alert alert = driver.switchTo().alert();
        // accept -->ok button
        alert.accept();
        driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
        String text = alert.getText();
        System.out.println(text);
        //cancel the alert message
       /* alert.dismiss();
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Robert");
        prompt.accept();
         */

	}

}
