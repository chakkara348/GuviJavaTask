import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class newWindow {
	
	static WebDriver driver;
	
	public static void openUrl(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static void openWindow() {
		
		WebElement clickingElement = driver.findElement(By.xpath("//a[text()='Click Here']"));
		Actions actions = new Actions(driver);
		actions.click(clickingElement).perform();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window: allWindows) {
			if (window!=parentWindow) {
				driver.switchTo().window(window);
			}
			
		}
		if (driver.getTitle().equalsIgnoreCase("New Window")) {
			System.out.println("New Window is opened");
		}else {
			System.out.println("Not a new window");
		}
		driver.close();
		driver.switchTo().window(parentWindow);
		if (parentWindow.contentEquals(driver.getWindowHandle())) {
			System.out.println("Original window is active");
		}
		driver.quit();
		
	}

	public static void main(String[] args) {
		
		openUrl("https://the-internet.herokuapp.com/windows");
		openWindow();

	}

}
