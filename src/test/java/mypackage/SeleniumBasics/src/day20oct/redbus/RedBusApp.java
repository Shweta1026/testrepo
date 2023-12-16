package day20oct.redbus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtil;

public class RedBusApp {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://www.redbus.in/");
		// source
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Pune");

		List<WebElement> srcList = driver.findElements(By.cssSelector(".sc-dnqmqq>li>div>text"));

		System.out.println("src count : " + srcList.size());
		for (int i = 0; i < srcList.size(); i++) {
			if (srcList.get(i).getText().contains("Swargate")) {
				srcList.get(i).click();
				break;
			}
		}

		// Destination

		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Goa");

		List<WebElement> destList = driver.findElements(By.cssSelector(".sc-dnqmqq>li>div>text"));
		System.out.println("dest count : " + destList.size());

		for (int i = 0; i < driver.findElements(By.cssSelector(".sc-dnqmqq>li>div>text")).size(); i++) {
			if (destList.get(i).getText().contains("Panjim")) {
				destList.get(i).click();
			}
		}

		// date selection

		driver.findElement(By.xpath("//span[@class='dateText']"));
		driver.findElement(By.xpath("//*[@id='onwardCal']/div/i")).click();

		driver.findElement(By.cssSelector("svg#Layer_1")).click();
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div[3]/span/div[5]/span"))
				.click();
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		driver.findElement(By.xpath("//label[@for='dtBefore 6 am']")).click();
		driver.findElement(By.className("icon-close")).click();
		System.out.println("*************************************************");

		driver.findElement(By.xpath("//*[@id='result-section']/div[2]/div/div[2]/div/div[4]/div[2]")).click();		WebElement name=driver.findElement(By.xpath("//div[div[div[@class='travels lh-24 f-bold d-color']]]/div[1]"));
        WebElement cost=driver.findElement(By.xpath("//div[div[div[@class='travels lh-24 f-bold d-color']]]/div[6]"));
        System.out.println("Name of bus 1 : "+name.getText()+"\n cost is : "+cost.getText());
       System.out.println("*************************************************");
        
        WebElement name1=driver.findElement(By.xpath("//*[@id='26094612']/div/div/div/div[1]/div"));
      WebElement cost1=driver.findElement(By.xpath("//*[@id='26094612']/div/div/div/div[6]/div/div"));
        System.out.println("Name of bus 2 : "+name1.getText()+"\n cost is : "+cost1.getText());
        System.out.println("*************************************************");
       
        WebElement name2=driver.findElement(By.xpath("//*[@id='22921872']/div/div/div/div/div[1]"));
       WebElement cost2=driver.findElement(By.xpath("//*[@id='22921872']/div/div/div/div[6]/div/div"));
        System.out.println("Name of bus 3 : "+name2.getText()+"\n cost is : "+cost2.getText());
        System.out.println("*************************************************");
        
        

//		List<WebElement> matching = driver
//				.findElements(By.cssSelector("div#result-section>*:nth-child(2)>*:nth-child(2)>ul>div>li>div>div>div>div>div"));
//		System.out.println("no. of matched buses : " + matching.size());

//		for (int i = 0; i < matching.size(); i++) {
//			System.out.println(matching.get(i).getText());
//		}
	}

}
