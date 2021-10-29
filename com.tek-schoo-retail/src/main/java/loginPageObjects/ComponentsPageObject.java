package loginPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {
	public ComponentsPageObject () {
			PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='My Account']")
    private WebElement Myaccount;
	@FindBy(xpath = "(//a[text()='Mice and Trackballs (0)'])[1]")
	private WebElement MiceandTracBalls;
	@FindBy(xpath = "//a[text()='Monitors (2)']")
	private WebElement Monitor;
	@FindBy(xpath = "//a[text()='Printers (0)']")
	private WebElement Printers;
	@FindBy(xpath = "//a[text()='Scanners (0)']")
	private WebElement scanners;
	@FindBy(xpath = "//a[text()='Web Cameras (0)']")
	private WebElement Webcameras;
	@FindBy(xpath = "//a[text()='Show All Components']")
	private WebElement ShowAllComponents;
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement home;
	@FindBy(xpath = "(//a[text()='Components'])[2]")
	private WebElement Components;
	@FindBy(xpath = "//a[text()='Desktops (13)']")
	private WebElement Desktops;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks (5)']")
	private WebElement LaptopsNotebooks;
	@FindBy(xpath = "//a[text()='Components (2)']")
	private WebElement Components2;
	@FindBy(xpath = "(//a[@class='list-group-item active'])[2]")
	private WebElement MiceandTrackBalls;
	@FindBy(xpath = "/a[contains(text(),'- Monitors (2)')]")
	private WebElement Monitors;
	@FindBy(xpath ="//a[contains(text(),'- Printers (0)')]")
	private WebElement printers;
	@FindBy(xpath = "//a[contains(text(),'- Scanners (0)')]")
	private WebElement Scanners;
	@FindBy(xpath = "//a[contains(text(),'- Web Cameras (0)')]")
	private WebElement webcameras;
	@FindBy(xpath = "//a[contains(text(),'Tablets (1)')]")
	private WebElement Tablest;
	@FindBy(xpath = "//a[text()='Software (0)']")
	private WebElement software;
	@FindBy(xpath = "//a[text()='Phones & PDAs (3)']")
	private WebElement phoneandPDAs;
	@FindBy(xpath = "//a[text()='Cameras (2)']")
	private WebElement cameras;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']")
	private WebElement mp3Players;
	@FindBy(xpath = "//img[@class='img-responsive']")
	private WebElement imageresponsive;
	@FindBy(xpath = "//h2[text()='Printers']")
	private WebElement printer;
	@FindBy(xpath = "//p[contains(text(),'There are no products to list in this category.')]")
	private WebElement thereareno;
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement continu;
	
}
