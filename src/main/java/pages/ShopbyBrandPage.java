package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ShopbyBrandPage extends ProjectSpecification {

	@FindBy(xpath="(//a[text()='Apple Watch'])[3]")
	WebElement applewatch;
	
	@FindBy(xpath="//a[normalize-space()='Ultra 2 GPS + cellular']")
	WebElement ultra2gps;
	
	@FindBy(xpath= "(//button[text()='Add to Cart'])[1]")
	WebElement addtocart;
	
	@FindBy(xpath= "//button[text()='Continue shopping']")
	WebElement continueshopping;
	
	@FindBy(xpath="(//a[@class='c-button-link go-to-cart'])[1]")
	WebElement gotocart;
	
	public ShopbyBrandPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ShopbyBrandPage selectapplewatch() {
	   actionclick(applewatch);
	   return this;
	}
	
	public ShopbyBrandPage selectmodel() {
		actionclick(ultra2gps);
		return this;
	}
	
	public ShopbyBrandPage clickaddtocart() {
		waitforvisibility(addtocart);
		actionclick(addtocart);
		return this;
	}
	
	public Homepage clickcontinueshopping() {
		waitforvisibility(continueshopping);
		click(continueshopping);
		return new Homepage(driver);
	}
	
	public CheckoutandPaymentpage clickgotocart() {
		waitforvisibility(gotocart);
		actionclick(gotocart);
		return new CheckoutandPaymentpage(driver);
	}
	
}
