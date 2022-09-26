package upskill.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterAction {
	
	@After
	public void afterAction(Scenario Scenario) {
		
		SetupDriver.tearDownDriver();
		System.out.println("--------Test Complete, Browser Closed");
		
	}

}
