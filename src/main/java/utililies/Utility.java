package utililies;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {     //bestbuy
	public static WebDriver driver;
	public String excelfile;
	
	public void browser(String url, String browser) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);
		}else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("headlessbrowser")) {
			ChromeOptions options1 = new ChromeOptions();
			options1.addArguments("--headless");
			driver = new ChromeDriver(options1);
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	
	
	public void close() {
		driver.quit();
	}
	
	
	public void validateurl() {
		 
	        try {

	            // Get the current URL after any redirects
	            String currentUrl = driver.getCurrentUrl();

	            // Create a URL object from the current URL
	            URL url = new URL(currentUrl);

	            // Open a connection to the URL
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            // Get the HTTP response code
	            int responseCode = connection.getResponseCode();

	            // Check if the response code is HTTP_OK (200)
	            if (responseCode == HttpURLConnection.HTTP_OK) {
	                System.out.println("The link is NOT broken. Response code: " + responseCode);
	            } else {
	                System.out.println("The link is broken. Response code: " + responseCode);
	            }

	            // Close the connection
	            connection.disconnect();

	        } catch (Exception e) {
	            System.out.println("Exception occurred: " + e.getMessage());
	        }

	 }
	
	public void threadsleep() throws InterruptedException {
		Thread.sleep(5000);
	}

	
	public void verifytitle( String expected) {
		String actual = driver.getTitle();
		assertEquals(actual, expected);
		System.out.println("Title verified");
	}
	
	public void waitforvisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void verifymessage(WebElement element, String expected) {
		String actual = element.getText();
		assertEquals(actual, expected);
		System.out.println("Error message displayed for invalid credentials");
	}
	
	public void returnback() {
		driver.navigate().back();
	}
		
		public String[][] readexcel(String filename) throws IOException {
			XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Aravind\\eclipse-workspace\\BestBuy\\data\\"+filename+".xlsx");
			XSSFSheet sheet = book.getSheetAt(0);
			int rowcount = sheet.getLastRowNum();
			int columncount = sheet.getRow(0).getLastCellNum();
			String[][] data = new String[rowcount][columncount];
			for(int i=1;i<=rowcount;i++) {
				XSSFRow row = sheet.getRow(i);
				for(int j=0;j<columncount;j++) {
					XSSFCell cell = row.getCell(j);
					data[i-1][j] = cell.getStringCellValue();
					System.out.println(cell.getStringCellValue());
				}
			}
			book.close();
			return data;
		}
		
		
	 
		public void click(WebElement element) {
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	     wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}

		public void sendkeys(WebElement ele, String values) {
			ele.sendKeys(values);
		}
		
		public void alert()  {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.getText();
			alert.accept();
		}
		
		public void select(WebElement elem, String name) {
			Select select = new Select(elem);
			select.selectByVisibleText(name);
		}
		
		
		public String takescreenshot(String testmethodname) throws IOException {
			String path = "./snap/"+testmethodname+".png";
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			FileUtils.copyFile(source, dest);
			return path;
		}
		
		public void actionclick(WebElement ele) {
			Actions builder = new Actions (driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		     wait.until(ExpectedConditions.elementToBeClickable(ele));
             builder.moveToElement(ele).click().perform();
		}
		
		public void jsexcecuter(WebElement elem) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", elem);
		}
		
		public void jsClick(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}

}
