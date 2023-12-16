package mypackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement drp=driver.findElement(By.id("yearbox"));
		Select slt=new Select(drp);
		List<WebElement> drpList=slt.getOptions();
		System.out.println(drpList.size());
		
		List orgList=new ArrayList();
		for(WebElement item:drpList) {
			orgList.add(item.getText());
		}
		List tempList=new ArrayList();
             tempList=orgList;
             System.out.println("org list : "+orgList);
             System.out.println("temp list : "+tempList);
             
             Collections.sort(tempList);
             System.out.println("after sorting temp list : "+tempList);
             if(tempList.equals(orgList)) {
            	 System.out.println("list is already sorted ...");
             }
	}

}
