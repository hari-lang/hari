package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LearnJavascript {
	WebDriver driver;
  @Test
  public void f() {
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;		
		
      //Launching the Site.		
      driver.get("http://demo.guru99.com/V4/");			
      		
      		
      //Login to Guru99 		
      driver.findElement(By.name("uid")).sendKeys("mngr34926");					
      driver.findElement(By.name("password")).sendKeys("amUpenu");					
      WebElement button =driver.findElement(By.name("btnLogin"));			
      		
      //Perform Click on LOGIN button using JavascriptExecutor		
      js.executeScript("arguments[0].click();", button);
                              
      //To generate Alert window using JavascriptExecutor. Display the alert message 			
     // js.executeScript("alert('Welcome to Guru99');");   
  		
	  Alert al = driver.switchTo().alert();
	  al.accept();
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Boobalahariprasath\\software\\chromedriver.exe");
		 driver = new ChromeDriver();
	
  }

  @AfterMethod
  public void afterMethod() {
  }

}
