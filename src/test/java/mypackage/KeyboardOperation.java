package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		
		WebElement input=driver.findElement(By.id("target"));
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.ARROW_RIGHT).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.ADD).perform();
		Thread.sleep(3000);
	}

}
