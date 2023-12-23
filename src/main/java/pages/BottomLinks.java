package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class BottomLinks extends ProjectSpecification {
	@FindBy(xpath="//a[text()='Accessibility']")
	WebElement accessibility;
	
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	WebElement termsandcondi;
	
	@FindBy(xpath="//a[text()='Privacy']")
	WebElement privacy;
	
	@FindBy(xpath="//a[text()='Interest-Based Ads']")
	WebElement interestbasedads;
	
	@FindBy(xpath="//a[text()='State Privacy Rights']")
	WebElement stateprivacyrights;
	
	@FindBy(xpath="//a[text()='Health Data Privacy']")
	WebElement healthdataprivacy;
	
	@FindBy(xpath="//a[contains(text(),'Do Not Sell')]")
	WebElement donotsell;
	
	@FindBy(xpath="//a[contains(text(),'Limit Use')]")
	WebElement limituse;
	
	@FindBy(xpath="//a[contains(text(),'Targeted')]")
	WebElement targetedad;
	
	@FindBy(xpath="//a[contains(text(),'Supply Chain')]")
	WebElement casupplychain;
	
	public BottomLinks(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public BottomLinks accessibility(String title) {
		actionclick(accessibility);                   //Accessibility - Best Buy
		verifytitle(title);
		returnback();
		return this;
	}
	
	public BottomLinks tandc(String title) {
		actionclick(termsandcondi);   //BestBuy.com Terms and Conditions
		verifytitle(title);
		returnback();
		return this;
	}
	
	public BottomLinks privacy(String title) {
		actionclick(privacy);    //Privacy Policy Hub - Best Buy
		verifytitle(title);
		returnback();
		return this;
	}
	
	public BottomLinks interestbasedads(String title) {
		actionclick(interestbasedads);  //Interest-Based Ads - Best Buy
		verifytitle(title);
		returnback();
		return this;
	}
	
	public BottomLinks stateprivacyrights(String title) {
		actionclick(stateprivacyrights);  //State Privacy Rights - Best Buy
		verifytitle(title);
		returnback();
		return this;
     }
	
	public BottomLinks healthdatapriv(String title) {
		actionclick(healthdataprivacy);  //Privacy Policy Hub - Best Buy
		verifytitle(title);
		returnback();
		return this;
	}
	
	public BottomLinks donotsell(String title) {
		actionclick(donotsell);  //Start Request - Best Buy
		verifytitle(title);
		returnback();
		return this;
	}
	
	public BottomLinks limituse(String title) {
		actionclick(limituse);  //Best Buy
		verifytitle(title);
		returnback();
		return this;
	 }
	
	public BottomLinks targetedads(String title) {
		actionclick(targetedad); //Start Request - Best Buy
		verifytitle(title);
		returnback();
		return this;
	}
	
	public BottomLinks casupplychain(String title) {
		actionclick(casupplychain);  //California Supply Chain Transparency Act - Best Buy
		verifytitle(title);
		returnback();
		return this;
	}

}
