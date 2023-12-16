package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RangeSliderHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement min_ele=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
	    Dimension size=min_ele.getSize();
	    System.out.println("height of ele"+size.getHeight());
	    System.out.println("width of ele"+size.getWidth());
	    
		Point pt_loc=min_ele.getLocation();
		//Point pt_y=min_ele.getLocation();
		System.out.println("location of element :"+pt_loc);
		
		System.out.println("x coordinate : "+pt_loc.getX());
		System.out.println("Y coordinate : "+pt_loc.getY());
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_ele, 100, 0).perform();
		
		
		
		System.out.println("location of element :"+min_ele.getLocation());
		
		WebElement max_ele=driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
		System.out.println(max_ele.getLocation());
		act.dragAndDropBy(max_ele, -100, 0).perform();
		System.out.println(max_ele.getLocation());
		

	}

}
