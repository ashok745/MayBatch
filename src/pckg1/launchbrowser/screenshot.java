package pckg1.launchbrowser;

import java.awt.Window;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.util.SSCellRange;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	static WebDriver driver;
	static File source;
	static int c=0;

	 static void sshot(WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot)driver;
		source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/Screen["+c+"].png"));
		c++;
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.edureka.co/");
		driver.manage().window().maximize();

		WebElement to = driver.findElement(By.xpath("//h2[text()='Recent Additions']"));
		Point location = to.getLocation();
		int y = location.getY();
		System.out.println(y);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1813)");
		
		
		Thread.sleep(3000);
		sshot(driver);

		js.executeScript("window.scrollBy(0,-1813)");
		Thread.sleep(3000);
		sshot(driver);
		

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		sshot(driver);


		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,4438)");

		js.executeScript("arguments[0].scrollIntoView();", to);
		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/Screen["+c+"].png"));
		c++;
		System.out.println("the Screenshot is taken");

		js.executeScript("window.scrollBy(0,-4438)");
		Thread.sleep(3000);


		FileUtils.copyFile(source, new File("./Screenshots/Screen["+c+"].png"));
		c++;
		System.out.println("the Screenshot is taken");

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		System.out.println("scroll up and down completed");



		FileUtils.copyFile(source, new File("./Screenshots/Screen["+c+"].png"));
		c++;
		System.out.println("the Screenshot is taken");*/
	}

}
