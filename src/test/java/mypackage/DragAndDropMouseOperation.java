package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMouseOperation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement src1=driver.findElement(By.id("box6"));
		WebElement dest1=driver.findElement(By.id("box106"));
         Actions act=new Actions(driver);
         act.dragAndDrop(src1, dest1).perform();
         
         WebElement src2=driver.findElement(By.id("box5"));
 		WebElement dest2=driver.findElement(By.id("box105"));
          
          act.dragAndDrop(src2, dest2).perform();
	}

}
