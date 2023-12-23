package testcases;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SelectCountryPage;

public class TC003_NegativeCreateAccountTest extends ProjectSpecification{
	
	@BeforeTest
	public void setup() {
		excelfile="TC003_NegativeCreateAccountTest";
	}
	
	
	@Test(dataProvider = "getdata")
	public void negativecreateaccountTest(String frstname, String lastname, String email, String password, String conpass, 
			                                                        String mob, String fnameerrmsg, String lnameerrmsg, String emailerrmsg,
			                                                        String passerrmsg, String conpaserrmsg, String moberrmsg) throws IOException, InterruptedException {
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
		.invalidfirstname(fnameerrmsg)
		.invalidlastname(lnameerrmsg)
		.invalidemail(emailerrmsg)
		.invalidpassword(passerrmsg)
		.invalidconpass(conpaserrmsg)
		.invalidmobno(moberrmsg)
		.takescreenshot("TC003_NegativeCreateAccountTest");

}

}
