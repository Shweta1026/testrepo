package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteGooglePlacesDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Live Posting']"));
        
        ele.click();
        WebElement ele1=driver.findElement(By.id("autocomplete"));
        ele1.clear();
        ele1.sendKeys("Toronto");
        
//        List<WebElement> list=driver.findElements(By.cssSelector(".pac-container.pac-logo>.pac-item"));
//        
//        System.out.println("list size : "+list.size());
//        
//        for(WebElement item:list) {
//        	if(item.getText().contains("OH, USA")) {
//        		item.click();
//        		break;
//        	}
//        }
        
        //or through keyboard
        String text;
        do {
        	ele1.sendKeys(Keys.ARROW_DOWN);
        	text=ele1.getAttribute("value");
        	if(text.equals("Toronto,ON,Canada")) {
        		ele1.sendKeys(Keys.ENTER);
        		break;
        	}
        	Thread.sleep(3000);
        	
        }while(!text.isEmpty());
        
	}

}
