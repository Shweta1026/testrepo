package InterViewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.SeleniumUtil;

public class BootStrapDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=SeleniumUtil.setUp("chrome","https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement drpEle=driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div/p/select"));
		
		Select drp=new Select(drpEle);
		
		drp.selectByIndex(5);
		
		List<WebElement> optList=drp.getOptions();
		
		
		String expectedRes="Afghanistan,Åland Islands,Albania,Algeria,American Samoa,Andorra,Angola,Anguilla,Antarctica,Antigua and Barbuda,Argentina,Armenia,Aruba,Australia,Austria,Azerbaijan,Bahamas,Bahrain,Bangladesh,Barbados,Belarus,Belgium,Belize,Benin,Bermuda,Bhutan,Bolivia, Plurinational State of,Bonaire, Sint Eustatius and Saba,Bosnia and Herzegovina,Botswana,Bouvet Island,Brazil,British Indian Ocean Territory,Brunei Darussalam,Bulgaria,Burkina Faso,Burundi,Cambodia,Cameroon,Canada,Cape Verde,Cayman Islands,Central African Republic,Chad,Chile,China,Christmas Island,Cocos (Keeling) Islands,Colombia,Comoros,Congo,Congo, the Democratic Republic of the,Cook Islands,Costa Rica,Côte d’Ivoire,Croatia,Cuba,Curaçao,Cyprus,Czech Republic,Denmark,Djibouti,Dominica,Dominican Republic,Ecuador,Egypt,El Salvador,Equatorial Guinea,Eritrea,Estonia,Ethiopia,Falkland Islands (Malvinas),Faroe Islands,Fiji,Finland,France,French Guiana,French Polynesia,French Southern Territories,Gabon,Gambia,Georgia,Germany,Ghana,Gibraltar,Greece,Greenland,Grenada,Guadeloupe,Guam,Guatemala,Guernsey,Guinea,Guinea-Bissau,Guyana,Haiti,Heard Island and McDonald Islands,Holy See (Vatican City State),Honduras,Hong Kong,Hungary,Iceland,India,Indonesia,Iran, Islamic Republic of,Iraq,Ireland,Isle of Man,Israel,Italy,Jamaica,Japan,Jersey,Jordan,Kazakhstan,Kenya,Kiribati,Korea, Democratic People’s Republic of,Korea, Republic of,Kuwait,Kyrgyzstan,Lao People’s Democratic Republic,Latvia,Lebanon,Lesotho,Liberia,Libya,Liechtenstein,Lithuania,Luxembourg,Macao,Macedonia, the former Yugoslav Republic of,Madagascar,Malawi,Malaysia,Maldives,Mali,Malta,Marshall Islands,Martinique,Mauritania,Mauritius,Mayotte,Mexico,Micronesia, Federated States of,Moldova, Republic of,Monaco,Mongolia,Montenegro,Montserrat,Morocco,Mozambique,Myanmar,Namibia,Nauru,Nepal,Netherlands,New Caledonia,New Zealand,Nicaragua,Niger,Nigeria,Niue,Norfolk Island,Northern Mariana Islands,Norway,Oman,Pakistan,Palau,Palestinian Territory, Occupied,Panama,Papua New Guinea,Paraguay,Peru,Philippines,Pitcairn,Poland,Portugal,Puerto Rico,Qatar,Réunion,Romania,Russian Federation,Rwanda,Saint Barthélemy,Saint Helena, Ascension and Tristan da Cunha,Saint Kitts and Nevis,Saint Lucia,Saint Martin (French part),Saint Pierre and Miquelon,Saint Vincent and the Grenadines,Samoa,San Marino,Sao Tome and Principe,Saudi Arabia,Senegal,Serbia,Seychelles,Sierra Leone,Singapore,Sint Maarten (Dutch part),Slovakia,Slovenia,Solomon Islands,Somalia,South Africa,South Georgia and the South Sandwich Islands,South Sudan,Spain,Sri Lanka,Sudan,Suriname,Svalbard and Jan Mayen,Swaziland,Sweden,Switzerland,Syrian Arab Republic,Taiwan, Province of China,Tajikistan,Tanzania, United Republic of,Thailand,Timor-Leste,Togo,Tokelau,Tonga,Trinidad and Tobago,Tunisia,Turkey,Turkmenistan,Turks and Caicos Islands,Tuvalu,Uganda,Ukraine,United Arab Emirates,United Kingdom,United States,United States Minor Outlying Islands,Uruguay,Uzbekistan,Vanuatu,Venezuela, Bolivarian Republic of,Viet Nam,Virgin Islands, British,Virgin Islands, U.S.,Wallis and Futuna,Western Sahara,Yemen,Zambia,Zimbabwe";
		String actualRes="";
		for(int i=0;i<optList.size();i++) {
			if(i < optList.size()-1) {
			actualRes=actualRes+optList.get(i).getText()+",";
		}
			else {
				actualRes=actualRes+optList.get(i).getText();
				}
			}
		System.out.println("actual result is : "+actualRes);
		if(expectedRes.equals(actualRes)) {
			System.out.println("strings are matched");
		}
		else {
			System.out.println("strings are not matched");
		}
		
		List orgList=new ArrayList();
		for(int i=0;i<optList.size();i++) {
			orgList.add(optList.get(i).getText());
		}
		List dupList=new ArrayList();
		dupList=orgList;
		System.out.println(dupList);
		Collections.sort(dupList);
		
		if(orgList.equals(dupList)) {
			System.out.println("LIST ARRANGED IN ASCENDING ORDER");
		}
		else {
			System.out.println("LIST ARRANGED IN  not ASCENDING ORDER");
		}
		
	}

}
