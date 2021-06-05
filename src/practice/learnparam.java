package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class learnparam {
	
	WebDriver driver;
	String gender;
 
	@Test
	
	@Parameters({"fn","ln","g"})
	
	
  public void register(String fn, String ln,String g) 
  {
	  
		 WebDriverWait wait = new WebDriverWait(driver,20);
			
			WebElement ele1 =driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
				
				wait.until(ExpectedConditions.elementToBeClickable(ele1));
				ele1.click();
		
				  WebElement ele2 =  driver.findElement(By.name("firstname"));
					 //   wait.until(ExpectedConditions.visibilityOf(ele2));
					    ele2.sendKeys(fn);
					    
					    WebElement ele3 = driver.findElement(By.name("lastname"));
					    
					   ele3.sendKeys(ln);
					   
					   
					   if(g.equalsIgnoreCase("female"))
					   {
					   WebElement female1 = driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"1\"]"));
					   female1.click();
					   }
					   
					   else if(g.equalsIgnoreCase("male"))
					   {
						   
						   WebElement gender = driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"2\"]"));
						   gender.click();
						     
						   
					   }
  }
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Boobalahariprasath\\software\\chromedriver.exe");
		
		 driver= new ChromeDriver();
			
			// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.fb.com");
	
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
  }

}
