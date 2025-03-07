package Assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleWebPage {
	
	static WebDriver driver;
	
	public static void initializeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
	}
	
	public static void wikiPageOperation() {
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'History')]")).click();
		
		System.out.println("The Current page Title: "+driver.getTitle());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		initializeBrowser();
		wikiPageOperation();
	}

}
