package testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.ReadDataFromProperties;

public class SelectProductTest extends BaseTest {

	
	
	@Test(priority = 1)
	public void selectProdTest()
	{
		lp.clickOnProduct();
		
		Assert.fail();
	}
	
	
	@Test(priority = 2, dependsOnMethods = "selectProdTest")
	public void validateTitle()
	{
		String actual = lp.fetchTitle();
		
		String expected  = "Inssurance - compp";
		
		boolean ispresent = actual.contains(expected);
		
		Assert.assertTrue(ispresent);
				
	}
	
	
}
