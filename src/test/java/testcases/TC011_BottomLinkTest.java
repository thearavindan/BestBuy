package testcases;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SelectCountryPage;

public class TC011_BottomLinkTest extends ProjectSpecification{
	@BeforeTest
	public void setup() {
		excelfile="TC011_BottomLinkTest";
	}
	
	@Test(dataProvider = "getdata")
	public void bottomlinktest(String title1, String title2, String title3, String title4, String title5, String title6, 
            String title7, String title8, String title9, String title10) throws IOException {
		new SelectCountryPage(driver)
		.selectus()
		.gotobottomlinks()
		.accessibility(title1)
		.tandc(title2)
		.privacy(title3)
		.interestbasedads(title4)
		.stateprivacyrights(title5)
		.healthdatapriv(title6)
		.donotsell(title7)
		.limituse(title8)
		.targetedads(title9)
		.casupplychain(title10)
		.takescreenshot("TC011_BottomLinkTest");
		
	}

}
