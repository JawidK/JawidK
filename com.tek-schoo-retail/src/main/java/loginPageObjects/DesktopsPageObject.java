package loginPageObjects;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import core.Base;
	public class DesktopsPageObject extends Base {

		public DesktopsPageObject() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "(//a[text()='Desktops'])[1]")
		private WebElement destops;
		@FindBy(xpath = "(//a[text()='PC (0)'])[1]")
		private WebElement dropDwonLinkPCLink;
		@FindBy(xpath = "(//a[text()='Mac (1)'])[1]")
		private WebElement dropDwonLinkMcLink;
		@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
		private WebElement showAllDesktops;
		@FindBy(xpath = "//ul[@class='breadcrumb']")
		private WebElement desktopNavigation;
		@FindBy(xpath = "(//a[text()='Desktops'])[2]")
		private WebElement desktopsNavigation;
		@FindBy(xpath = "//h2[contains(text(),'Desktops')]")
		private WebElement desktopsPageTitle;
		@FindBy(xpath = "//img[@class='img-thumbnail']")
		private WebElement desktopsPageImage;
		@FindBy(xpath = "//a[text()='PC (0)']")
		private WebElement pcNavigationLink;
		@FindBy(xpath = "(//a[text()='Mac (1)'])[2]")
		private WebElement macNavigationLink;
		@FindBy(id = "list-view")
		private WebElement listView;
		@FindBy(id = "grid-view")
		private WebElement gradeView;
		@FindBy(id = "compare-total")
		private WebElement compareTotal;
		@FindBy(xpath = "//select[@id='input-sort']")
		private WebElement sortBy;
		@FindBy(xpath = "//select[@id='input-limit']")
		private WebElement show;
		
		@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
		private WebElement appleCinemaImage;
		@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
		private WebElement appleCinemaLink;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
		private WebElement appleCinemaAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[10]")
		private WebElement appleCinemaAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[11]")
		private WebElement appleCinemaCampreThisProduct;
		
		@FindBy(xpath = "//img[@title='Canon EOS 5D']")
		private WebElement Canon_EOS_5D_Image;
		@FindBy(xpath = "//a[text()='Canon EOS 5D']")
		private WebElement Canon_EOS_5D_Link;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
		private WebElement Canon_EOS_5D_AddToCart;
		@FindBy(xpath = "(//button[@type='button'])[13]")
		private WebElement Canon_EOS_5D_AddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[14]")
		private WebElement Canon_EOS_5D_CompareThisProduct;
		
		@FindBy(xpath = "//img[@title='HP LP3065']")
		private WebElement HP_LP3065Image;
		@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
		private WebElement HP_LP3065Link;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
		private WebElement HP_LP3065AddToCart;
		@FindBy(xpath = "(//button[@type='button'])[15]")
		private WebElement HP_LP3065AddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[16]")
		private WebElement HP_LP3065CampareThisProduct;
		
		@FindBy(xpath = "//img[@title='HTC Touch HD']")
		private WebElement HTC_Touch_HD_Image;
		@FindBy(xpath = "//a[text()='HTC Touch HD']")
		private WebElement HTC_Touch_HD_Link;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
		private WebElement HTC_Touch_HD_AddToCart;
		@FindBy(xpath = "(//button[@type='button'])[19]")
		private WebElement HTC_Touch_HD_AddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[20]")
		private WebElement HTC_Touch_HD_CompareThisProduct;
		
		@FindBy(xpath = "//img[@title='iPhone']")
		private WebElement iphoneImage;
		@FindBy(xpath = "//a[contains(text(),'iPhone')]")
		private WebElement iphoneLink;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[5]")
		private WebElement iphoneAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[22]")
		private WebElement iphoneAddToWishLinst;
		@FindBy(xpath = "(//button[@type='button'])[23]")
		private WebElement iphoneAddCompareThisProduct;
		
		@FindBy(xpath = "//img[@title='iPod Classic']")
		private WebElement ipodClassicImage;
		@FindBy(xpath = "//a[contains(text(),'iPod Classic')]")
		private WebElement ipodClassicLink;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[6]")
		private WebElement ipodClassicAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[25]")
		private WebElement ipodClassicAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[26]")
		private WebElement ipodClassicCompareThisProduct;
		
		@FindBy(xpath = "//img[@title='MacBook']")
		private WebElement macBookImage;
		@FindBy(xpath = "//a[text()='MacBook']")
		private WebElement macBookLink;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[7]")
		private WebElement macBookAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[28]")
		private WebElement macBookAddToWish;
		@FindBy(xpath = "(//button[@type='button'])[29]")
		private WebElement macBookAddCompareThisProduct;
		
		@FindBy(xpath = "//img[@title='MacBook Air']")
		private WebElement macBookAirImage;
		@FindBy(xpath = "//a[text()='MacBook Air']")
		private WebElement macBookAirLink;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[8]")
		private WebElement macBookAirAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[31]")
		private WebElement macBookAirAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[32]")
		private WebElement macBookAirCompareThisProduct;

		@FindBy(xpath = "//img[@title='Palm Treo Pro']")
		private WebElement plamTreoProImage;
		@FindBy(xpath = "//a[text()='Palm Treo Pro']")
		private WebElement plamTreoProLink;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[9]")
		private WebElement plamTreoProAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[34]")
		private WebElement plamTreoProAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[35]")
		private WebElement plamTreoProCompareThisProduct;
		
		@FindBy(xpath = "//img[@title='Product 8']")
		private WebElement Product8Image;
		@FindBy(xpath = "//a[text()='Product 8']")
		private WebElement Product8Link;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[10]")
		private WebElement Product8AddToCart;
		@FindBy(xpath = "(//button[@type='button'])[37]")
		private WebElement Product8AddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[38]")
		private WebElement Product8CompareThisProduct;
		
		@FindBy(xpath = "//img[@title='Samsung SyncMaster 941BW']")
		private WebElement samsungSyncMasterImage;
		@FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']")
		private WebElement samsungSyncMasterLink;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[11]")
		private WebElement samsungSyncMasterAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[40]")
		private WebElement samsungSyncMasterAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[41]")
		private WebElement samsungSyncMasterCompareThisProduct;
		
		@FindBy(xpath = "//img[@title='Sony VAIO']")
		private WebElement sonyVaioImage;
		@FindBy(xpath = "//a[text()='Sony VAIO']")
		private WebElement sonyVaioLink;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[12]")
		private WebElement sonyVaioAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[43]")
		private WebElement sonyVaioAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[44]")
		private WebElement sonyVaioCompareThisProduct;
		
		
		// this is side navigation links 
		@FindBy(xpath = "//a[contains(text(),'Desktops (13)')]")
		private WebElement desktopsSideNavigation;
		
		@FindBy(xpath = "//a[contains(text(),'- PC (0)')]")
		private WebElement pcNavigations;
		
		@FindBy(xpath = "//a[contains(text(),'- Mac (1)')]")
		private WebElement macNavigation;
		
		@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
		private WebElement LaptopsAndNotebooksNavigation;
		
		@FindBy(xpath = "//a[contains(text(),'Components (2)')]")
		private WebElement componentsNavigation;
		
		@FindBy(xpath = "//a[contains(text(),'Tablets (1)')]")
		private WebElement tabletsNavigation;
		
		@FindBy(xpath = "//a[contains(text(),'Software (0)')]")
		private WebElement softwareNavigation;
		
		@FindBy(xpath = "//a[contains(text(),'Phones & PDAs (3)')]")
		private WebElement phonesAndpadsNavigation;
		
		@FindBy(xpath = "//a[contains(text(),'Cameras (2)')]")
		private WebElement camerasNavigation;
		
		@FindBy(xpath = "//a[contains(text(),'MP3 Players (4)')]")
		private WebElement mp3PlayersNavigation;
		

}
