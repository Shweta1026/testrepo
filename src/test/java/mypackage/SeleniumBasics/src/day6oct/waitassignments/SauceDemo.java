package day6oct.waitassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String expectedHomePageUrl="https://www.saucedemo.com/inventory.html";
		String title="Swag Labs";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(title));
		
		String actualHomePageUrl=driver.getCurrentUrl();
		System.out.println("Is log in succeeful ? "+expectedHomePageUrl.equals(actualHomePageUrl));
	    driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		String expectedLoginPageUrl="https://www.saucedemo.com/";
		wait.until(ExpectedConditions.titleIs(title));
		String actualLoginpageUrl=driver.getCurrentUrl();
		System.out.println("is log out successful? "+expectedLoginPageUrl.equals(actualLoginpageUrl));
	}

}
