package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.expedia.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//form[@id='lodging_search_form']/div/div/div[2]")).click();
		
		String month="february";
		String year="2024";
		String date="10";
		
		while(true) {
		String monthyear=driver.findElement(By.xpath("//span[@class='uitk-align-center uitk-month-label']")).getText();
		
		String[] arr=monthyear.split(" ");
		String mon=arr[0];
		String yr=arr[1];
		
		if(mon.equalsIgnoreCase(month) && yr.equals(year)) {
			break;
		}
		else {
			driver.findElement(By.xpath("//div[@class='uitk-cal-controls']/div[2]")).click();
		}
		
		List<WebElement> columns=driver.findElements(By.xpath("//table[@class='uitk-month-table']//tbody//td"));
		
		for(WebElement col:columns) {
			String da=col.getText();
			if(da.equals(date)) {
				col.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[@data-stid='apply-date-selector']")).click();
			
		}
		
		

	}

}
