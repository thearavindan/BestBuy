package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SigninPage extends ProjectSpecification {
	@FindBy (id="fld-e")
	WebElement mailadd;
	
	@FindBy (id="fld-p1")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement signinbtn;
	
	public SigninPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SigninPage email(String mailid) {
		sendkeys(mailadd, mailid);
		return this;
	}
	
	public SigninPage password(String pass) {
		sendkeys(password, pass);
		return this;
	}
	
	public Homepage clicksignin() {
		click(signinbtn);
		return new Homepage(driver);
	}

}
