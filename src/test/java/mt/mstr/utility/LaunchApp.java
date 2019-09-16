package mt.mstr.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import mt.mstr.config.Config;

public class LaunchApp 
{
	Properties prop=new Properties();
	
	
	public void openBrowser(String browsernm) throws IOException
	{
		FileInputStream fis =new FileInputStream("E:\\Java Programs\\Eclipse Java\\MercuryTsPomProjectDemo1\\src\\test\\resources\\config.properties");
		prop.load(fis);		
		{
			if(prop.getProperty("browser").equalsIgnoreCase(browsernm))
			{
				System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeexepath"));
				Config.driver =new ChromeDriver();
				System.out.println("Chrome browser is opened successfully");
			}else if(prop.getProperty("browser").equalsIgnoreCase(browsernm))
			{
				System.setProperty("webdriver.ie.driver", prop.getProperty("ieexepath"));
				Config.driver=new InternetExplorerDriver();
				System.out.println("IE browser is opened successfully");
			}else
			{
				System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxexepath"));
				Config.driver =new FirefoxDriver();
				System.out.println("Firefox browser is opened successfully");
				
			}
			
		}
	}
	
	public void enterApplicationURL(String url)
	{
		Config.driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		System.out.println("Application url is entered successfully");
	}

	public void maximizeBrowser()
	{
		Config.driver.manage().window().maximize();	
		System.out.println("Browser is maximized successfully");
	}
	
	public void waittillLoginpageLoaded(int timeoutseconds)
	{
		Config.driver.manage().timeouts().pageLoadTimeout(timeoutseconds, TimeUnit.SECONDS);
		
	}
	
	
	public static void main(String[] args) throws IOException 
	{
		LaunchApp lc= new LaunchApp();
		lc.openBrowser("chrome");
		lc.enterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
		lc.maximizeBrowser();
		lc.waittillLoginpageLoaded(15);
	}
	
	
	
	
	
}
