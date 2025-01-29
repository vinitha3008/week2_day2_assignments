package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//click on create new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Enter Firstname
		driver.findElement(By.name("firstname")).sendKeys("xxxx");
		
		//enter surname
		driver.findElement(By.name("lastname")).sendKeys("yyy");
	
		//dob
		WebElement dob_dropdown = driver.findElement(By.id("day"));
		
		//select class
		Select dob_op=new Select(dob_dropdown);
		
		dob_op.selectByValue("31");
		
		//year
		WebElement year_dropdown = driver.findElement(By.id("year"));
		
		//select class
		Select year_op=new Select(year_dropdown);
				
		year_op.selectByValue("1994");
		
		//month
		WebElement month_dropdown = driver.findElement(By.id("month"));
				
				//select class
		Select month_op=new Select(month_dropdown);
						
		month_op.selectByValue("6");
		//gender
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		//enter mail id
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("xxxxxxxxx");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("yyyyy");
		
		//click on signup button
		WebElement we=driver.findElement(By.xpath("//button[contains(text(),'Sign')]"));
		we.click();
		
		
	}

}
