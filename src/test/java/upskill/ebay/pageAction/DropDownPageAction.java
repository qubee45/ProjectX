package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.DropDownLocator;
import upskill.utilities.SetupDriver;

public class DropDownPageAction {
	
	DropDownLocator DropDownLocatorobj;
	
	public DropDownPageAction() {
		
		DropDownLocatorobj	= new DropDownLocator();
		PageFactory.initElements(SetupDriver.driver, DropDownLocatorobj);
			
	}
	
	public void SelectType() throws Exception {
		Select dropDown = new Select(DropDownLocatorobj.ShirtSizeType);
		dropDown.selectByVisibleText("Big & Tall");
		Thread.sleep(1000);
	}
	
	public void SelectSize() throws Exception {
		Select dropDown = new Select( DropDownLocatorobj.MenShirtSize);
		dropDown.selectByValue("4");
		Thread.sleep(2000);
	}
	
	public void SelectShade() throws Exception {
		Select dropDown = new Select(DropDownLocatorobj.ShirtShade);
		dropDown.selectByIndex(4);
		Thread.sleep(2000);
	}
	
	public void SelectQty() throws Exception {
		DropDownLocatorobj.textbxQty.sendKeys("2");
		Thread.sleep(1000);
	}
	public void AddToCart() throws Exception {
		DropDownLocatorobj.AddtoCart.click();
		Thread.sleep(1000);
	}

}
