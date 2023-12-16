package day13oct.multipleelementshandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfo {
	public static WebDriver setUp(String browserName,String url) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		return driver;
		
	}

	public static void main(String[] args) {
	 WebDriver driver=setUp("chrome","https://www.espncricinfo.com/");
         
	 List<WebElement> menuItems=driver.findElements(By.cssSelector("div.ds-flex.ds-flex-row>div.ds-popper-wrapper>a"));
	 System.out.println("no. of menu items : "+menuItems.size());
	 for(int i=0;i<menuItems.size();i++) {
		 System.out.println(menuItems.get(i).getText());
	 }
	}

}
