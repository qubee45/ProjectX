package upskill.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeAction {

	
	@Before
	public void beforeAction (Scenario scen) {
		System.out.print("--->>> Initializing Driver");
		SetupDriver.setupDrier();
		System.out.println("Test Scenario Name : " + scen.getName());
		
	}

}
