package pckg1.launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframesss {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		System.out.println("browser maximized");
		Thread.sleep(3000);
		
		Actions ac = new Actions(driver);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'resource')]")));
		
		WebElement from = driver.findElement(By.cssSelector("#draggable"));
		WebElement to = driver.findElement(By.cssSelector("#droppable"));
		//ac.dragAndDrop(from, to).build().perform();

		
		
		Point location = to.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x +" " +y);
		
		//ac.dragAndDropBy(from, x, y).perform();	
		
		driver.switchTo().defaultContent();
		
		WebElement too = driver.findElement(By.xpath("//a[text()='Widget Factory']"));
		Point location2 = too.getLocation();
		int y2 = location2.getY();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);*/
		String s="window.scrollBy(0,"+y2+")";
		js.executeScript(s);
	}

}
