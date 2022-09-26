package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbayHomePageLocator;
import upskill.utilities.SetupDriver;

public class EbayHomepageAction {
	
	EbayHomePageLocator EbayHomePageLocatorobj;
	
public EbayHomepageAction() {
	EbayHomePageLocatorobj = new EbayHomePageLocator();
	PageFactory.initElements(SetupDriver.driver, EbayHomePageLocatorobj);
	
}

public void searchShoes() {
	EbayHomePageLocatorobj.txtbxSearch.sendKeys("Shoes");
	EbayHomePageLocatorobj.btnSearch.click();
}

public void searchItems(String Items) {
	EbayHomePageLocatorobj.txtbxSearch.sendKeys(Items);
	EbayHomePageLocatorobj.btnSearch.click();
	
}


}
