package testcases;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SelectCountryPage;

public class TC006_SearchTheProductTest extends ProjectSpecification{
	
	@BeforeTest
	public void setup() {
		excelfile="TC006_SearchTheProductTest";
	}
	
	@Test(dataProvider = "getdata")
	public void searchtheproduct(String product) throws IOException {
		new SelectCountryPage(driver)
		.selectus()
		.searchbox(product)
		.submitsearch()
		.selectplaystaation()
		.addtocart()
		.gotocart()
		.takescreenshot("TC006_SearchTheProductTest");
		
	}

}
