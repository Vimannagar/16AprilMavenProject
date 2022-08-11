package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProductPage {
	WebDriver driver;
	@FindBy(xpath = "//*[@class='prd-block']//i[@class='icon-bg homeIconsBg health-insurance']")
	WebElement healthinsuranceproduct;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbutton;
	
	

	public SelectProductPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void clickOnProduct()
	{
		healthinsuranceproduct.click();
		
	}
	
	public String fetchTitle()
	{
		 String title = driver.getTitle();
		 
		 return title;
	}

}
