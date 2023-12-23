package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SelectCountryPage extends ProjectSpecification {
	@FindBy(xpath="(//a[@class='us-link'])[1]")
	WebElement unitedstates;
	
	@FindBy(xpath="(//h4[text()='Canada'])[1]")
	WebElement canada;
	
	public SelectCountryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public Homepage selectus() {
		click(unitedstates);
		return new  Homepage(driver);
	}
	
	public Homepage selectcanada() {
		click(canada);
		return new  Homepage(driver);
	}

}
