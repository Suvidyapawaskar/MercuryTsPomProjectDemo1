package mt.mstr.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mt.mstr.pages.FlightFinderpage;
import mt.mstr.pages.Loginpage;

public class Login 
{
  @Parameters ({"username","password"})
  @Test
  public void executeLoginwithValidds(String username,String password)
  {
	  Loginpage lg=new Loginpage();
	  lg.loadLoginpage();
	  lg.enterUsername(username);
	  lg.enterPassword(password);
	  lg.clickonLogin();
	  
	  FlightFinderpage ff=new FlightFinderpage();
	  ff.loadFlightFinderpage();
	  ff.verifyFlightFinder();
	  ff.clickonSignoff();
	  
  }
}
