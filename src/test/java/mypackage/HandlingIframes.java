package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingIframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//handling single iframe
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		//handling iframe within iframe
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		WebElement outerFrame=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);
		
		WebElement innerFrame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		

	}

}
