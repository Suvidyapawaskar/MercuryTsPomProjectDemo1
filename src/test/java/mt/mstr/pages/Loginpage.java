package mt.mstr.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstr.config.Config;
import mt.mstr.utility.LaunchApp;



public class Loginpage
{
	
	@FindBy (how=How.XPATH,using="//input[@name='userName']")
	WebElement objUsername;
	
	@FindBy (how=How.XPATH,using="//input[@name='password']")
	WebElement objPassword;
	
	@FindBy (how=How.XPATH,using="//input[@name='login']")
	WebElement objLogin;
	
	
	public void loadLoginpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterUsername(String username)
	{
		System.out.println("In enterUsername method under Loginpage");
		objUsername.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		System.out.println("In enterPassword method under Loginpage");
		objPassword.sendKeys(password);
	}
	
	public void clickonLogin()
	{
		System.out.println("In clickonLogin method");
		objLogin.click();
		
	}
	
	public static void main(String[] args) throws IOException
	{
		LaunchApp lc= new LaunchApp();
		lc.openBrowser("chrome");
		lc.enterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
		lc.maximizeBrowser();
		lc.waittillLoginpageLoaded(15);
		
		Loginpage lp= new Loginpage();
		lp.loadLoginpage();
		lp.enterUsername("Suvidyap1");
		lp.enterPassword("P@ssword1");
		lp.clickonLogin();
		
	}

}
