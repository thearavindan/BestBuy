package testcases;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SelectCountryPage;

public class TC004_SigninTest extends ProjectSpecification {
	
	@BeforeTest
	public void setup() {
		excelfile="TC004_SigninTest";
	}
	
	@Test(dataProvider = "getdata")
	public void signintest(String email, String password) throws IOException {
		new SelectCountryPage(driver)
		.selectus()
		.clickaccount()
		.clicksignin()
		.email(email)
		.password(password)
		.clicksignin()
		.takescreenshot("TC004_SigninTest");
	}

}
