package mt.mstr.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstr.config.Config;
import mt.mstr.utility.LaunchApp;

public class FlightFinderpage 
{
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objFlightFinder;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objSignoff;
	
	
	public void loadFlightFinderpage()
	{
		System.out.println("loadFlightFinderpage method under FlightFinderpage");
		PageFactory.initElements(Config.driver, this);
	}
	
	public void verifyFlightFinder()
	{
	
	 System.out.println("verifyFlightFinder method under FlightFinderpage");
	 boolean act_flag=objFlightFinder.isDisplayed();
	 if(act_flag==true)
	 {
		 System.out.println("Flight Finder image is displayed");
	 }
		
	}
	public void clickonSignoff()
	{
		System.out.println("clickonSignoff method under FlightFinderpage");
		objSignoff.click();
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
		
		FlightFinderpage ff=new FlightFinderpage();
		ff.loadFlightFinderpage();
		ff.verifyFlightFinder();
		ff.clickonSignoff();
	}
}
