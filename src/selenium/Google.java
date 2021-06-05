package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Google {
	
	
	//Launching Interface
	public static  WebDriver driver;
	//Log4j imple
	public static Logger log = Logger.getLogger(Google.class.getClass());
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		//Log4j implement
	PropertyConfigurator.configure("C:\\Users\\Hari\\eclipse-workspace\\SeleneiumPractice\\Log4j.properties");
		
			FileInputStream fis = new FileInputStream("C:\\Users\\Hari\\eclipse-workspace\\SeleneiumPractice\\OR.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Boobalahariprasath\\software\\chromedriver.exe");
		driver = new ChromeDriver();
	   log.info("Browser launched successfully");
	   
	   log.warn("not successul");
	   
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log.info("time is set for loading ");
		driver.get(prop.getProperty("url"));
		log.info("url lauced successfully");
		driver.manage().window().maximize();
		String a = driver.getTitle();
		System.out.println("tile of page is :"+a);
		driver.navigate().back();
		driver.navigate().forward();
	    WebElement fbun =	driver.findElement(By.id(prop.getProperty("fbemail")));
	    fbun.sendKeys("arun");		
	
	driver.findElement(By.linkText("Create New Account")).click();
	WebElement fbday =driver.findElement(By.id("day"));
	Select s1 = new Select(fbday);
	s1.selectByIndex(5);
	

	

	}

}
