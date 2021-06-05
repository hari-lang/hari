package selenium;


//import java.util.List;
//import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class tues {

	public static WebDriver driver;
	
     public static void main(String[] args)
     {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Boobalahariprasath\\software\\chromedriver.exe");
				
	 driver= new ChromeDriver();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		driver.get("https://facebook.com");
				
		driver.manage().window().maximize();
		  
		driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
	
		//explicit wait
		//WebDriverWait wait = new WebDriverWait(driver,20);
			
	//WebElement ele1 =driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		
		//wait.until(ExpectedConditions.elementToBeClickable(ele1));
		//ele1.click();
	
		
	    WebElement ele2 =  driver.findElement(By.name("firstname"));
	   //wait.until(ExpectedConditions.visibilityOf(ele2));
	    ele2.sendKeys("hari");
	    
	    WebElement ele3 = driver.findElement(By.name("lastname"));
	    
	   ele3.sendKeys("Prasath");
	   
	   WebElement ele4 = driver.findElement(By.name("reg_email__"));
	    
	   ele4.sendKeys("9876543210");
	   
	   WebElement ele5 = driver.findElement(By.id("passwor d_step_input"));
	   
	   ele5.sendKeys("NewPassword");
	   
       //WebElement ele6 = driver.findElement(By.id("password_step_input"));
	   
	 //ele6.sendKeys("NewPassword");
	   
	   WebElement ele6 = driver.findElement(By.id("day"));
	   Select Select = new Select(ele6);
	   
	   Select.selectByIndex(10);
	   
	   Select.selectByValue("5");
	   
	   Select.selectByVisibleText("1");
	   
	   WebElement ele8 = driver.findElement(By.id("month"));
	   
	   Select Select1 = new Select(ele8);
	   
	   Select1.selectByValue("6");
	   
	   
       WebElement ele9 = driver.findElement(By.id("year"));
	   
	   Select Select2 = new Select(ele9);
	   
	   Select2.selectByValue("2020");
	   
	   
      WebElement ele10 = driver.findElement(By.id("u_3_2_kF"));
	   
	   Select Select3 = new Select(ele10);
	   
	   Select3.selectByValue("1");
	   
	   driver.findElement(By.xpath("//*[@id='u_g_s_WG']")).click();
	   
	   
	   driver.close();
	   
	   
	  
	  //Fluent wait code
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).ignoring(Exception.class);

		
		 //  WebElement ele1 = wait.until(new Function<WebDriver, WebElement>()
		  
			    // public WebElement apply(WebDriver driver)
			    // {
			     //  return driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
			       
			      
			     }
			     
			     
			     
			     			     
			     
			   
		
		
	}
		
	


