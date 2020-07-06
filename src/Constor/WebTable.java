package Constor;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		Thread.sleep(3000);
		System.out.println("Launch learn.letskodeit.com url");
		driver.manage().window().maximize();
		System.out.println("Maximize the browser");
		Thread.sleep(3000);
		System.out.println("===================================================");
		WebElement to=driver.findElement(By.xpath("//legend[contains(text(),'Web Table Example')]"));
		System.out.println("The Given WebElement is :"+to);
		Point location=to.getLocation();
		System.out.println("The Location for the WebElement is :=>"+location);
		int y=location.getY();
		System.out.println("The Location of y is : "+y);//853
		Thread.sleep(3000);
		//It is for scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,853)");
		System.out.println("Scroll Down");
		Thread.sleep(5000);
		List<WebElement> col=driver.findElements(By.xpath("//table[@id='product']//tbody//tr//th"));
		System.out.println("The Given List for the column is :=>"+col);
		System.out.println("===================================================");
		int colsize = col.size();
		for (int i = 0; i < col.size(); i++) {
			System.out.println(col.get(i).getText());

		}
		System.out.println("===================================================");
		Thread.sleep(5000);
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='product']//tbody//tr//td[1]"));
		System.out.println("The rows of the respected WebTables are :"+row);
		System.out.println(row.size());
		int rowsize = row.size();

		Thread.sleep(5000);
		System.out.println("===================================================");
		List<WebElement> all=driver.findElements(By.xpath("//table[@id='product']//tbody//tr//td"));
		System.out.println("The all rows of the respected WebTables are :"+all);
		System.out.println(all.size());
		System.out.println("===================================================");
		for (int i = 2; i<=(rowsize+1); i++) {
			for (int j = 1; j <= colsize; j++) {
				WebElement ele=driver.findElement(By.xpath("//table[@id='product']//tbody//tr["+i+"]//td["+j+"]"));
				System.out.print(ele.getText() +"	");

			}
			System.out.println();

		}






		driver.quit();
		System.out.println("Quit the browser");
		System.out.println("=================The End=====================");
	}

}

