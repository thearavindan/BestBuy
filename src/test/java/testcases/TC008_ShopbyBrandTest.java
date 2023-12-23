package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SelectCountryPage;

public class TC008_ShopbyBrandTest extends ProjectSpecification {
	
	@Test
	public void shopbybrand() throws IOException {
		new SelectCountryPage(driver)
		.selectus()
		.menu()
		.brands()
		.apple()
		.selectapplewatch()
		.selectmodel()
		.clickaddtocart()
		.clickgotocart()
		.takescreenshot("TC008_ShopbyBrandTest");
	}

}
