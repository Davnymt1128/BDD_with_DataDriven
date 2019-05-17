package PreTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

protected WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		initializeBrowser();
		driver.get("https://www.phptravels.net/");
	}
	
	
	
	@AfterTest
	public void tearDown()
	{
		if(driver != null)
		{
			driver.close();
			driver.quit();
		}
	}
	
	
	
	
	
	// helper method - browser
	public void initializeBrowser()
	{
		try(FileInputStream file = new FileInputStream("C:\\Users\\Davny1128\\eclipse-workspace\\BDD_DataDriven_PHPTravels\\src\\main\\java\\PreTest\\data.properties")) {
			
			Properties prop = new Properties();
			prop.load(file);
			String browserType = prop.getProperty("browser");
			
			
			
			if(browserType.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Davny1128\\Downloads\\Automation\\AutomationDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserType.equalsIgnoreCase("FireFox"))
			{
				driver = new FirefoxDriver();
			}
			else if(browserType.equalsIgnoreCase("IE"))
			{
				driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
		} catch (IOException loadFileError) {
			
			throw new IllegalArgumentException("File not found!");
		}
	}
}
