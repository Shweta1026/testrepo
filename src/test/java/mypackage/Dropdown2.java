package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[@id='bsd3-button']")).click();
		List<WebElement> drpList=driver.findElements(By.xpath("//div[@class='dropdown-menu dropdown-menu-right show']/div/a"));
		System.out.println(drpList.size());
		
		for(WebElement item:drpList) {
			if(item.getText().contains("India")) {
				item.click();
			}
		}
	}

}
