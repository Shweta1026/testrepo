package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL,"r");
		
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("mobiles",Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']/a[2]")).click();
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
	}

}
