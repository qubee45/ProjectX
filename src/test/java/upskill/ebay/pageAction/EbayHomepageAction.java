package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbayHomePageLocator;
import upskill.utilities.ReadExcelFile;
import upskill.utilities.SetupDriver;

public class EbayHomepageAction {
	
	EbayHomePageLocator EbayHomePageLocatorobj;
	
public EbayHomepageAction() {
	EbayHomePageLocatorobj = new EbayHomePageLocator();
	PageFactory.initElements(SetupDriver.driver, EbayHomePageLocatorobj);
	
}

public void searchShoes() {
	EbayHomePageLocatorobj.txtbxSearch.sendKeys("Shoes");
	EbayHomePageLocatorobj.btnSearch.click();
	
	
}

public void searchShoesFromExcelFile() throws Exception {
	EbayHomePageLocatorobj.txtbxSearch.sendKeys(ReadExcelFile.getMapData("Search"));
	EbayHomePageLocatorobj.btnSearch.click();
	}


public void searchItems(String Items) {
	EbayHomePageLocatorobj.txtbxSearch.sendKeys(Items);
	EbayHomePageLocatorobj.btnSearch.click();
	
}
//public void searchShirt() {
//	EbayHomePageLocatorobj.txtbxSearch.sendKeys("Big & Tall Cotton Tee");
//	EbayHomePageLocatorobj.btnSearch.click();
//}

public void MyEbay() throws Exception {
	
	Actions actions = new Actions(SetupDriver.driver);
	
	actions.moveToElement(EbayHomePageLocatorobj.linkMyEbay);
	actions.perform();
	Thread.sleep(10000);
	
}

public void Summary() throws Exception {
	EbayHomePageLocatorobj.linkSummary.isEnabled();
	EbayHomePageLocatorobj.linkSummary.click();
	Thread.sleep(3000);
}

public void HandleAlert() {
	//How to handle alert?
	//I use driver.SwitchTo().alert().accept()/dismiss()
	
	SetupDriver.driver.switchTo().alert().accept();
	SetupDriver.driver.switchTo().alert().dismiss();
	SetupDriver.driver.switchTo().alert().sendKeys("Survey looks good");
	SetupDriver.driver.switchTo().alert().getText();
}

public void keyBoardKeys() {
	
	//i use object.element.sendKeys(Keys.Enter/Up/Down/Clear/Delete)
	EbayHomePageLocatorobj.btnSearch.sendKeys(Keys.ENTER);
	EbayHomePageLocatorobj.btnSearch.sendKeys(Keys.UP);
	EbayHomePageLocatorobj.btnSearch.sendKeys(Keys.DOWN);
	EbayHomePageLocatorobj.btnSearch.sendKeys(Keys.CLEAR);
	EbayHomePageLocatorobj.btnSearch.sendKeys(Keys.DELETE);
	
}

public void javaScripteExcecutor() {
	
	//javaScriptExecutor 

	JavascriptExecutor js = (JavascriptExecutor)SetupDriver.driver;
	
	js.executeScript("");

	js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.click();"); //Clicking on element
	
	js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.value ='shirt';"); //Writing something
	
	js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.checked=true;"); //Interect Checkbox
	
	js.executeScript("window.location = 'http://upskill.com';"); // initializing location
	
	js.executeScript("location.reload()"); 						//Refresh browser
	
	js.executeScript("alert('Confirmation');");					//Alert
	
	js.executeScript("window.scrollBy(0,500)", ""); 			//Scroll down to specific pixel
	
	js.executeScript("window.scrollBy(0,-500)", ""); 			//Scroll up to specific pixel
	
	js.executeScript("arguments[0].scrollIntoView();", EbayHomePageLocatorobj.btnSearch);  //Scroll to a object
	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //Scroll down to bottom of website
}
	public void Iframse() {
		
		
		//Switch Iframe by Index
		SetupDriver.driver.switchTo().frame(0);
		SetupDriver.driver.switchTo().frame(1);
		
		//Switch Iframe By Name or ID
		SetupDriver.driver.switchTo().frame("iframe-name");
		SetupDriver.driver.switchTo().frame("id");
		
		//Switch back to previous iframe
		SetupDriver.driver.switchTo().defaultContent();
		SetupDriver.driver.switchTo().parentFrame();
		SetupDriver.driver.switchTo().frame("parent");
		
		//nasted iframe
		SetupDriver.driver.switchTo().frame("child");
		SetupDriver.driver.switchTo().frame("inner");
		
	}
	
	public void dynamicFrame() {
		
		//Handle mutiple iFraame
		List<WebElement> framelist = SetupDriver.driver.findElements(By.tagName("iframe"));
		for(int i=0; i<(framelist.size()); i++ ) {
			SetupDriver.driver.switchTo().frame(i);
			try {
				EbayHomePageLocatorobj.btnSearch.click();
				}catch(Exception e) {
				System.out.println("iframe not found");
			}
			
		}
	}
}


