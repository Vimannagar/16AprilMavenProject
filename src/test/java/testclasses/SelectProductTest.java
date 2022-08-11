package testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.ReadDataFromProperties;

public class SelectProductTest extends BaseTest {

	
	
	@Test(priority = 2)
	public void selectProdTest()
	{
		lp.clickOnProduct();
	}
	
	
	@Test(priority = 1)
	public void validateTitle()
	{
		String actual = lp.fetchTitle();
		
		String expected  = "Insurance - Compare";
		
		boolean ispresent = actual.contains(expected);
		
		Assert.assertTrue(ispresent);
				
	}
	
	
}
