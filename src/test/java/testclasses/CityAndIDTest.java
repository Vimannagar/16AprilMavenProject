package testclasses;

import org.testng.annotations.Test;

public class CityAndIDTest extends BaseTest {
	
	@Test(priority = 5)
	public void validateCitySelection()
	{
		sc.selectCity();
	}

	
	@Test(priority = 6)
	public void validateDetails()
	{
		sc.enterDetails();
	}
}
