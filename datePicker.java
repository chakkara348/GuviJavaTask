import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datePicker {
	
	public static WebDriver driver;
	
	
	public static void openURL(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static void selectDate(String date) {
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		driver.findElement(By.xpath("//a[@data-date='"+ date+"']")).click();
	}
	
	public static void selectedDate() {
		String selectedDateString = driver.findElement(By.xpath("//p//input[@id='datepicker']")).getAttribute("value");
		System.out.println("Selected Date: "+selectedDateString);
	}
	
	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		openURL("https://jqueryui.com/datepicker/");
		selectDate("22");
		selectedDate();
		closeBrowser();
	}

}
