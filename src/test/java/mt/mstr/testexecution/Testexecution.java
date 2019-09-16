package mt.mstr.testexecution;

import java.io.IOException;

import mt.mstr.pages.FlightFinderpage;
import mt.mstr.pages.Loginpage;
import mt.mstr.utility.CloseBrowser;
import mt.mstr.utility.LaunchApp;

public class Testexecution {

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
		
		CloseBrowser cb =new CloseBrowser();
		cb.closeBrowser();		

	}

}
