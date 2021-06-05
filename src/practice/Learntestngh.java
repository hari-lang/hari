package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Learntestngh {
 
	
	WebDriver driver;
	
	@Test(priority=1)
  public void craeteacc() 
  {
		driver.get("https://facebook.com");
     WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement ele1 =driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
			
			wait.until(ExpectedConditions.elementToBeClickable(ele1));
			ele1.click();
		
		
  }
  
	
	@Test(priority=2,enabled=false)
	  public void fn() 
	  {
		
		driver.get("https://gmail.com");
		
		
	  }
	
	
	
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  //init
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Boobalahariprasath\\software\\chromedriver.exe");
		
		 driver= new ChromeDriver();
			
			// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
					
		driver.manage().window().maximize();
			
  }

  
  
  
  @AfterMethod
  public void afterMethod() 
  {
	 //close 
	  driver.close();
  }

}
