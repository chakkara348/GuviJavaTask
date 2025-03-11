import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoBlazeWebPage {
	
static WebDriver driver;
	
	public static void initializeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void openBrowser() {
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		
		if (pageTitle.equals("STORE")) {
			System.out.println("Page landed on correct website ");
		}else {
			System.out.println("Page not landed on correct website");
		}
	}

	public static void main(String[] args) {

		initializeBrowser();
		openBrowser();
	}

}
