package day14oct.dropdownhandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandlingForDay {
	public static WebDriver setUp(String browserName,String url) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();}
//		else if(browserName.equalsIgnoreCase("firefox")) {
//			 driver=new FireFoxDriver();
//		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		return driver;
	}
	public static void main(String[] args) {
WebDriver driver=setUp("chrome","https://demo.automationtesting.in/Register.html");
		
		WebElement day=driver.findElement(By.id("daybox"));
		Select slt=new Select(day);
		
		List<WebElement> dayList=slt.getOptions();
		
		for(WebElement e:dayList) {
			System.out.println(e.getText());
		}
		String expectedDate="Day,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31";
		String actualDate="";
		
		for(int i=0;i<dayList.size();i++) {
			if(i<dayList.size()-1) {
				actualDate=actualDate+dayList.get(i).getText()+",";
			}else {
				actualDate=actualDate+dayList.get(i).getText();
			}
		}
		System.out.println(actualDate);
		System.out.println("are options in sequence : "+expectedDate.equals(actualDate));
		
		//validate dates are in asc order
		List originalList=new ArrayList();
		for(int i=0;i<dayList.size();i++) {
			originalList.add(dayList.get(i).getText());
		}
		System.out.println("original list : "+originalList);
		List tempList=new ArrayList();
		tempList=originalList;
		System.out.println("temp list is : "+tempList);
		Collections.sort(tempList);
		if(tempList.equals(originalList)) {
			System.out.println("days are sorted in ascending");
		}else {
			System.out.println("days are not sorted in ascending");
		}
	}

}
