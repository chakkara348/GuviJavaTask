import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fireFoxDriver {
	
	static WebDriver driver;
	
	public static void initializeBrowser() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	public static void openBrowser() {
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("The Curent URL: "+driver.getCurrentUrl());
		driver.navigate().refresh();
	}

	public static void main(String[] args) {

		initializeBrowser();
		openBrowser();
	}

}
