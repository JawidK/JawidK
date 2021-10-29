package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Currency')]")
	private WebElement currency;
	@FindBy(xpath="//button[contains(text(),'€ Euro')]")
	private WebElement eruo;
	@FindBy(xpath="//button[contains(text(),'£ Pound Sterling')]")
	private WebElement puondSterling;
	@FindBy(xpath="//button[contains(text(),'$ US Dollar')]")
	private WebElement usDollar;
	@FindBy(xpath="//span[contains(text(),'123456789')]")
	private WebElement phoneNumber;
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	@FindBy(xpath="//span[contains(text(),'Wish List (0)')]")
	private WebElement wishList;
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;
	@FindBy(xpath="//span[contains(text(),'Checkout')]")
	private WebElement checkout;
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchBar;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	@FindBy(xpath="(//button[@type='button'])[5]")
	private WebElement cartItemButton;
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement desktops;
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private WebElement laptopAndNotebooks;
	@FindBy(xpath="//a[text()='Components']")
	private WebElement components;
	@FindBy(xpath="//a[text()='Tablets']")
	private WebElement tablets; 
	@FindBy(xpath="//a[contains(text(),'Software')]")
	private WebElement shoftware;
	@FindBy(xpath="//a[text()='Cameras']")
	private WebElement cameras;
	@FindBy(xpath="//a[text()='MP3 Players']")
	private WebElement mp3Playes;
	@FindBy(xpath="(//img[@alt='iPhone 6' and @class='img-responsive'])[2]")
	private WebElement iphoneMovableImage;
	@FindBy(xpath="(//img[@alt='MacBookAir' and @class='img-responsive'])[2]")
	private WebElement macBookAirMovableImage;
	@FindBy(xpath="(//div[@class='swiper-button-next'])[1]")
	private WebElement swiperButtonNext;
	@FindBy(xpath="(//div[@class='swiper-button-prev'])[1]")
	private WebElement swiperButtonPreview;
	
	@FindBy(xpath="(//img[@title='MacBook'])[2]")
	private WebElement macBookImage;
	@FindBy(xpath="(//a[text()='MacBook'])[2]")
	private WebElement macBookLink;
	@FindBy(xpath="(//button[@type='button'])[8]")
	private WebElement macBookAddToCart;
	@FindBy(xpath="(//button[@type='button'])[9]")
	private WebElement macBookAddToWishList;
	@FindBy(xpath="(//button[@type='button'])[10]")
	private WebElement macBookCompareThisProduct;
	
	@FindBy(xpath="//img[@title='iPhone']")
	private WebElement iphoneImage;
	@FindBy(xpath="//a[text()='iPhone']")
	private WebElement iphoneLink;
	@FindBy(xpath="(//button[@type='button'])[11]")
	private WebElement iphoneAddToCart;
	@FindBy(xpath="(//button[@type='button'])[12]")
	private WebElement iphoneAddToWishList;
	@FindBy(xpath="(//button[@type='button'])[13]")
	private WebElement iphoneCampareThisProduct;
	
	@FindBy(xpath="//img[@title='Apple Cinema 30\"']")
	private WebElement appleCinema30Image;
	@FindBy(xpath="//a[contains(text(),'Apple Cinema 30\"')]")
	private WebElement appleCinema30Link;
	@FindBy(xpath="(//button[@type='button'])[14]")
	private WebElement appleCinema30AddToCart;
	@FindBy(xpath="(//button[@type='button'])[15]")
	private WebElement appleCinema30AddToWishList;
	@FindBy(xpath="(//button[@type='button'])[15]")
	private WebElement appleCinema30CompareThisProduct;
	
	@FindBy(xpath="//img[@title='Canon EOS 5D']")
	private WebElement Canon_EOS_5DImage;
	@FindBy(xpath="//a[contains(text(),'Canon EOS 5D')]")
	private WebElement Canon_EOS_5DLink;
	@FindBy(xpath="(//button[@type='button'])[17]")
	private WebElement Canon_EOS_5DAddToCart;
	@FindBy(xpath="(//button[@type='button'])[17]")
	private WebElement Canon_EOS_5DAddToWishList;
	@FindBy(xpath="(//button[@type='button'])[17]")
	private WebElement Canon_EOS_5DCompareThisProduct;
	
	@FindBy(xpath="(//div[@class='swiper-button-next'])[2]")
	private WebElement feaderSwiperButtonNext;
	@FindBy(xpath="(//div[@class='swiper-button-prev'])[2]")
	private WebElement feaderSwiperButtonPreview;
	@FindBy(xpath="//a[contains(text(),'About Us')]")
	private WebElement Aboutus;
	@FindBy(xpath="//a[contains(text(),'Delivery Information')]")
	private WebElement deliveryInformation;
	@FindBy(xpath="//a[contains(text(),'Privacy Policy')]")
	private WebElement privacyPolicy;
	@FindBy(xpath="//a[contains(text(),'Terms & Conditions')]")
	private WebElement termsAndConditions;
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	private WebElement contactUs;
	@FindBy(xpath="//a[contains(text(),'Returns')]")
	private WebElement returns;
	@FindBy(xpath="//a[contains(text(),'Site Map')]")
	private WebElement siteMap;
	@FindBy(xpath="//a[contains(text(),'Brands')]")
	private WebElement brands;
	@FindBy(xpath="//a[contains(text(),'Gift Certificates')]")
	private WebElement giftCertifications;
	@FindBy(xpath="//a[contains(text(),'Affiliate')]")
	private WebElement affiliate;
	@FindBy(xpath="//a[contains(text(),'Specials')]")
	private WebElement specials;
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	private WebElement feaderMyAccountnavigation;
	@FindBy(xpath="//a[text()='Order History']")
	private WebElement orderHistory;
	@FindBy(xpath="//a[contains(text(),'Wish List')]")
	private WebElement feaderWishListNavigation;
	@FindBy(xpath="//a[contains(text(),'Newsletter')]")
	private WebElement newsletter;
	

}