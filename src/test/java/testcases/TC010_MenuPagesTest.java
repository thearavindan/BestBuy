package testcases;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SelectCountryPage;

public class TC010_MenuPagesTest extends ProjectSpecification{
	
	@BeforeTest
	public void setup() {
		excelfile="TC010_MenuPagesTest";
	}
	
	@Test(dataProvider = "getdata")
	public void menupages(String title1, String title2, String title3, String title4, String title5, String title6, 
			                              String title7, String title8, String title9) throws IOException {
		new SelectCountryPage(driver)
		.selectus()
		.holidaydeals(title1)
		.giftcards(title2)
		.giftideas(title3)
		.topdeals(title4)
		.dealoftheday(title5)
		.bbsellsthat(title6)
		.bbmember(title7)
		.credidcard(title8)
		.donateto(title9)
		.takescreenshot("TC010_MenuPagesTest");
		
	}

}
