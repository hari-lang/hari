package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static WebDriver driver;
	
		public static void main (String args[])
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Boobalahariprasath\\software\\chromedriver.exe");
		
		 driver= new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
			driver.get("http://demo.guru99.com/popup.php");			
	        driver.manage().window().maximize();		
	                		
	      driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
	        			
			driver.manage().window().maximize();	
			
			String MainWindow =driver.getWindowHandle();
			
			System.out.println(MainWindow+"");
			
			Set<String> s1=driver.getWindowHandles();
			Iterator<String> i1=s1.iterator();		
   		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	            	
	            	
	            	driver.switchTo().window(ChildWindow);	                                                                                                           
                   driver.findElement(By.name("emailid")).sendKeys("ddddd@gmail.com");                			
                   
                   driver.findElement(By.name("btnLogin")).click();			
                                
			// Closing the Child Window.
                       driver.close();		
         
	                    }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(MainWindow);				
	    }

	}

