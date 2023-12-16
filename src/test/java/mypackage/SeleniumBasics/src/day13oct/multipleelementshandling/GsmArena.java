package day13oct.multipleelementshandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gsmarena.com/");
		
		List<WebElement> mobileList=driver.findElements(By.cssSelector("div.brandmenu-v2>ul>li>a"));
        System.out.println("no. of mobiles in list : "+mobileList.size());
        
        for(int i=0;i<mobileList.size();i++) {
        	System.out.println(mobileList.get(i).getText());
        }
	}

}
