package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SelectCountryPage;

public class TC007_ShopbyDepartmentTest extends ProjectSpecification{
	
	@Test
	public void shopbydepartment() throws IOException, InterruptedException {
		new SelectCountryPage(driver)
		.selectus()
		.menu()
		.compandtab()
		.tablet()
		.samsungtab()
		.selectgalaxyA8()
		.addtocart()
		.clickgotocart()
		.takescreenshot("TC007_ShopbyDepartmentTest");
	}

}
