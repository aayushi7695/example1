package MySeleniumSessions.MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {
	
	static String browser;
	static WebDriver driver;
	
	public static void main(String[] args)
	{
		setBrowser();
		setBrowserConfig();
		runTest(); 
	}
		
	public static void setBrowser()
	{
		browser="Chrome";
	}
		
	public static void setBrowserConfig()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
		
	public static void runTest()
	{
		driver.get("https://na-admin.eventscloud.com/loggedin/eMarketing/emaildetails.php?emailid=297712");
		System.out.print(driver.getTitle());
		
		//login
		driver.findElement(By.id("uname")).sendKeys("aayushi@aventri.com");
		driver.findElement(By.id("upass")).sendKeys("ProdIso@123Aaayu");
		driver.findElement(By.id("submitButton")).click();
		
		System.out.print("Logged in");
			
		//driver.findElement(By.className("accountName")).click();
		/*driver.findElement(By.id("site-search-selector")).click();
		driver.findElement(By.xpath("//ul[@id='site-search-selector-list']/li[5]/span/span")).click();
		driver.findElement(By.id("search_term")).click();
		driver.findElement(By.id("search_term")).sendKeys("297712");
		driver.findElement(By.xpath("//a[contains(text(),'[297712] EmailForAutomation')]')]")).click();*/
		
		//send test email and close window
		driver.findElement(By.xpath("//*[@id=\"module_container\"]/form/table[1]/tbody/tr/td/table[2]/tbody/tr/td[1]/div/ul/li/a")).click();
		driver.switchTo().frame("innerframe1");
		driver.findElement(By.xpath("//*[@id=\"bot_fix\"]/tbody/tr/td/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"bot_fix\"]/tbody/tr/td/button")).click();
		
		System.out.print("Test email sent");
		driver.switchTo().parentFrame();
		
		//schedule email
		driver.findElement(By.xpath("//*[@id=\"module_container\"]/form/table[2]/tbody/tr/td/div[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"select-listid\"]")).sendKeys("TestAayuMailingList");
		
		}
		
	}

	
