package day11oct.cssattributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiComponentCSSVaidationOrangeHRM {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement loginButton=driver.findElement(By.className("orangehrm-login-button"));
		 System.out.println("is login button display? : "+loginButton.isDisplayed());
		 System.out.println("is login button enable? : "+loginButton.isEnabled());
		 System.out.println("text of login button : "+loginButton.getText());
		 
		 System.out.println("log in button background color : "+loginButton.getCssValue("background-color"));
		 System.out.println("log in button background color : "+loginButton.getCssValue("color"));
		 System.out.println("log in button background color : "+loginButton.getCssValue("font-size"));
		 System.out.println("log in button background color : "+loginButton.getCssValue("font-family"));
		 
		 WebElement forgotPwd=driver.findElement(By.className("orangehrm-login-forgot-header"));
		 System.out.println("forgot psw visibility : "+forgotPwd.isDisplayed());
		 System.out.println("forgot psw enable or not : "+ forgotPwd.isEnabled());
		 System.out.println("fogot psw text : "+forgotPwd.getText());
		 
		 Point pt_login=loginButton.getLocation();
		 System.out.println("x co-ordinate of login button : "+pt_login.getX());
		 System.out.println("y co-ordinate of login button : "+pt_login.getY());
		
		 Point pt_forgotPwd=forgotPwd.getLocation();
		 System.out.println("x co-ordinate of forgotPwd button : "+pt_forgotPwd.getX());
		 System.out.println("y co-ordinate of forgotPwd button : "+pt_forgotPwd.getY());
		 
		 System.out.println("is forgot pwd link is below login button? :"+(pt_login.getY()<pt_forgotPwd.getY()));
	}

	}


