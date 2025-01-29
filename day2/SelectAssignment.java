package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step1: Launch the browser
				ChromeDriver driver=new ChromeDriver();
				 
				//Loading the URL -get
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//Maximize the browser
			     driver.manage().window().maximize();
			     
			     //sendKeys - To enter data in text field
			     //Enter the username  -findElement
			     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			     
			     //Enter the password
			     driver.findElement(By.id("password")).sendKeys("crmsfa");
			     
			     //Click on the login button
			     driver.findElement(By.className("decorativeSubmit")).click();
			     
			     //Click on the CRMSFA link
			     driver.findElement(By.linkText("CRM/SFA")).click();
			     
			     //Click on the "Accounts" tab
			     driver.findElement(By.xpath("//a[text()='Accounts']")).click();
			     
			     //Click on Create Account 
			     driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
			   
			     //enter Account name
			     driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Selenium Automation Tester");
			     
			     //identify the dropdown locator
			     WebElement dropdown = driver.findElement(By.name("industryEnumId"));
			     
			     //select class
			     Select op=new Select(dropdown);
			     
			     //select an option
			     op.selectByIndex(3);
			     
			     //identify source webelement
			     WebElement sourcedp = driver.findElement(By.name("dataSourceId"));
			   
			     //select class
			     Select dp1=new Select(sourcedp);
			     
			     //select an option
			     dp1.selectByValue("LEAD_EMPLOYEE");
			     
			     //identify dropdown webelement
			     WebElement  marketingCampaignOp= driver.findElement(By.id("marketingCampaignId"));
			     
			     //select class
			     Select marketingCampaign=new Select(marketingCampaignOp);
			     
			     //select the option
			     marketingCampaign.selectByIndex(7);
			     
			     //identify the generalStateProvinceGeoId webelement
			     WebElement  generalStateProvinceGeoIddp= driver.findElement(By.id("generalStateProvinceGeoId"));
			     
			     //select classs
			     Select generalStateProvinceGeoIdOp=new Select(generalStateProvinceGeoIddp);
			     
			     //select the option
			     generalStateProvinceGeoIdOp.selectByValue("TX");
			     
			     //click create account button
			     driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			     
			     
	}

}
