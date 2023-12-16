package day4oct.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		String s=driver.getTitle();
		System.out.println("Title : "+s);
		System.out.println("Title length : "+s.length());
		
		String s1=driver.getCurrentUrl();
		System.out.println("current url : "+s1);
		
		String s3="https://demo.actitime.com";
		System.out.println("verify url & checking correct page is append or not : "+s1.equals(s3));
		
		String s2=driver.getPageSource();
		System.out.println("page source length : "+s2.length());
        driver.close();
	}

}
