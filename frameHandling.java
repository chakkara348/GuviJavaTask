import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameHandling {
	
static WebDriver driver;
	
	public static void openUrl(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static void switchingFrame(String position) {
		
		WebElement topFramElement = driver.findElement(By.name("frame-"+position));
		driver.switchTo().frame(topFramElement);
		System.out.println("=====Frame "+position+" is selected=====");
	}
	
	public static void checkingFrame() {
		if (driver.findElements(By.xpath("//frameset[@name='frameset-middle']//frame")).size()== 3) {
			System.out.println("There are three frames are available");
		}else {
			System.out.println("Three frames are not presented");
		}
	}
	
	public static void checkingTextFrame(String text) {
		String frameTextString = driver.findElement(By.xpath("//body[contains(text(),'"+text+"')]")).getText();
	
		if (frameTextString.contentEquals(text)) {
			System.out.println("Frame Text "+text+" is matched");
		}
	}
	
	public static void checkingMiddleFrameText() {
		String frameTextString = driver.findElement(By.xpath("//div[@id='content']")).getText();
		if (frameTextString.contentEquals("MIDDLE")) {
			System.out.println("Frame text middle is matched");
		}
	}

	public static void main(String[] args){
		
		openUrl("http://the-internet.herokuapp.com/nested_frames");
		switchingFrame("top");
		checkingFrame();
		switchingFrame("left");
		checkingTextFrame("LEFT");
		driver.switchTo().defaultContent();
		switchingFrame("top");
		switchingFrame("middle");
		checkingMiddleFrameText();
		driver.switchTo().defaultContent();
		switchingFrame("top");
		switchingFrame("right");
		checkingTextFrame("RIGHT");
		driver.switchTo().defaultContent();
		switchingFrame("bottom");
		checkingTextFrame("BOTTOM");
		driver.switchTo().defaultContent();
		switchingFrame("top");

	}

}
