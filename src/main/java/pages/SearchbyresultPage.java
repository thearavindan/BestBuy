package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SearchbyresultPage extends ProjectSpecification {
	@FindBy(xpath="(//a[contains(text(),'Spider-Man')])[1]")
	WebElement playstation;
	
	@FindBy(xpath="(//button[contains(@class,'c-button-primary')])[1]")
	WebElement addtocart;
	
	@FindBy(xpath="//button[text()='Continue shopping']")
	WebElement continueshopping;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement gotocart;
	
	public SearchbyresultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SearchbyresultPage selectplaystaation() {
		actionclick(playstation);
		return this;
	}
	
	public SearchbyresultPage addtocart() {
		actionclick(addtocart);
		return this;
	}
	
	public Homepage  continueshopping() {
		waitforvisibility(continueshopping);
		click(continueshopping);
		return new Homepage(driver);
		}
	
	public CheckoutandPaymentpage gotocart() {
		actionclick(gotocart);
		return new CheckoutandPaymentpage(driver);
	}
}
