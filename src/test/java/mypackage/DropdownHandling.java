package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
    
	WebElement ele=driver.findElement(By.id("daybox"));
	
	Select slt=new Select(ele);
	System.out.println(slt.getFirstSelectedOption().getText());
	
	List<WebElement> days=slt.getOptions();
	System.out.println("no. of days : "+days.size());
	
	for(int i=1;i<days.size();i++) {
		System.out.print(days.get(i).getText()+",");
	}
	System.out.println();
    
	String expectedDays="1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31";
	String actualDays="";
	for(int i=1;i<days.size();i++) {
	if(i<days.size()-1) {
		actualDays=actualDays+days.get(i).getText()+",";
	}
	else {
		actualDays=actualDays+days.get(i).getText();
	}
	
	}
	System.out.println(actualDays);
	
	System.out.println("is options are in sequence : "+expectedDays.equals(actualDays));
	
	//***************list in asc order or not ********
	
	List orgList=new ArrayList();
	for(int i=1;i<days.size();i++) {
		orgList.add(days.get(i).getText());
	}
	
	System.out.println("orgList : "+orgList);
	
	List tempList=new ArrayList();
	tempList=orgList;
	System.out.println("tempList : "+tempList);
	Collections.sort(tempList);
	
	if(tempList.equals(orgList)) {
		System.out.println("list is sorted");
	}
	
	
}
}
