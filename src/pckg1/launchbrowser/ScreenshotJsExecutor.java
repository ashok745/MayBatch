package pckg1.launchbrowser;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotJsExecutor {
	static WebDriver driver;
	static File ss;
	static int c=0;

	public static void screenshots(WebDriver driver) throws IOException {
		TakesScreenshot ts =  (TakesScreenshot) driver;
		ss = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File ("./screenshot/screen["+c+"].png"));
		c++;
	}

	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		System.out.println("browser maximized");

		screenshots(driver);

		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin" +Keys.TAB);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		screenshots(driver);


	}


}
