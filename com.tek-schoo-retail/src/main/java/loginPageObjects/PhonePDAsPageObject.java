package loginPageObjects;

import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonePDAsPageObject extends Base {
	
	public PhonePDAsPageObject() {
		
		PageFactory.initElements(driver, this);
	}
@FindBy();
}
