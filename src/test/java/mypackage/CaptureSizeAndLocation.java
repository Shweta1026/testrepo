package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureSizeAndLocation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		
		Point loc=ele.getLocation();
		System.out.println("x co-ordinate : "+loc.getX());
		System.out.println("y co-ordinate : "+loc.getY());
		
		Dimension size=ele.getSize();
		System.out.println("height of ele : "+size.getHeight());
		System.out.println("width of ele : "+size.getWidth());

	}

}
