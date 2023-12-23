package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utililies.Utility;

public class ProjectSpecification extends Utility {
	@Parameters({"browser", "url"})
	@BeforeMethod
	public void launchbrowser(String browser, String url) {
		browser(url, browser);
	}
	
	@DataProvider(name ="getdata")
   public String[][] getdata() throws IOException {
		String[][] data = readexcel(excelfile);
		return data;
	}
@AfterMethod
public void closebrowser() {
	close();
}

}
