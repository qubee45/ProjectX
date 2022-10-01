package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownLocator {
	
	@FindBy(xpath="//select[@name='Size Type']")
	public WebElement ShirtSizeType;
	
	@FindBy(xpath="//select[@id='msku-sel-2']")
	public WebElement MenShirtSize;
	
	@FindBy(xpath="//select[@id='msku-sel-3']")
	public WebElement ShirtShade;
	
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement textbxQty;
	
	@FindBy(xpath="//a[@id='atcRedesignId_btn']")
	public WebElement AddtoCart;

}
