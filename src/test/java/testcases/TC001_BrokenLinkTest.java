package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SelectCountryPage;

public class TC001_BrokenLinkTest extends ProjectSpecification{
	
	@Test
	public void brokenlinktest() throws IOException {
		new SelectCountryPage(driver)
		.validateurl();
		takescreenshot("TC001_BrokenLinkTest");
		
	}

}
