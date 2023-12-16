package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkinNewTab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		
		driver.findElement(By.linkText("Register")).sendKeys(tab);

	}

}
