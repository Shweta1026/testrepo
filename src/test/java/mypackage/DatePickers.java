package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePickers {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("datepicker")).click();
		
		String date="25";
		String month="february";
		String year="2024";
		//month and year selection
		while(true) {
			String monthyear=driver.findElement(By.className("ui-datepicker-title")).getText();
			
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}
		
		//date selection
		
		List<WebElement> calCol=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
		
		for(WebElement ele:calCol) {
			String da= ele.getText();
			if(da.equals(date)) {
				ele.click();
				break;
			}
		}
		
		
		}

	}
	


