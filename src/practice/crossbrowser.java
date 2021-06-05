package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class crossbrowser {
	
	WebDriver driver;
	public String browser;
  
	@Test
  public void f() {
	  
	  driver.get("https://www.fb.com");
	  
	  
  }
 
  @Parameters({"browser"})
   
  @BeforeTest
  
  public void beforeTest(String browser) 
    {
	  
	  if(browser.equalsIgnoreCase("chrome")) 
	  {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Boobalahariprasath\\software\\chromedriver.exe");
			driver= new ChromeDriver();
		 
	  // If browser is IE, then do this	  
	 
	  }
	  else if (browser.equalsIgnoreCase("firefox"))
	  { 
	 
		  // Here I am setting up the path for my IEDriver
		  System.setProperty("webdriver.gecko.driver", "C:\\Boobalahariprasath\\software\\geckodriver.exe");
			driver= new FirefoxDriver();
			
				  
	  } 
	 
	  // Doesn't the browser type, lauch the Website
	 
	 
	  }
	 
	  
  
  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
