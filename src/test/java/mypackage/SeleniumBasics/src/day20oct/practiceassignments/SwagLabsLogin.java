package day20oct.practiceassignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabsLogin {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.manage().window().maximize();
		Driver.get("https://www.saucedemo.com/");

		String usernames = Driver.findElement(By.id("login_credentials")).getText();
		String[] UserList = usernames.split("\n");
		System.out.println("Usernames : "+usernames);
		
		String Passwords = Driver.findElement(By.className("login_password")).getText();
		System.out.println("Passwords: "+Passwords);
		String[] Password = Passwords.split("\n");
		System.out.println("Password: "+Password[1]);
System.out.println("**************************************************************************");		
System.out.println("Login Using Username: standard_user , & Password: secret_sauce ");
		
		Driver.findElement(By.id("user-name")).sendKeys(UserList[1]);
		Driver.findElement(By.id("password")).sendKeys(Password[1]);
		Driver.findElement(By.id("login-button")).click();
		
		WebDriverWait wait =new  WebDriverWait(Driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
		
		String ExpectedHomePageURL_1 = "https://www.saucedemo.com/inventory.html";
		String ActualHomePageURL_1 = Driver.getCurrentUrl();
		System.out.println("Is Login Successfull: "+ActualHomePageURL_1.equals(ExpectedHomePageURL_1));
		
		Driver.findElement(By.id("react-burger-menu-btn")).click();
		Driver.findElement(By.id("logout_sidebar_link")).click();
		
		WebDriverWait wait2 =new  WebDriverWait(Driver, Duration.ofSeconds(30));
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		
		String ExpectedLoginPageURL_1 = "https://www.saucedemo.com/";
		String ActualLoginPageURL_1 = Driver.getCurrentUrl();
		System.out.println("Is Logout Successfull: "+ActualLoginPageURL_1.equals(ExpectedLoginPageURL_1));

System.out.println("**************************************************************************");
System.out.println("Login Using Username: locked_out_user , & Password: secret_sauce ");
		
		Driver.findElement(By.id("user-name")).sendKeys(UserList[2]);
		Driver.findElement(By.id("password")).sendKeys(Password[1]);
		Driver.findElement(By.id("login-button")).click();
		System.out.println("Is Login Successfull: "+"Sorry, this user has been locked out.");
	
System.out.println("**************************************************************************");
System.out.println("Login Using Username: problem_user , & Password: secret_sauce ");

		Driver.findElement(By.id("user-name")).clear();
		Driver.findElement(By.id("user-name")).sendKeys(UserList[3]);
		Driver.findElement(By.id("password")).clear();
		Driver.findElement(By.id("password")).sendKeys(Password[1]);
		Driver.findElement(By.id("login-button")).click();
		
		WebDriverWait wait3 =new  WebDriverWait(Driver, Duration.ofSeconds(30));
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
		
		String ExpectedHomePageURL_3 = "https://www.saucedemo.com/inventory.html";
		String ActualHomePageURL_3 = Driver.getCurrentUrl();
		System.out.println("Is Login Successfull: "+ActualHomePageURL_3.equals(ExpectedHomePageURL_3));
		
		Driver.findElement(By.id("react-burger-menu-btn")).click();
		Driver.findElement(By.id("logout_sidebar_link")).click();
		
		WebDriverWait wait4 =new  WebDriverWait(Driver, Duration.ofSeconds(30));
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		
		String ExpectedLoginPageURL_3 = "https://www.saucedemo.com/";
		String ActualLoginPageURL_3 = Driver.getCurrentUrl();
		System.out.println("Is Logout Successfull: "+ActualLoginPageURL_3.equals(ExpectedLoginPageURL_3));
		
System.out.println("**************************************************************************");
System.out.println("Login Using Username: performance_glitch_user , & Password: secret_sauce ");
		
		Driver.findElement(By.id("user-name")).sendKeys(UserList[4]);
		Driver.findElement(By.id("password")).sendKeys(Password[1]);
		Driver.findElement(By.id("login-button")).click();
		
		WebDriverWait wait5 =new  WebDriverWait(Driver, Duration.ofSeconds(30));
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));

		String ExpectedHomePageURL_4 = "https://www.saucedemo.com/inventory.html";
		String ActualHomePageURL_4 = Driver.getCurrentUrl();
		System.out.println("Is Login Successfull: "+ActualHomePageURL_4.equals(ExpectedHomePageURL_4));
		
		Driver.findElement(By.id("react-burger-menu-btn")).click();
		Driver.findElement(By.id("logout_sidebar_link")).click();
		
		WebDriverWait wait6 =new  WebDriverWait(Driver, Duration.ofSeconds(30));
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		
		String ExpectedLoginPageURL_4 = "https://www.saucedemo.com/";
		String ActualLoginPageURL_4 = Driver.getCurrentUrl();
		System.out.println("Is Logout Successfull: "+ActualLoginPageURL_4.equals(ExpectedLoginPageURL_4));
		
System.out.println("**************************************************************************");
System.out.println("Login Using Username: error_user , & Password: secret_sauce ");
				
		Driver.findElement(By.id("user-name")).sendKeys(UserList[5]);
		Driver.findElement(By.id("password")).sendKeys(Password[1]);
		Driver.findElement(By.id("login-button")).click();
		
		WebDriverWait wait7 =new  WebDriverWait(Driver, Duration.ofSeconds(30));
		wait7.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));

		String ExpectedHomePageURL_5 = "https://www.saucedemo.com/inventory.html";
		String ActualHomePageURL_5 = Driver.getCurrentUrl();
		System.out.println("Is Login Successfull: "+ActualHomePageURL_5.equals(ExpectedHomePageURL_5));
		
		Driver.findElement(By.id("react-burger-menu-btn")).click();
		Driver.findElement(By.id("logout_sidebar_link")).click();
		
		WebDriverWait wait8 =new  WebDriverWait(Driver, Duration.ofSeconds(30));
		wait8.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		
		String ExpectedLoginPageURL_5 = "https://www.saucedemo.com/";
		String ActualLoginPageURL_5 = Driver.getCurrentUrl();
		System.out.println("Is Logout Successfull: "+ActualLoginPageURL_5.equals(ExpectedLoginPageURL_5));
		
System.out.println("**************************************************************************");
System.out.println("Login Using Username: visual_user , & Password: secret_sauce ");
								
		Driver.findElement(By.id("user-name")).sendKeys(UserList[5]);
		Driver.findElement(By.id("password")).sendKeys(Password[1]);
		Driver.findElement(By.id("login-button")).click();
		
		WebDriverWait wait9 =new  WebDriverWait(Driver, Duration.ofSeconds(30));
		wait9.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));

		String ExpectedHomePageURL_6 = "https://www.saucedemo.com/inventory.html";
		String ActualHomePageURL_6 = Driver.getCurrentUrl();
		System.out.println("Is Login Successfull: "+ActualHomePageURL_6.equals(ExpectedHomePageURL_6));
		
		Driver.findElement(By.id("react-burger-menu-btn")).click();
		Driver.findElement(By.id("logout_sidebar_link")).click();
		
		WebDriverWait wait10 =new  WebDriverWait(Driver, Duration.ofSeconds(30));
		wait10.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		
		String ExpectedLoginPageURL_6 = "https://www.saucedemo.com/";
		String ActualLoginPageURL_6 = Driver.getCurrentUrl();
		System.out.println("Is Logout Successfull: "+ActualLoginPageURL_6.equals(ExpectedLoginPageURL_6));
		
		
		
	}
	
}
