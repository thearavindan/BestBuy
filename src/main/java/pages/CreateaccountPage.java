package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class CreateaccountPage extends ProjectSpecification {
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastname;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="fld-p1")
	WebElement password;
	
	@FindBy(id="reenterPassword")
	WebElement conpassword;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement createaccbutton;

	@FindBy(id="is-recovery-phone")
	WebElement accrecoverycheckbox;
	
	@FindBy(xpath="//p[text()='Too many numeric characters.']")
	WebElement toomany;
	
	@FindBy(xpath = "//p[text()='Please enter your last name.']")
	WebElement lastnameerrmsg;
	
	@FindBy(xpath = "//p[text()='Please enter a valid email address.']")
	WebElement emailerrmsg;
	
	@FindBy(xpath = "//p[text()='Please enter a strong password.']")
	WebElement passerrmsg;
	
	@FindBy(xpath = "//p[text()='Passwords do not match.']")
	WebElement conpasserrmsg;
	
	@FindBy(xpath = "//p[text()='Please enter a valid mobile phone number.']")
	WebElement moberrmsg;
	
	public CreateaccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public CreateaccountPage firstname(String Firstname) {
		sendkeys(firstname, Firstname);
		return this;
	}
	
	public CreateaccountPage lastname(String Lastname) {
		sendkeys(lastname, Lastname);
		return this;
	}
	
	public CreateaccountPage email(String mail) {
		sendkeys(email, mail);
		return this;
	}
	
	public CreateaccountPage password(String pass) {
		sendkeys(password, pass);
		return this;
	}
		
	public CreateaccountPage conformpas(String comnpass) {
		sendkeys(conpassword, comnpass);
		return this;
	}
	
	public CreateaccountPage mobno(String mob) {
		sendkeys(phone, mob);
		return this;
	}
	
	public CreateaccountPage checkbox() {
		click(accrecoverycheckbox);
		return this;
	}
	
	public CreateaccountPage clickcreateacc() throws InterruptedException {
		click(createaccbutton);
		threadsleep();
		return this;
	}
	
	public CreateaccountPage invalidfirstname(String frstname) {
		waitforvisibility(toomany);
		verifymessage(toomany, frstname);
		return this;
	}
	
	public CreateaccountPage invalidlastname(String lastname) {
		waitforvisibility(lastnameerrmsg);
		verifymessage(lastnameerrmsg, lastname);
		return this;
	}
	
	public CreateaccountPage invalidemail(String mail) {
		waitforvisibility(emailerrmsg);
		verifymessage(emailerrmsg, mail);
		return this;
	}
	
	public CreateaccountPage invalidpassword(String pass) {
		waitforvisibility(passerrmsg);
		verifymessage(passerrmsg, pass);
		return this;
	}
	
	public CreateaccountPage invalidconpass(String conpass) {
		waitforvisibility(conpasserrmsg);
		verifymessage(conpasserrmsg, conpass);
		return this;
	}
	
	public CreateaccountPage invalidmobno(String mob) {
		waitforvisibility(moberrmsg);
		verifymessage(moberrmsg, mob);
		return this;
	}
	
	
	
}
