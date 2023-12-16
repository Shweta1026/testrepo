package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']/a[2]")).click();
		for(int i=0;i<=12;i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		for(int i=0;i<=12;i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_UP);
			Thread.sleep(2000);
		}
	}

}
