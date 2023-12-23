package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ShopbyDepartmentPage extends ProjectSpecification {
	@FindBy(xpath="//span[text()='Tab S9 Series']")
	WebElement tabS9series;
	
	@FindBy(xpath="//a[text()='Samsung - Galaxy Tab S9 - 11\" 256GB - Wi-Fi - with S-Pen - Graphite']")
	WebElement galaxyS9256GB;
	
	@FindBy(xpath="//a[text()='Samsung - Galaxy Tab A8 10.5\" 32GB - Wi-Fi - Gray']")
	WebElement galaxyA8;

	@FindBy(xpath= "(//button[text()='Add to Cart'])[1]")
	WebElement addtocart;
	
	@FindBy(xpath= "//button[text()='Continue shopping']")
	WebElement continueshopping;
	
	@FindBy(xpath="(//a[@class='c-button-link go-to-cart'])[1]")
	WebElement gotocart;
	
	public ShopbyDepartmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ShopbyDepartmentPage clicks9series() {
		click(tabS9series);
		return this;
	}
	
	public ShopbyDepartmentPage selectGalaxyS9256() throws InterruptedException {
		threadsleep();
		actionclick(galaxyS9256GB);
		return this;
	}
	
	public ShopbyDepartmentPage selectgalaxyA8() throws InterruptedException {
		actionclick(galaxyA8);
		threadsleep();
		return this;
	}
	
	public ShopbyDepartmentPage addtocart() {
		waitforvisibility(addtocart);
		actionclick(addtocart);
		return this;
	}
	
	public Homepage continueshopping() {
		waitforvisibility(continueshopping);
		actionclick(continueshopping);
		return new Homepage(driver);
	}
	
	public CheckoutandPaymentpage clickgotocart() {
		actionclick(gotocart);
		return new CheckoutandPaymentpage(driver);
	}
}
