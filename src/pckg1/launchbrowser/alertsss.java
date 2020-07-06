package pckg1.launchbrowser;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alertsss {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");   

		driver.manage().window().maximize();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click(); 
		Thread.sleep(3000);
		Alert alert = (Alert) driver.switchTo().alert();  
		Thread.sleep(3000);
		alert.dismiss();  
		Thread.sleep(3000);
		String pass = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(pass);
		driver.quit();

		driver.findElement(By.name("cusid")).sendKeys("001");					
		driver.findElement(By.name("submit")).submit();
		Thread.sleep(3000);
		Alert obj = driver.switchTo().alert();
		String text = obj.getText();
		System.out.println(text);
		Thread.sleep(5000);

		obj.accept();
		System.out.println("alert has accepted");
		Thread.sleep(3000);



		driver.findElement(By.name("cusid")).sendKeys("002");					
		driver.findElement(By.name("submit")).submit();
		Thread.sleep(3000);
		obj.dismiss();
		Thread.sleep(3000);
		System.out.println("alert dismissed");
		driver.quit();
	}

}
