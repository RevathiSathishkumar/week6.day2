package week5.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjtectSpecificMethods {
	
	 RemoteWebDriver driver;
	 
	@Parameters({"URL","browsername"})
	@BeforeMethod
	public void startbrowser(String URL,String browsername )
	{
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		//if(browsername.equals("chrome"))
				//{
		//}
		//else if(browsername.equals("edge"))
		//{
		//	WebDriverManager.chromedriver().setup();
		//	driver = new ChromeDriver();
		//	driver.manage().window().maximize();
		//	driver.get(URL);
		//}
	}
	
	@AfterMethod
	public void Endbrowser()
	{
		driver.close();
	}

}
