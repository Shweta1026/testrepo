package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframe2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		System.out.println("text present in inner frame is : "+driver.findElement(By.tagName("h1")).getText());
		driver.switchTo().parentFrame();
		
		System.out.println("text in parent frame : "+driver.findElement(By.xpath("/html/body/p")).getText());
		
	}

}
