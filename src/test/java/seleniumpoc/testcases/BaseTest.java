package seleniumpoc.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import seleniumpoc.pages.LoginPage;

public class BaseTest {

	WebDriver driver;
	public void initalizeDriver() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\globalData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
	
	public LoginPage launchApplication()
	{
		try {
			initalizeDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return new LoginPage(driver);
	}
		
		
	
}
