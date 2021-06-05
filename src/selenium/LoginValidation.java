package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class LoginValidation
{
	
	WebDriver driver;
 
	@Test(priority=1)
  public void firstname() {
	  
		
		WebElement fbun =	driver.findElement(By.id("email"));
		fbun.sendKeys("arun");		
		
		
	System.out.println("testr");
	}
  
  
	@Test(priority=2)
	  public void createnewlink() {
		
		driver.findElement(By.linkText("Create New Account")).click();
	WebElement fbday =driver.findElement(By.id("day"));
	Select s1 = new Select(fbday);
	s1.selectByIndex(5);
	}
	
	
	
  @BeforeMethod
  public void beforeMethod() {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Boobalahariprasath\\software\\chromedriver.exe");
		
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	  driver.get("https://www.fb.com ");
	  
  }

  
  
  
  @AfterMethod
  public void afterMethod() {
	  
	 // close
  }

}
