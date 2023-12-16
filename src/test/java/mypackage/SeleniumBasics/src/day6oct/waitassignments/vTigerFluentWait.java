package day6oct.waitassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vTigerFluentWait {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement userInputField=driver.findElement(By.id("username"));
		userInputField.clear();
		userInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("admin");
		

		driver.findElement(By.tagName("button")).click();
		
		String expectedHomePageTitle="Dashboard";
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(40)) //total time
				.pollingEvery(Duration.ofSeconds(5)) //retry time
				.ignoring(NoSuchElementException.class); 
		
        wait.until(ExpectedConditions.elementToBeClickable(By.className("keyword-input")));
		
		System.out.println("expected Home Page Title : "+expectedHomePageTitle);
		String actualHomePageTitle=driver.getTitle();
		System.out.println(actualHomePageTitle);
		System.out.println("is log in successful : "+expectedHomePageTitle.equals(actualHomePageTitle));
		
		driver.findElement(By.className("fa-user")).click();
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
 		String expectedLoginPageTitle="vtiger";
 		wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		System.out.println("expectedLoginPageTitle : "+expectedLoginPageTitle);
		String actualLoginPageTitle=driver.getTitle();
		System.out.println("actualLoginPageTitle : "+actualLoginPageTitle);
		System.out.println("is log out successful : "+expectedLoginPageTitle.equals(actualLoginPageTitle));
		

	}

}
