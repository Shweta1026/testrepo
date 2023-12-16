package day13oct.multipleelementshandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena1 {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("https://www.gsmarena.com/samsung-phones-9.php");
     
     List<WebElement> mobiles=driver.findElements(By.cssSelector("div#review-body>div.makers>ul>li>a>strong>span"));
     System.out.println("no. of samsung mobiles  : "+mobiles.size());
     
     for(int i=0;i<mobiles.size();i++) {
    	 System.out.println(mobiles.get(i).getText());
     }

	}

}
