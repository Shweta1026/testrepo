package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopups {

	public static void main(String[] args) {
		//how to handle authentication popups
		
		WebDriver driver=new ChromeDriver();
		//https://username:password"@url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
