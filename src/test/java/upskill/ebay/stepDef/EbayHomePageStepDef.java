package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageAction;

public class EbayHomePageStepDef {
	
	EbayHomepageAction EbayHomepageActionobj = new EbayHomepageAction();

@Given("^Open Ebay Homepage$")
public void open_Ebay_Homepage() throws Throwable {
	
    
}

@When("^Search for shoes$")
public void search_for_shoes() throws Throwable {
	EbayHomepageActionobj.searchShoes();
   
}

@Given("^Search for \"([^\"]*)\"$")
public void search_for(String Items) throws Throwable {
	EbayHomepageActionobj.searchItems(Items);
  
}

@Given("^Search for Shirt$")
public void search_for_Shirt() throws Throwable {
	EbayHomepageActionobj.searchItems("Big & Tall Cotton Tee");
    
}


}
