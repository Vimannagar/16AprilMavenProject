package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectInsurer {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@id='submitButton']")
	WebElement continuebutton;

	@FindBy(xpath = "(//*[@class='checkbox'])[2]")
	WebElement spousecheckbox;

	@FindBy(xpath = "//*[@id='Self']")
	WebElement selfdropdown;
	
	
	@FindBy(xpath = "//*[@id='Spouse']")
	WebElement spousedropdown;
	
	
	//*[@id='submitButton']
	

	public SelectInsurer(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	
	public void selectPerson()
	{
		spousecheckbox.click();
		
		continuebutton.click();
	}
	
	
	public void selectdropdown(WebElement ele, String value)
	
	{
		Select sel = new Select(ele);
		
		sel.selectByVisibleText(value);
	}
	
	public void selectAge()
	{
		selectdropdown(selfdropdown, "25 yr");
		
		selectdropdown(spousedropdown, "21 yr");
		
		continuebutton.click();
		
		
	}


}
