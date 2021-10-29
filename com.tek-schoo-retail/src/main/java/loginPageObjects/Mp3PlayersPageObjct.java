package loginPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class Mp3PlayersPageObjct extends Base {
	public Mp3PlayersPageObjct () {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[text()='test 11 (0)'])[1]")
	private WebElement test11;
	@FindBy(xpath = "(//a[text()='test 12 (0)'])[1]")
	private WebElement test120;
	@FindBy(xpath = "(//a[text()='test 15 (0)'])[1]")
	private WebElement test150;
	@FindBy(xpath = "(//a[text()='test 16 (0)'])[1]")
	private WebElement test160;
	@FindBy(xpath = "(//a[text()='test 17 (0)'])[1]")
	private WebElement test170;
	@FindBy(xpath = "(//a[text()='test 18 (0)'])[1]")
	private WebElement test180;
	@FindBy(xpath = "(//a[text()='test 19 (0)'])[1]")
	private WebElement test190;
	@FindBy(xpath = "(//a[text()='test 20 (0)'])[1]")
	private WebElement test200;
	@FindBy(xpath = "(//a[text()='test 21 (0)'])[1]")
	private WebElement test210;
	@FindBy(xpath = "(//a[text()='test 22 (0)'])[1]")
	private WebElement test220;
	@FindBy(xpath = "(//a[text()='test 23 (0)'])[1]")
	private WebElement test230;
	@FindBy(xpath = "(//a[text()='test 24 (0)'])[1]")
	private WebElement test240;
	@FindBy(xpath = "//a[text()='test 4 (0)']")
	private WebElement test40;
	@FindBy(xpath = "//a[text()='test 5 (0)']")
	private WebElement test50;
	@FindBy(xpath = "//a[text()='test 6 (0)']")
	private WebElement test60;
	@FindBy(xpath = "//a[@xpath='1']")
	private WebElement test70;
	@FindBy(xpath = "(//a[text()='MP3 Players'])[1]")
	private WebElement mp3players;
	@FindBy(xpath = "//a[text()='test 8 (0)']")
	private WebElement test80;
	@FindBy(xpath = "//a[text()='test 9 (0)']")
	private WebElement test90;
	@FindBy(xpath = "//a[text()='Show All MP3 Players']")
	private WebElement showallmp3players;
	@FindBy(xpath = "//li[@xpath='1']")
	private WebElement home;
	@FindBy(xpath = "(//a[text()='MP3 Players'])[2]")
	private WebElement mp3player;
	@FindBy(xpath = "//a[text()='Desktops (13)']")
	private WebElement desktops13;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks (5)']")
	private WebElement laptopandnotebooks5;
	@FindBy(xpath = "//a[text()='Components (2)']")
	private WebElement components2;
	@FindBy(xpath = "//a[text()='Tablets (1)']")
	private WebElement tablets1;
	@FindBy(xpath = "//a[text()='Software (0)']")
	private WebElement software0;
	@FindBy(xpath = "//a[text()='Phones & PDAs (3)']")
	private WebElement phonesandPDAs;
	@FindBy(xpath = "//a[text()='Cameras (2)']")
	private WebElement cameras2;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']")
	private WebElement mp3players4;
	@FindBy(xpath = "//a[contains(text(),'- test 11 (0)')]")
	private WebElement test1;
	@FindBy(xpath = "//a[contains(text(),'- test 12 (0)')]")
	private WebElement test12;
	@FindBy(xpath = "//a[contains(text(),'- test 15 (0)')]")
	private WebElement test15;
	@FindBy(xpath = "//a[contains(text(),'- test 16 (0)')]")
	private WebElement test16;
	@FindBy(xpath = " //a[contains(text(),'- test 17 (0)')]")
	private WebElement test17;
	@FindBy(xpath = "//a[contains(text(),'- test 18 (0)')]")
	private WebElement test18;
	@FindBy(xpath = "//a[contains(text(),'- test 19 (0)')]")
	private WebElement test19;
	@FindBy(xpath = "//a[contains(text(),'- test 20 (0)')]")
	private WebElement test20;
	@FindBy(xpath = "//a[contains(text(),'- test 21 (0)')]")
	private WebElement test21;
	@FindBy(xpath = "//a[contains(text(),'- test 22 (0)')]")
	private WebElement test22;
	@FindBy(xpath = "//a[contains(text(),'- test 23 (0)')]")
	private WebElement test23;
	@FindBy(xpath = "//a[contains(text(),'- test 24 (0)')]")
	private WebElement test24;
	@FindBy(xpath = "//a[contains(text(),'- test 4 (0)')]")
	private WebElement test4;
	@FindBy(xpath = "//a[contains(text(),'- test 5 (0)')]")
	private WebElement test5;
	@FindBy(xpath = "//a[contains(text(),'- test 6 (0)')]")
	private WebElement test6;
	@FindBy(xpath = "//a[contains(text(),'- test 7 (0)')]")
	private WebElement test7;
	@FindBy(xpath = " //a[contains(text(),'- test 8 (0)')]")
	private WebElement test8;
	@FindBy(xpath = "//a[contains(text(),'- test 9 (0)')]")
	private WebElement test9;
	@FindBy(xpath = "//img[@class='img-responsive']")
	private WebElement imgresponsive;
	@FindBy(xpath = "//i[@class='fa fa-th-list']")
	private WebElement fathelist;
	@FindBy(xpath = "//i[@class='fa fa-th']")
	private WebElement fathexpath;
	@FindBy(xpath = "//a[text()='Product Compare (0)']")
	private WebElement productCompare;
	@FindBy(xpath = "//label[@class='input-group-addon']")
	private WebElement groupaddon;
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement defaultsort;
	@FindBy(xpath = "//label[@class='input-group-addon']")
	private WebElement show;
	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement inputlimit15;
	@FindBy(xpath = "//img[@alt='iPod Classic']")
	private WebElement ipodclassic;
	@FindBy(xpath = "//span[@class='hidden-xs hidden-sm hidden-md']")
	private WebElement addtocart;
	@FindBy(xpath = "//i[@xpath='1']")
	private WebElement faheart;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement faexchange;
	@FindBy(xpath = "//img[@alt='iPod Nano']")
	private WebElement ipodNano;
	@FindBy(xpath = "//a[@xpath='1']")
	private WebElement ipodnanotext;
	@FindBy(xpath = "//p[@xpath='1']")
	private WebElement textbellowipodnano;
	@FindBy(xpath = "//p[@class='price']")
	private WebElement price;
	@FindBy(xpath = "(//span[@class='price-tax'])[2]")
	private WebElement taxprice;
	@FindBy(xpath = "//span[@xpath='1']")
	private WebElement addtocartipod;
	@FindBy(xpath = "//i[@class='fa fa-heart']")
	private WebElement faheartipod;
	@FindBy(xpath = "//i[@class='fa fa-exchange']")
	private WebElement faexchangeipod;
	@FindBy(xpath = "//img[@alt='iPod Shuffle']")
	private WebElement impageipodshuffle;
	@FindBy(xpath = "//a[@xpath='1']")
	private WebElement ipodshuffle;
	@FindBy(xpath = "//p[@xpath='1']")
	private WebElement textbellowipodshuffle;
	@FindBy(xpath = "//p[@class='price']")
	private WebElement priceipodshuffle;
	@FindBy(xpath = "//span[@class='price-tax']")
	private WebElement taxpriceipodshuffle;
	@FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
	private WebElement addtocartipodshuffle;
	@FindBy(xpath = "//i[@class='fa fa-heart']")
	private WebElement faheartipodshuffle;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement exchangeipodshuffle;
	@FindBy(xpath = "(//img[@alt='iPod Touch'])[1]")
	private WebElement ipodtouch;
	@FindBy(xpath = "(//a[@xpath='1'])[1]")
	private WebElement ipodtouchtext;
	@FindBy(xpath = "(//p[@xpath='1'])[1]")
	private WebElement textunderipodtouch;
	@FindBy(xpath = "//p[@class='price']")
	private WebElement priceforipodtouch;
	@FindBy(xpath = "//span[@class='price-tax']")
	private WebElement pricetaxIpodTouch;
	@FindBy(xpath = "//span[@class='hidden-xs hidden-sm hidden-md']")
	private WebElement addtocartipodTouch;
	@FindBy(xpath = "//i[@class='fa fa-heart']")
	private WebElement faheartIpodTouch;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement faExchangeIpodTouch;
	
	
	
	
	
	
	
	
}
