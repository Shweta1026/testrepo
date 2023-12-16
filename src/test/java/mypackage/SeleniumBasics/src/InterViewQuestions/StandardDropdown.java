package InterViewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.SeleniumUtil;

public class StandardDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=SeleniumUtil.setUp("chrome","https://demo.automationtesting.in/Register.html");
		
		WebElement yearEle=driver.findElement(By.id("yearbox"));
		WebElement monthEle=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		WebElement dayEle=driver.findElement(By.xpath("//select[@placeholder='Day']"));
		
//		Select yearDrp=new Select( yearEle);
//		
//		System.out.println("is dropdown multiple ? : "+yearDrp.isMultiple());
//		
//		List<WebElement> yearList=yearDrp.getOptions();
//		
//		for(int i=0;i<yearList.size();i++) {
//			System.out.println(yearList.get(i).getText());
//		}
		
		//yearDrp.selectByValue("1939");
		//yearDrp.selectByIndex(2);
		//yearDrp.selectByVisibleText("1940");
//		for(int i=0;i<yearList.size();i++) {
//			if(yearList.get(i).getText().equals("1950")) {
//				yearList.get(i).click();
//				break;
	//		}
		selectOptionFromDropdown( yearEle,"1960");
		selectOptionFromDropdown( monthEle,"June");
		selectOptionFromDropdown( dayEle,"25");
		
		}
	public static void selectOptionFromDropdown(WebElement element,String value) {
		  
		Select drp=new Select(element);
		List<WebElement> drpList=drp.getOptions();
		for(int i=0;i<drpList.size();i++) {
			if(drpList.get(i).getText().equals(value)) {
				drpList.get(i).click();
				break;
			}
		}
		
		List<WebElement> yearList=
	}
		
	}


