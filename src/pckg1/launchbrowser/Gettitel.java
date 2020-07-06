package pckg1.launchbrowser;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gettitel {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.pexels.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		
		
		boolean photo = driver.findElement(By.xpath("//a[text()='Explore']")).isDisplayed();
		
		if (photo==true) {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Explore']")));
			until.getText();
			//String gallery = driver.findElement(By.xpath("//a[text()='Explore']")).getText();
			//System.out.println(gallery);
			driver.findElement(By.xpath("//a[text()='Explore']")).click();
			
		}
}
}