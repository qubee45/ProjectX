package upskill.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {
	
public static WebDriver driver;
	
	public static void setupDrier() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-- start -maximized");
		option.addArguments("--disable-notification");
		//option.addArguments("--headless");
		driver = new ChromeDriver(option);
		driver.get("https://www.ebay.com/");
		
	}

	public static WebDriver getDriver () {
		return driver;
		
	}
	public static void tearDownDriver() {
		driver.close();
		driver.quit();
	}

}
