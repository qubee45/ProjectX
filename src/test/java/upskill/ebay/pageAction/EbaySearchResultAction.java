package upskill.ebay.pageAction;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbaySearchResultLocator;
import upskill.utilities.SetupDriver;

public class EbaySearchResultAction {
	
	EbaySearchResultLocator EbaySearchResultLocatorobj;
	
	public EbaySearchResultAction() {
		
		EbaySearchResultLocatorobj = new EbaySearchResultLocator();
		PageFactory.initElements(SetupDriver.driver, EbaySearchResultLocatorobj);
		
		
	}
	
	public void VerifyShoesItems() {
		EbaySearchResultLocatorobj.txtShoes.isDisplayed();
		
		Assert.assertEquals("Shoes", EbaySearchResultLocatorobj.txtShoes.getText());
		
		Assert.assertTrue(EbaySearchResultLocatorobj.txtShoes.isDisplayed());
	}
 public void FilterBrand(String brand) {
	 
	 if (brand.equals("Nike")) {
		 EbaySearchResultLocatorobj.cbxBrandNike.click();
	 }
	 else if (brand.equals("Adidas")) {
		 EbaySearchResultLocatorobj.cbxBrandAdidas.click();
	 }
	 else if (brand.equals("Unbranded")) {
		 EbaySearchResultLocatorobj.cbxUnbranded.click();}
	 else {
		 System.out.println("Invalid Entry");
	 }
 }
  public void VerifyBrandList(String brand) {

	  if (brand.equals("Nike")) {
			 EbaySearchResultLocatorobj.txtShoes.isDisplayed();
		 }
		 else if (brand.equals("Adidas")) {
			 EbaySearchResultLocatorobj.txtShirt.isDisplayed();
		 }
		 else if (brand.equals("Unbranded")) {
			 EbaySearchResultLocatorobj.txtPants.isDisplayed();
			 }
		 else {
			 System.out.println("Invalid Entry");
	  }
	  
  }
  
  public void SelectShirt() {
	  EbaySearchResultLocatorobj.linkShirt.click();
  }
  
  public void SwitchNewWindow() {
	  
	  for (String winhandle : SetupDriver.driver.getWindowHandles()) {
		  SetupDriver.driver.switchTo().window(winhandle);
	  }
	  
	  
		/*
		 * Set<String> AllWindowHandles = SetupDriver.driver.getWindowHandles(); String
		 * window1 = (String) AllWindowHandles.toArray()[0]; String window2 = (String)
		 * AllWindowHandles.toArray()[1]; SetupDriver.driver.switchTo().window(window2);
		 */
	  
  }
  
 
}
