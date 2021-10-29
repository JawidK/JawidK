package loginPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObject extends Base {
	public TabletsPageObject () {
	
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[text()='Tablets'])[1]")
	private WebElement tablets;
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement home;
	@FindBy(xpath = "(//a[text()='Tablets'])[2]")
	private WebElement tablet;
	@FindBy(xpath = "//a[text()='Desktops (13)']")
	private WebElement desktops13;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks (5)']")
	private WebElement lapttopsNotebooks;
	@FindBy(xpath = "//a[text()='Components (2)']")
	private WebElement Components;
	@FindBy(xpath = "//a[text()='Software (0)']")
	private WebElement software0;
	@FindBy(xpath = "Phones & PDAs (3)")
	private WebElement phonesandPDAs;
	@FindBy(xpath = "Cameras (2)")
	private WebElement cameras2;
	@FindBy(xpath = "MP3 Players (4)")
	private WebElement mp3Players;
	@FindBy(xpath = "(//img[@class='img-responsive'])[1]")
	private WebElement imgresponsive;
	@FindBy(xpath = "//h2[text()='Tablets']")
	private WebElement tabletss;
	@FindBy(xpath = "//button[@id='list-view']")
	private WebElement button;
	@FindBy(xpath = "//i[@class='fa fa-th']")
	private WebElement button1;
	@FindBy(xpath = "//img[@alt='Samsung Galaxy Tab 10.1']")
	private WebElement sumsunggalaxytab;
	@FindBy(xpath = "//p[@xpath='1']")
	private WebElement text;
	@FindBy(xpath = "//p[@class='price']")
	private WebElement price;
	@FindBy(xpath = "//span[@class='price-tax']")
	private WebElement pricetax;
	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement addtocard;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement faheart;
	@FindBy(xpath = "//i[@class='fa fa-exchange']")
	private WebElement faexchange;
	@FindBy(xpath = " //label[contains(text(),'Sort By:')]")
	private WebElement sortBy;
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement defaulticon;
	@FindBy(xpath = "//label[contains(text(),'Show:')]")
	private WebElement showicon;
	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement dropdown15;
	
	
	
	
	
	
	
	
	
	
	


}
