package Poject1MobileTest.Poject1MobileTest;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
    	DesiredCapabilities dc= new DesiredCapabilities();
    	
    	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
    	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
    	
    	
    	URL url=new URL("http://127.0.0.1:4723/wd/nub");
    	
    	AndroidDriver<WebElement>driver=new AndroidDriver<WebElement>(url,dc);
    	
  
    
    	
    	
    	
    
    }
}
