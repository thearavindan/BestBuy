package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class Homepage extends ProjectSpecification {
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;
	
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signin;
	
	@FindBy(xpath="//a[text()='Create Account']")
	WebElement createacc;
	
	@FindBy(id="gh-search-input")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@title='submit search']")
	WebElement submitsearch;
	
	@FindBy(xpath="//button[text()='Menu']")
	WebElement menu;
	
	@FindBy(xpath="//button[text()='Computers & Tablets']")
	WebElement compandtab;
	
	@FindBy(xpath="//button[text()='Tablets']")
	WebElement tablets;
	
	@FindBy(xpath="//a[text()='Samsung Galaxy Tablets']")
	WebElement samsungtab;
	
	@FindBy(xpath="//button[text()='Brands']")
	WebElement brands;
	
	@FindBy(xpath="//a[text()='Apple']")
	WebElement apple;
	
	@FindBy(xpath="//a[text()='Holiday Deals']")
	WebElement holidaydeals;
	
	@FindBy(xpath="//a[text()='Gift Cards']")
	WebElement giftcard;
	
	@FindBy(xpath="//a[text()='Gift Ideas']")
	WebElement giftidea;
	
	@FindBy(xpath="//a[text()='Top Deals']")
	WebElement topdeals;
	
	@FindBy(xpath="//a[text()='Deal of the Day']")
	WebElement dealofday;
	
	@FindBy(xpath="//a[contains(text(),'Yes, Best Buy')]")
	WebElement yesbbsellsthat;
	
	@FindBy(xpath="(//a[contains(text(),'Memberships')])[1]")
	WebElement mybbmembership;
	
	@FindBy(xpath="//span[text()='More']")
	WebElement more;
	
	@FindBy(xpath="(//a[text()='Credit Cards'])[2]")
	WebElement creditcard;
	
	@FindBy(xpath="(//a[text()='Donate to St. Jude'])[2]")
	WebElement donatetostjude;
	
	@FindBy(xpath="//span[@class='accountMenuCloseText']")
	WebElement clickclose;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public Homepage clickaccount() {
		click(account);
		return this;
	}
	
	public CreateaccountPage clickcreateaccount() {
		click(createacc);
		return new CreateaccountPage(driver);
	}
	
	public SigninPage clicksignin() {
		click(signin);
		return new SigninPage(driver);
	}
	
	public Homepage searchbox(String search) {
		sendkeys(searchbox, search);
		return this;
	}
	
	public SearchbyresultPage submitsearch() {
		click(submitsearch);
		return new SearchbyresultPage(driver);
	}
	
	public Homepage menu() {
		click(menu);
		return this;
	}
	
	public Homepage compandtab() {
		click(compandtab);
		return this;
	}
	
	public Homepage tablet() {
		click(tablets);
		return this;
	}
	
	public ShopbyDepartmentPage samsungtab() {
		click(samsungtab);
		return new ShopbyDepartmentPage(driver);
	}
	
	public Homepage brands() {
		click(brands);
		return this;
	}
	
	
	public ShopbyBrandPage apple() {
		click(apple);
		return new ShopbyBrandPage(driver);
	}
	
	public Homepage holidaydeals(String title) {
		click(holidaydeals);  //Sales and Promotions at Best Buy: On Sale Electronics, Coupons and Promo Codes
		verifytitle(title);
	    returnback();
	    return this;
	}
	
	public Homepage giftcards(String title) {
		click(giftcard);  //Gifts Cards and E-Gift Cards - Best Buy
		verifytitle(title);
		returnback();
		return this;
	}
	
	public Homepage giftideas(String title) {
		click(giftidea);  //Gift Ideas 2023: Best Gifts to Give This Year - Best Buy
		verifytitle(title);
		returnback();
		return this;
	}
	
	public Homepage topdeals(String title) {
		click(topdeals);    //Top Deals and Featured Offers on Electronics - Best Buy
		verifytitle(title);
		returnback();
		return this;
	}
	
	public Homepage dealoftheday(String title) {
		click(dealofday);  //Deal of the Day: Electronics Deals - Best Buy
		verifytitle(title);
		returnback();
		return this;
	}
	
	 public Homepage bbsellsthat(String title) {
			click(yesbbsellsthat);  //Yes, Best Buy Sells That – Best Buy
			verifytitle(title);
			returnback();
			return this;
		}
	
	public Homepage bbmember(String title) {
		click(mybbmembership);  //My Best Buy Memberships
		verifytitle(title);
		returnback();
		return this;
	}
	
	public Homepage credidcard(String title) {
		click(more);
		click(creditcard);  //Best Buy Credit Card: Rewards & Financing
		verifytitle(title);
		returnback();
		return this;
	}
		
   
	public Homepage donateto(String title) {
		click(more);
		click(donatetostjude);  //St. Jude Children's Research Hospital - Best Buy
		verifytitle(title);
		returnback();
		return this;
	}
	
	public BottomLinks gotobottomlinks() {
		return new BottomLinks(driver);
	}
	
}
