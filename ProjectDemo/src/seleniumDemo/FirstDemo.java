package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String var = "Firefox";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		String url_val =driver.getCurrentUrl();
		System.out.println(url_val);
		String page_title = driver.getTitle();
		System.out.println(page_title);
		
		driver.findElement(By.linkText("REGISTER")).click(); // For Clicking on Register Link.
		driver.findElement(By.name("firstName")).sendKeys("Abhishek"); 
		driver.findElement(By.name("lastName")).sendKeys("Bal");
		
		Select se = new Select(driver.findElement(By.name("country")));
		se.selectByVisibleText("INDIA ");
		WebDriverWait waitExplicit = new WebDriverWait(driver, 30);
		
		WebElement element =driver.findElement(By.id("email"));
		waitExplicit.until(ExpectedConditions.elementToBeClickable(element));
		
		element.sendKeys("abhishekbal");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abhi123");
		driver.findElement(By.cssSelector("input[name=confirmPassword]")).sendKeys("abhi123");
		
		driver.findElement(By.id("email")).submit();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		

	}

}
