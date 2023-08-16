package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        Alert confirm = driver.switchTo().alert();
        confirm.accept();
        String alert = driver.findElement(By.id("demo")).getText();
        System.out.print(alert);
        
        		
        
        
        
	}

}
/*ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/frame.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // bring driver focus into frame
        driver.switchTo().frame(0);//using index
        driver.findElement(By.id("Click")).click();
        //exit from the frame to the main content page
        driver.switchTo().defaultContent();*/