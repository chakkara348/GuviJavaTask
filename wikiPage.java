import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wikiPage {
	
static WebDriver driver;
	
	public static void initializeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void openBrowser() {
		
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
	}
	
	public static void wikiPageOperations() {
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'History')]")).click();
		
		System.out.println("The Current page Title: "+driver.getTitle());
	}

	public static void main(String[] args) {
		initializeBrowser();
		openBrowser();
		wikiPageOperations();

	}

}
