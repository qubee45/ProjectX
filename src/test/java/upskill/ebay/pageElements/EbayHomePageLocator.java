package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocator {
	@FindBy (xpath ="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;

	
	@FindBy (xpath="//input[@type='submit']")
	public WebElement btnSearch;
	
	
	
}
