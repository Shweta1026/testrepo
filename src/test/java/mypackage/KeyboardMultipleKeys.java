package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMultipleKeys {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		
		WebElement input1=driver.findElement(By.id("inputText1"));
		WebElement input2=driver.findElement(By.id("inputText2"));
		
		input1.sendKeys("Welcome to selenium...");
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		act.sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		if(input1.getText().equals(input2.getText())) {
			System.out.println("Text copied");
		}
		else {
			System.out.println("fail");
		}

	}

}
