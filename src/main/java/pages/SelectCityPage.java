package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCityPage {
	
	WebDriver driver;
	
	WebDriverWait wait;
	@FindBy(xpath = "//*[@id='txtcity']")
	private WebElement citytextbox;

	@FindBy(xpath = "//*[@id='divcitylist']")
	private WebElement cityname;

	@FindBy(xpath = "//*[@id='fullname']")
	private WebElement fullname;
	
	
	@FindBy(xpath = "//*[@id='pmobile']")
	private WebElement pmobilefield;
	

	
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement continuebutton;
	

	public SelectCityPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		
	}

	
	public void selectCity()
	{
		citytextbox.sendKeys("411028");
		
		wait.until(ExpectedConditions.elementToBeClickable(cityname));
		
		
		cityname.click();
	}
	
	public void enterDetails()
	{
		fullname.sendKeys("Daniel");
		
		pmobilefield.sendKeys("9958445523");
		
		continuebutton.click();
		System.out.println("abc");
		
		
	}
	
	
}
