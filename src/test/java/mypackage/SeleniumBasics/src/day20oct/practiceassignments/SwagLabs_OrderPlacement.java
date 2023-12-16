package day20oct.practiceassignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabs_OrderPlacement {

	
		public static WebDriver setUp(String browserName, String url) {
			WebDriver driver=null;
		   if(browserName.equalsIgnoreCase("chrome")) {
			    driver=new ChromeDriver();
		   }//else if(browserName.equalsIgnoreCase("firefox")) {
			//   driver=new FirefoxDriver();
		   //}
		   driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.get(url);
			return driver;
		}

		public static void main(String[] args) {
			WebDriver driver=setUp("chrome","https://www.saucedemo.com");
			
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			
			//Add to cart
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			driver.findElement(By.className("shopping_cart_link")).click();
			driver.findElement(By.id("checkout")).click();
			
			
			driver.findElement(By.id("first-name")).sendKeys("PQR");
			driver.findElement(By.id("last-name")).sendKeys("XYZ");
			driver.findElement(By.id("postal-code")).sendKeys("411057");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("finish")).click();
			driver.findElement(By.id("back-to-products")).click();
			
			System.out.println("bye");
			

	}

}
