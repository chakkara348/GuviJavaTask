import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signUpAndLogin {
	
	static WebDriver driver;
	static String name,email,pass;
	
public static void openURL(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

public void signUp(String name,String email,String pass) throws InterruptedException {
	this.name = name;
	this.email = email;
	this.pass = pass;
	driver.findElement(By.xpath("//div//a[text()='Sign up']")).click();
	Thread.sleep(5000);
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
	
}

	public static void main(String[] args) throws InterruptedException {
		
		openURL("https://www.guvi.in/");
		signUpAndLogin objSignUp = new signUpAndLogin();
		objSignUp.signUp("Chakku", "chakku348@gmail.com", "chakku348");

	}

}
