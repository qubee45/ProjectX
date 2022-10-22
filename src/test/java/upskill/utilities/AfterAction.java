package upskill.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterAction {
	TakeScreenShot TakeScreenShotObj = new TakeScreenShot();
	
	@After
	public void afterAction(Scenario Scenario) throws Exception {
		
		if(Scenario.isFailed()) {
			TakeScreenShotObj.screenShot();
		}
		
		SetupDriver.tearDownDriver();
		System.out.println("--------Test Complete, Browser Closed");
		
	}

}
