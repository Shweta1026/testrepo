package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		List<WebElement> srcPhotos=driver.findElements(By.xpath("//ul[@id='gallery']/li"));
		WebElement destPhotos=driver.findElement(By.id("trash"));
		Actions act=new Actions(driver);
		
		for(WebElement src:srcPhotos) {
			act.dragAndDrop(src, destPhotos).build().perform();
			Thread.sleep(3000);
			
		}
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//div[@class='full_container_page_title']//div[@class='sixteen columns']/div[2]/h1")).getText());
	}

}
