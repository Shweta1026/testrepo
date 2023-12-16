package day6oct.waitassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.opencart.com/");
        driver.findElement(By.className("d-md-inline")).click();
        driver.findElement(By.className("dropdown-item")).click();
        driver.findElement(By.id("input-email")).sendKeys("john@123");
        driver.findElement(By.id("input-password")).sendKeys("1234");
        driver.findElement(By.className("btn")).click();
	}


}
