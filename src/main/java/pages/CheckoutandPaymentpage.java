package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class CheckoutandPaymentpage extends ProjectSpecification {
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath="(//button[normalize-space()=\"Yes, I'm 17+\"])[1]")
	WebElement ageverify;
	
	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement continueasguest;
	
	@FindBy(xpath="//button[text()='Switch all to shipping']")
	WebElement switchtoship;
	

	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='street']")
	WebElement address;
	
	@FindBy(xpath =  "//div[text()='177 1st Ave, Memphis TN']")
	WebElement selectadd;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//select[@id='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement zipcode;
	
	@FindBy(xpath="//span[text()='Use as billing address']")
	WebElement checkbox;
	
	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-md new-address-form__button']")
	WebElement applybutton;
	
	@FindBy(xpath="button[class='c-button c-button-secondary c-button-md ']")
	WebElement keepadd;
	
	@FindBy(id="user.emailAddress")
	WebElement email;
	
	@FindBy(id="user.phone")
	WebElement phone;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement contopay;
	
	@FindBy(xpath="//input[@id='number']")
	WebElement carddetails;
	
	@FindBy(id="expMonth")
	WebElement expmonth;
	
	@FindBy(xpath="//select[@id='expYear']")
	WebElement expyear;
	
	@FindBy(xpath="//input[@id='cvv']")
	WebElement cvv;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement createpass;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement placeorder;
	
	public CheckoutandPaymentpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public CheckoutandPaymentpage clickcheckout() {
		click(checkout);
		return this;
	}
	
	public CheckoutandPaymentpage ageverify() {
		click(ageverify);
		return this;
	}
	
	public CheckoutandPaymentpage continueasguest() {
		click(continueasguest);
		return this;
	}
	
	public CheckoutandPaymentpage clickswitchtoship() {
		click(switchtoship);
		return this;
	}
	
	public CheckoutandPaymentpage shipfirstname(String fstname) {
		jsexcecuter(firstname);
		sendkeys(firstname, fstname);
		return this;
	}
	
	public CheckoutandPaymentpage shiplastname(String lstname) {
		sendkeys(lastname, lstname);
		return this;
	}
	
	public CheckoutandPaymentpage shipaddress(String add) {
		sendkeys(address, add);
		return this;
	}
	
	public CheckoutandPaymentpage shipcity(String cit) {
			sendkeys(city, cit);
		return this;
	}
	
	public CheckoutandPaymentpage shipstate() {
		select(state,"TN");
		return this;
	}
	
	public CheckoutandPaymentpage shipzipcode(String zip) {
		sendkeys(zipcode, zip);
		return this;
	}
	
	public CheckoutandPaymentpage clickapply() throws InterruptedException {
		actionclick(applybutton);
		threadsleep();
		return this;
	}
	
	public CheckoutandPaymentpage keepaddress() {
			waitforvisibility(keepadd);
			click(keepadd);
		return this;
	}
	
	public CheckoutandPaymentpage shipemail(String mail) {
		jsexcecuter(email);
		sendkeys(email, mail);
		return this;
	}
	
	public CheckoutandPaymentpage shipphoneno(String mob) {
		jsexcecuter(phone);
		sendkeys(phone, mob);
		return this;
	}
	
	public CheckoutandPaymentpage contitopay() {
		actionclick(contopay);
		return this;
	}
	
	public CheckoutandPaymentpage entercardno(String cardno) {
		sendkeys(carddetails, cardno);
		return this;
	}
	
	public CheckoutandPaymentpage carddetails(String ccvv) {
		select(expmonth, "05");
		select(expyear, "2025");
		sendkeys(cvv, ccvv);
		return this;
     }
	
	public CheckoutandPaymentpage createpass(String pass) {
		jsexcecuter(createpass);
		sendkeys(createpass, pass);
		return this;
	}
	
	public CheckoutandPaymentpage placeorder() {
		actionclick(placeorder);
		return this;
	}
	

}
