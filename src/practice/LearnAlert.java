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

public class LearnAlert {
	public WebDriver driver;
	   
  @Test
  public void f() throws InterruptedException 
  {
	                        		
   	      	
      driver.findElement(By.name("cusid")).sendKeys("55557");					
     WebElement button = driver.findElement(By.name("submit"));	
      
    button.click();
      		
      // Switching to Alert        
      Alert alert = driver.switchTo().alert();		
      		
      // Capturing alert message.    
      String alertMessage= driver.switchTo().alert().getText();		
      		
      // Displaying alert message		
      System.out.println(alertMessage);	
      Thread.sleep(5000);
      		
      // Accepting alert		
     alert.accept();
    // alert.dismiss();
     //alert.sendKeys("dfdfdfd");
  }	
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Boobalahariprasath\\software\\chromedriver.exe");
		 driver = new ChromeDriver();
	
    // Alert Message handling
                		
    driver.get("http://demo.guru99.com/test/delete_customer.php");			
  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
