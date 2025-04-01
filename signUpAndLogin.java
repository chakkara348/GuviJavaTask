import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signUpAndLogin {
	
	static WebDriver driver;

	public static void openURL(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	public void signUp(String name, String email, String pass, String mobnum) throws InterruptedException {
		driver.findElement(By.xpath("//div//a[text()='Sign up']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys(mobnum);
		driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
		Thread.sleep(3000);
		String signedOnMessageString = driver.findElement(By.xpath("//h1[text()='Welcome to GUVI!']")).getText();
		if (signedOnMessageString
				.contentEquals(driver.findElement(By.xpath("//h1[text()='Welcome to GUVI!']")).getText())) {
			System.out.println("Signed Up Successfully");
		} else {
			System.out.println("Not signed up");
		}
		driver.findElement(By.xpath("//a[@id='laterBtn']")).click();
		Thread.sleep(5000);

	}
	
	//Login for valid username and password
	public static void login(String email,String pass) throws InterruptedException {
		driver.navigate().to("https://www.guvi.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		Thread.sleep(3000);
		String loginText= driver.getTitle();
		if (loginText.contentEquals(driver.getTitle())) {
			System.out.println("Logged in Successfully");
		}else {
			System.out.println("Not logged in");
		}
		Thread.sleep(3000);
	}
	
	public static void closeBrowser() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {

		openURL("https://www.guvi.in/");
		signUpAndLogin objSignUp = new signUpAndLogin();
		objSignUp.signUp("Chakku", "chakkari348@gmail.com", "chakku348", "6757345678");
		login("chakkaravarthi348@gmail.com","Chakku@348");
		closeBrowser();

	}
}
