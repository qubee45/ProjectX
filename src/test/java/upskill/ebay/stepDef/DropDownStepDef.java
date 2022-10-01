package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.DropDownPageAction;

public class DropDownStepDef {
	
	DropDownPageAction DropDownPageActionobj = new DropDownPageAction();
	
	@When("^Select Size$")
	public void select_Size() throws Throwable {
		DropDownPageActionobj.SelectType();
	}

	@When("^Select Men Size$")
	public void select_Men_Size() throws Throwable {
		DropDownPageActionobj.SelectSize();
	}

	@When("^Select Shade$")
	public void select_Shade() throws Throwable {
		DropDownPageActionobj.SelectShade();
	}

	@When("^Select Quantity$")
	public void select_Quantity() throws Throwable {
		DropDownPageActionobj.SelectQty();
	}

	@Then("^Add to shopping cart$")
	public void add_to_shopping_cart() throws Throwable {
		DropDownPageActionobj.AddToCart();
	}



}
