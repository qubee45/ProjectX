package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultAction;

public class EbaySearchResultStepDef {
	
	EbaySearchResultAction EbaySearchResultActionobj = new EbaySearchResultAction();
	
	@Then("^Iteam list should have only shoes releted products$")
	public void iteam_list_should_have_only_shoes_releted_products() throws Throwable {
		EbaySearchResultActionobj.VerifyShoesItems();
		Thread.sleep(500);
	 
	}
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		EbaySearchResultActionobj.FilterBrand(brand);
	}

	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		EbaySearchResultActionobj.VerifyBrandList(brand);
	}
	
	@When("^Select the first shirt on item list$")
	public void select_the_first_shirt_on_item_list() throws Throwable {
		EbaySearchResultActionobj.SelectShirt();
		EbaySearchResultActionobj.SwitchNewWindow();
	   
	}

}
