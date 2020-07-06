package pckg1.launchbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypesOfWait {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://fb.com");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);

		driver.manage().window().maximize();
		System.out.println("browser maximized");
		Thread.sleep(2000);	
		System.out.println("fb application launched");



		/*WebDriverWait ww = new WebDriverWait(driver, 30);

		ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
		driver.findElement(By.id("email")).sendKeys("yuvaraj");*/


		Wait fw = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(TimeoutException.class, NoSuchElementException.class);
		fw.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));


		try
		{
			driver.findElement(By.id("email")).sendKeys("yuvaraj");
		}
		catch(Exception e)
		{
			System.out.println("using fluent wait it has been checked");
		}



		try {
			//ww.until(ExpectedConditions.urlContains("amama"));
			System.out.println("match found");
		}
		catch(Exception e) {

			System.out.println("url not found");
		}

		try {
			driver.findElement(By.id("pass")).sendKeys("password123");
		}
		catch(Exception e)
		{
			try {
			driver.findElement(By.id("password")).sendKeys("password123");
			}
			catch(Exception e1) {
		System.out.println("exception handled");}
		}

	}

}
