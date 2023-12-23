package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SelectCountryPage;

public class TC012_CanadaHomepageTest extends ProjectSpecification {
	
	@Test
	public void homepage_CAN() {
		new SelectCountryPage(driver)
		.selectcanada();
	}
	

}
