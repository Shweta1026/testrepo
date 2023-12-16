package day14oct.dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static WebDriver setUp(String browserName, String url) {
		WebDriver driver=null;
	   if(browserName.equalsIgnoreCase("chrome")) {
		    driver=new ChromeDriver();
	   }//else if(browserName.equalsIgnoreCase("firefox")) {
		//   driver=new FirefoxDriver();
	   //}
	   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		return driver;
	}
	public static void main(String[] args) {
		WebDriver driver=setUp("chrome","https://demo.actitime.com/login.do");
		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		
		usernameInputField.sendKeys(driver.findElement(By.cssSelector("#demoCredentials>tbody>tr>*:nth-child(2)>b")).getText());
		passwordInputField.sendKeys(driver.findElement(By.cssSelector("#demoCredentials>tbody>*:nth-child(2)>td>b")).getText());
		
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("logoutLink")).click();
		
		WebElement usernameInputField1=driver.findElement(By.id("username"));
		usernameInputField1.sendKeys(driver.findElement(By.cssSelector("#demoCredentials>tbody>*:nth-child(3)>*:nth-child(2)>b")).getText());
		
		WebElement passwordInputField1=driver.findElement(By.name("pwd"));
		passwordInputField1.sendKeys(driver.findElement(By.cssSelector("#demoCredentials>tbody>*:nth-child(4)>td>b")).getText());
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("logoutLink")).click();
	}

}
