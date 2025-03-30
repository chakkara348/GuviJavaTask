import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragAndDrop {
	
public static WebDriver driver;
	
	
	public static void openURL(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static void dropAndDropMethod() {
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement sourcElement = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement targetElement = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourcElement, targetElement).perform();
		
		String colour = driver.findElement(By.cssSelector("#droppable")).getCssValue("color");
		if (colour.contentEquals(driver.findElement(By.cssSelector("#droppable")).getCssValue("color"))) {
			System.out.println("Drag and Drop is successful");
		}else {
			System.out.println("Drag and Drop is not successful");
		}
		
		String dropTextString = driver.findElement(By.xpath("//div[@id='droppable']//p")).getText();
		if (dropTextString.contentEquals(driver.findElement(By.xpath("//div[@id='droppable']//p")).getText())) {
			System.out.println("Text is changed to dropped");
		}else {
			System.out.println("Text is not changed to dropped");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		openURL("https://jqueryui.com/droppable/");
		dropAndDropMethod();
	}

}
