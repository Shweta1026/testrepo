package day4oct.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		String s=driver.getTitle();
		System.out.println("Title : "+s);
		System.out.println("Title length : "+s.length());
		
		String s1=driver.getCurrentUrl();
		System.out.println("current url : "+s1);
		
		String s3=" Facebook – log in or sign up";
		System.out.println("verify title : "+s.equals(s3));
		
		String s2=driver.getPageSource();
		System.out.println("page source length : "+s2.length());
        

	}

}
