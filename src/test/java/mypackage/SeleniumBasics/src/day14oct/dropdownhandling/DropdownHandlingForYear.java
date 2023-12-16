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

public class DropdownHandlingForYear {
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
		
		WebElement year=driver.findElement(By.id("yearbox"));
		
		Select slt=new Select(year);
		System.out.println("get selected option : "+slt.getFirstSelectedOption().getText());
		
	    List<WebElement> yearList=slt.getOptions();
	    System.out.println("no.of years : "+yearList.size());
	    for(int i=0;i<yearList.size();i++) {
	    	System.out.println(yearList.get(i).getText());
	    }
	    
	    slt.selectByIndex(3);
	    System.out.println("option selected by using index : "+slt.getFirstSelectedOption().getText());
	    		
         slt.selectByVisibleText("1920");
         System.out.println("option selected by using index : "+slt.getFirstSelectedOption().getText());
         
         slt.selectByValue("1930");
         System.out.println("option selected by using index : "+slt.getFirstSelectedOption().getText());
         
         String expectedYears="year,1916,1917,1918,1919,1920,1921,1922,1923,1924,1925,1926,1927,1928,1929,1930,1931,1932,1933,1934,1935,1936,1937,1938,1939,1940,1941,1942,1943,1944,1945,1946,1947,1948,1949,1950,1951,1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015";
         String actualYears="";
         for(int i=0;i<yearList.size();i++) {
        	 if(i<yearList.size()-1) {
        		 actualYears=actualYears+yearList.get(i).getText()+",";
        	 }
        	 else {
        		 actualYears=actualYears+ yearList.get(i).getText();
        	 }
        	 
         }
         System.out.println("actual year list is : "+actualYears);
         System.out.println("is option sequence is correct : "+expectedYears.equals(actualYears));
        
         // validate list is ascendingg or not
        List originalList=new ArrayList();
        
        for(int i=0;i<yearList.size();i++) {
        	originalList.add(yearList.get(i).getText());
        }
        System.out.println("original List is : "+originalList);
        List temporaryList=new ArrayList();
        temporaryList=originalList;
        System.out.println("temporary list is : "+temporaryList);
        
        Collections.sort(temporaryList);
        if(originalList.equals(temporaryList)) {
        	System.out.println("years are sorted in a dropdown");
        }else {
        	System.out.println("years are not sorted in a dropdown");
        }
	}

}
