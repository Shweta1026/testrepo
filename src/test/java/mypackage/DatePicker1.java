package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker1 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("onwardCal")).click();
		
		String date="25";
		String month="Feb";
		String year="2024";
		//month and year selection
		while(true) {
			String monthyear=driver.findElement(By.xpath("//*[@id='onwardCal']/div/div[2]/div/div/div[1]/div[2]")).getText();
			System.out.println(monthyear);
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			System.out.println(mon);
			System.out.println(yr);
			if(mon.equalsIgnoreCase(month) && yr.equals(year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[3]")).click();
			}
		}
		
		//date selection
		
		List<WebElement> calCol=driver.findElements(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]//span/div"));
		
		for(WebElement ele:calCol) {
			String da= ele.getText();
			if(da.equals(date)) {
				ele.click();
				break;
			}
		}
		
	}

}
