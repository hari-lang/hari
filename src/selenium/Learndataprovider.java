package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Learndataprovider
{
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String s) {
	  
	  WebElement fbun =	driver.findElement(By.id("email"));
		fbun.sendKeys(s);		
		
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
  }


  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][]
    		{
      new Object[] { "arun" },
      new Object[] { "bala" },
    };
  }
}
