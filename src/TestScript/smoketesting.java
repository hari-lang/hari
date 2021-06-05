package TestScript;

import org.testng.annotations.Test;

import learnPOM.FBLoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class smoketesting {
	public WebDriver driver;
  @Test
  public void loginsmoke() 
  {
	FBLoginPage fbg = PageFactory.initElements(driver, FBLoginPage.class);  
	
	fbg.Enter_username("dfdfdf");

	fbg.Enter_Password("dfsfdsf");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}




//  POM
// For each web page - create a corresponding java class, name should be same to the webpage
//POM class-> weblement + methods
//@FindBy, id, name, locators
//WebEleemts methods--> name should be given clear

