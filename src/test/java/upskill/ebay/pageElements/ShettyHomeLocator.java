package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShettyHomeLocator {
	
	@FindBy(xpath="//*[contains(text(), 'Home')]")
	public WebElement LinkShettyHome;

}
