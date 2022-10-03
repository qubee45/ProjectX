package upskill.ebay.pageAction;

import org.openqa.selenium.interactions.Actions;
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
//public void searchShirt() {
//	EbayHomePageLocatorobj.txtbxSearch.sendKeys("Big & Tall Cotton Tee");
//	EbayHomePageLocatorobj.btnSearch.click();
//}

public void MyEbay() throws Exception {
	
	Actions actions = new Actions(SetupDriver.driver);
	
	actions.moveToElement(EbayHomePageLocatorobj.linkMyEbay);
	actions.perform();
	Thread.sleep(10000);
	
}

public void Summary() {
	EbayHomePageLocatorobj.linkSummary.click();
}

}
