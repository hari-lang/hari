package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Learndatadrivena {
  
	
	WebDriver driver;
	
	@Test(dataProvider = "dp")
  public void f(String n, String s) {
		
		
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
  }


  @DataProvider
  public Object[][] dp() throws IOException {
	  
	  ExcelDataEngine EDE = new ExcelDataEngine("C:\\Users\\Hari\\Desktop\\POI.xlsx");
	  
	  int Totalrows =EDE.getRowCount(0);

	  
	  Object[][] data= new Object[Totalrows][2]; 
	 
	  
	  for(int i=0;i<Totalrows;i++) 
	  { 
	  data[i][0]=EDE.getData(0, i, 0); 
	  data[i][1]=EDE.getData(0, i, 1); 
	  } 
	  return data; 
	  } ;

	 
  }


