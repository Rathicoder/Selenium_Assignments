package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class WindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@href=\"https://www.air.irctc.co.in\"]")).click();
        Set <String> winhan = driver.getWindowHandles();
        List <String> Flight = new ArrayList<String>(winhan);
        driver.switchTo().window(Flight.get(1));
        System.out.print(driver.getTitle());
        driver.switchTo().window((Flight.get(0))).close();
	}

}
