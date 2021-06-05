package learnPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBLoginPage {
	
	@FindBy(id="email") private WebElement fbloginusername;
	
	@FindBy(id="pass") private WebElement fbloginpass;
	
	@FindBy(name="") private WebElement fbloginbtn;
	
	@FindBy(linkText="Create New Acccount") private WebElement fblogincreateaccount;
	
	
	
	public void Enter_username(String username)
	{
		fbloginusername.sendKeys(username);
		
	}
	
	public void Enter_Password(String password)
	{
		fbloginpass.sendKeys(password); 
		
	}

	
		
}
