package TestScript;

import org.testng.annotations.Test;

import learnPOM.FBLoginPage;

import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class sanitytesting 
{
	
	public WebDriver driver;
	  
  @Test()
  public void login()
  {
  FBLoginPage fbl = PageFactory.initElements(driver, FBLoginPage.class);
	
	
	 fbl.Enter_username("arun");

	  fbl.Enter_Password("gutu");
	System.out.println("success");	  
	  
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
