package setUp;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class function {
	public Properties prop = new Properties();
	public WebDriver driver;
public Properties readPropertiesFile()
{

	try {
		InputStream input = new FileInputStream("C:\\Users\\inc2162\\Downloads\\TestVagrant-main\\TestVagrant-main\\vagranttask\\configuration.properties");
		prop.load(input);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return prop;
	
}
@BeforeSuite
public void openBrowser()
{
	readPropertiesFile();
	String browser = prop.getProperty("browser");
	
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromedriver"));
		driver = new ChromeDriver();
	} if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.chrome.driver",prop.getProperty("firefoxdriver"));
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterSuite
public void teardown()
{
	driver.quit();
}
}
