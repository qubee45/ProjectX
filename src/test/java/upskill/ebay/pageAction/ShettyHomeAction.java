package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.ShettyHomeLocator;
import upskill.utilities.SetupDriver;

public class ShettyHomeAction {
	
	ShettyHomeLocator ShettyHomeLocatorObj;
	
	public ShettyHomeAction() {
		ShettyHomeLocatorObj = new ShettyHomeLocator();
		PageFactory.initElements(SetupDriver.driver, ShettyHomeLocatorObj);
		
		
		
		
	}
	
	public void loadHomepage() {
		//Load the page without touching utilities 
		SetupDriver.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
	}
	
	public void switchIframe() {
		SetupDriver.driver.switchTo().frame("iframe-name");
		
	}
	
	public void clickHome() {
		
			List<WebElement> framelist = SetupDriver.driver.findElements(By.id("course-iframe"));
			for(int i=0; i<(framelist.size()); i++ ) {
				SetupDriver.driver.switchTo().frame(i);
				
				// If an exception error occurs, we can use try...catch to catch the error and execute some code to handle it
				try {
					ShettyHomeLocatorObj.LinkShettyHome.click();
					}catch(Exception e) {
					System.out.println("iframe not found");}}
				
	}
	
	public void DisplayHome() {
		ShettyHomeLocatorObj.LinkShettyHome.isDisplayed();
		
	}
	
	

}
