package testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.SelectCityPage;
import pages.SelectInsurer;
import pages.SelectProductPage;
import utility.ReadDataFromProperties;

public class BaseTest {
	public static WebDriver driver;
	SelectProductPage lp;
	SelectCityPage sc;
	
	SelectInsurer si;
	@BeforeSuite
	public void initBrowser() throws IOException
	{
//		System.setProperty("webdriver.chrome.driver",
//				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
//		options.addArguments("--incognito");
		
		options.addArguments("--start-maximized");
		
//		options.addArguments("--headless");
		
		 driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get(ReadDataFromProperties.getPropData("testsiteurl"));
	}
	
	@BeforeClass
	public void createObject()
	{
		lp = new SelectProductPage(driver);
		
		si = new SelectInsurer(driver);
		
		sc = new SelectCityPage(driver);
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
