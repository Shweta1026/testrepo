package mypackage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//captureookies from browser
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("no.of cookies available : "+cookies.size());
		
		//print cookies from browser
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+" : "+cookie.getValue());
		}
		
		//add cookie
		Cookie cookiObj=new Cookie("mycookie123","12345");
		driver.manage().addCookie(cookiObj);
		
		cookies=driver.manage().getCookies();
		System.out.println("no.of cookies after addition : "+cookies.size());
		
		//delete cookie
		
		//driver.manage().deleteCookie(cookiObj);
		driver.manage().deleteCookieNamed("mycookie123");
		cookies=driver.manage().getCookies();
		System.out.println("no.of cookies after deletion : "+cookies.size());
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("no.of cookies after deleting all cookies : "+cookies.size());
		
	}

}
