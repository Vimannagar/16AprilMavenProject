package testclasses;

import java.io.IOException;

import org.testng.annotations.Test;

import utility.ReadDataFromProperties;

public class LoginTest extends BaseTest {

	@Test
	public void validateLogin() throws IOException {

		String uname = ReadDataFromProperties.getPropData("username");
		String password = ReadDataFromProperties.getPropData("pwd");
		lp.enterCredentialsAndLogin(uname ,password );
	}

	@Test
	public void validateTitle() {
		lp.getTitleOfPage();
	}

}
