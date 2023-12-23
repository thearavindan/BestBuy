package testcases;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SelectCountryPage;

public class TC009_CheckoutandPaymentTest extends ProjectSpecification {
	
	@BeforeTest
	public void setup() {
		excelfile="TC009_CheckoutandPaymentTest";
	}
	
	@Test(dataProvider = "getdata")
	public void checkoutandpayment(String product, String fname, String lname, String address, String city, String zipcode,
			                                               String email, String phoneno, String cardno, String ccv, String createpass) throws IOException, InterruptedException {
		new SelectCountryPage(driver)
		.selectus()
		.searchbox(product)
		.submitsearch()
		.selectplaystaation()
		.addtocart()
		.continueshopping()
		.menu()
		.compandtab()
		.tablet()
		.samsungtab()
		.selectgalaxyA8()
		.addtocart()
		.continueshopping()
		.menu()
		.brands()
		.apple()
		.selectapplewatch()
		.selectmodel()
		.clickaddtocart()
		.clickgotocart()
		.clickcheckout()
		.continueasguest()
		.clickswitchtoship()
		.shipfirstname(fname)
		.shiplastname(lname)
		.shipaddress(address)
		.shipcity(city)
		.shipstate()
		.shipzipcode(zipcode)
		.clickapply()
		.takescreenshot("TC009_CheckoutandPaymentTest");
		
	}

}
