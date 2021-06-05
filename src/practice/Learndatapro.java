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
import org.testng.annotations.DataProvider;

public class Learndatapro
{
	WebDriver driver;
  
	@Test(dataProvider = "dp")

  public void login(String n, String s) 
  {
	  
	  WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement ele1 =driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
			
			wait.until(ExpectedConditions.elementToBeClickable(ele1));
			ele1.click();
	
			  WebElement ele2 =  driver.findElement(By.name("firstname"));
				 //   wait.until(ExpectedConditions.visibilityOf(ele2));
				    ele2.sendKeys(n);
				    
				    WebElement ele3 = driver.findElement(By.name("lastname"));
				    
				   ele3.sendKeys(s);
	
  }

  
  
  

  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Boobalahariprasath\\software\\chromedriver.exe");
		
		 driver= new ChromeDriver();
			
			// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.fb.com");

	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
	  
  }


  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    		
    {
      new Object[] { "arun", "adddd" },
      new Object[] { "bala", "bddd" },
      new Object[] { "cit", "bdddd" },
      
    };
  }
}
