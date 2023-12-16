package day14oct.dropdownhandling;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Std_DropdownHandling {

	public static WebDriver setUp(String browserName, String url) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		return driver;
	}

	public static void main(String[] args) {

		WebDriver driver = setUp("chrome", "https://demo.automationtesting.in/Register.html");
		//step1: identify dropdown list
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		//Step2: create instance of Select class and pass above dropdown object to its constructor
		Select slt=new Select(skillDropdown);
		
		System.out.println("Is multi-select allowed or not? "+slt.isMultiple());
		
		System.out.println("Default selected value is: "+slt.getFirstSelectedOption().getText());
		
		List<WebElement> skillList=slt.getOptions();
		System.out.println("Skill count: "+skillList.size());
		
		for(int i=0;i<skillList.size();i++) {
			System.out.println(skillList.get(i).getText());
		}
		
		slt.selectByIndex(2);
		System.out.println("select value from dropdown using index option:"+slt.getFirstSelectedOption().getText());
		
		slt.selectByValue("Android");
		System.out.println("select value from dropdown using value option: "+slt.getFirstSelectedOption().getText());

		slt.selectByVisibleText("Backup Management");
		System.out.println("select value from dropdown using visible text option: "+slt.getFirstSelectedOption().getText());

		//validate dropdown element sequence 
		String expectedOptions="Select Skills,Adobe InDesign,Adobe Photoshop,Analytics,Android,APIs,Art Design,AutoCAD,Backup Management,C,C++,Certifications,Client Server,Client Support,Configuration,Content Managment,Content Management Systems (CMS),Corel Draw,Corel Word Perfect,CSS,Data Analytics,Desktop Publishing,Design,Diagnostics,Documentation,End User Support,Email,Engineering,Excel,FileMaker Pro,Fortran,HTML,Implementation,Installation,Internet,iOS,iPhone,Linux,Java,Javascript,Mac,Matlab,Maya,Microsoft Excel,Microsoft Office,Microsoft Outlook,Microsoft Publisher,Microsoft Word,Microsoft Visual,Mobile,MySQL,Networks,Open Source Software,Oracle,Perl,PHP,Presentations,Processing,Programming,PT Modeler,Python,QuickBooks,Ruby,Shade,Software,Spreadsheet,SQL,Support,Systems Administration,Tech Support,Troubleshooting,Unix,UI / UX,Web Page Design,Windows,Word Processing,XML,XHTML";
		String acutaulOptions="";
		
		for(int i=0;i<skillList.size();i++) {
			if(i<skillList.size()-1) {
			acutaulOptions=acutaulOptions+skillList.get(i).getText()+",";
			}else {
				acutaulOptions=acutaulOptions+skillList.get(i).getText();
			}
		}
		System.out.println("Actual Options: "+acutaulOptions);		
		System.out.println("is Options sequence correct? "+acutaulOptions.equals(expectedOptions));
		
		//TODO: Year, Month & Day ---> 
	}
}
/*
  dropdown has multiple select option or not
  default selected value of dropdown
  option count and name printing
  selecting option from dropdown and validating selection
  
  Validations:
  	1.Options should be same as expected
  	2.OPtions should be shown in ascending / descending order
 */
