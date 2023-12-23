package testcases;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SelectCountryPage;

public class TC002_CreateAccountTest extends ProjectSpecification {

	@BeforeTest
	public void setup() {
		excelfile="TC002_CreateAccountTest";
	}
	
	@Test(dataProvider = "getdata")
	public void createaccountTest(String frstname, String lastname, String email, String password, String conpass, String mob) throws IOException, InterruptedException {
		new SelectCountryPage(driver)
		.selectus()
		.clickaccount()
		.clickcreateaccount()
		.firstname(frstname)
		.lastname(lastname)
		.email(email)
		.password(password)
		.conformpas(conpass)
		.mobno(mob)
		.clickcreateacc()
		.takescreenshot("TC002_CreateAccountTest");
		
	}
}
