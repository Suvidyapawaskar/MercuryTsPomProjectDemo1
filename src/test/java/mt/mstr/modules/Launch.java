

package mt.mstr.modules;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mt.mstr.utility.LaunchApp;

public class Launch
{
	@Parameters ({"browser","url","timeoutseconds"})
	@Test
	public void executeLaunch(String browsernm,String urlnm,int timeoutseconds) throws IOException
	{
		LaunchApp lc= new LaunchApp();
		lc.openBrowser(browsernm);
		lc.enterApplicationURL(urlnm);
		lc.maximizeBrowser();
		lc.waittillLoginpageLoaded(timeoutseconds);
		
	}
	
	public static void main(String[] args) 
	{
		
	}

}
