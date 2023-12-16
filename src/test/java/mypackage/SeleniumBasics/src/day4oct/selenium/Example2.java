package day4oct.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		String s=driver.getTitle();
		System.out.println("Title : "+s);
		
		String s1=driver.getCurrentUrl();
		System.out.println("current url : "+s1);
		
		String pageSource=driver.getPageSource();
		
		System.out.println("Length of page source : "+ pageSource.length());
        driver.close();
	}

}
