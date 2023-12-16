package day14oct.dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
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
		
		WebElement skills=driver.findElement(By.id("Skills"));
		Select slt=new Select(skills);
		
		System.out.println("get selected option : "+slt.getFirstSelectedOption().getText());
		
		List<WebElement> opt=slt.getOptions();
		System.out.println("no.of options in a list : "+opt.size());
		for(int i=0;i<opt.size();i++) {
			System.out.println(opt.get(i).getText());
		}
       
		slt.selectByIndex(2);
		System.out.println("selected option by index 2 : "+slt.getFirstSelectedOption().getText());
		
		slt.selectByValue("Android");
		System.out.println("selected option by value: "+slt.getFirstSelectedOption().getText());
		
        slt.selectByVisibleText("AutoCAD");
		System.out.println("selected option by value: "+slt.getFirstSelectedOption().getText());
		
		String expectedOptions="Select Skills,Adobe InDesign,Adobe Photoshop,Analytics,Android,APIs,Art Design,AutoCAD,Backup Management,C,C++,Certifications,Client Server,Client Support,Configuration,Content Managment,Content Management Systems (CMS),Corel Draw,Corel Word Perfect,CSS,Data Analytics,Desktop Publishing,Design,Diagnostics,Documentation,End User Support,Email,Engineering,Excel,FileMaker Pro,Fortran,HTML,Implementation,Installation,Internet,iOS,iPhone,Linux,Java,Javascript,Mac,Matlab,Maya,Microsoft Excel,Microsoft Office,Microsoft Outlook,Microsoft Publisher,Microsoft Word,Microsoft Visual,Mobile,MySQL,Networks,Open Source Software,Oracle,Perl,PHP,Presentations,Processing,Programming,PT Modeler,Python,QuickBooks,Ruby,Shade,Software,Spreadsheet,SQL,Support,Systems Administration,Tech Support,Troubleshooting,Unix,UI / UX,Web Page Design,Windows,Word Processing,XML,XHTML";
		String actualOptions="";
		
		for(int i=0;i<opt.size();i++) {
			if(i<opt.size()-1) {
				actualOptions=actualOptions+opt.get(i).getText()+",";
			}
			else {
				actualOptions=actualOptions+opt.get(i).getText();
			}
		}
		System.out.println("actual options : "+actualOptions);
		System.out.println("is option sequence is correct : "+expectedOptions.equals(actualOptions));
	}

}
