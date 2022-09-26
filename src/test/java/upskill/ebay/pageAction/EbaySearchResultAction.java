package upskill.ebay.pageAction;

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
}
