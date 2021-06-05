package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Learnscreenshot {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Boobalahariprasath\\software\\chromedriver.exe");
		 driver = new ChromeDriver();
	
    // Alert Message handling
                		
    driver.get("https://www.amazon.in");	
    driver.manage().window().maximize();
    
    WebElement d = driver.findElement(By.xpath("//a[contains(text(),\"Twitter\")]"));    
    JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,10000)");
js.executeScript("arguments[0].scrollIntoView();",d );
//d.click();
//js.executeScript("window.scrollTo(document.body.scrollHeight,0)");		

//Thread.sleep(5000);
Actions a =  new Actions(driver);   

Action eleclick = a.click(d).build();
eleclick.perform();





    TakesScreenshot ts = ((TakesScreenshot) driver);
    File src=ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src, new File("C:\\Users\\Hari\\Desktop\\Seleniumscreenshot\\"+System. currentTimeMillis()+"ss.png"));
  
	
	}

}
