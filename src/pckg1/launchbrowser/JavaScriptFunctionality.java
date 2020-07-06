package pckg1.launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptFunctionality extends Launch{

	public JavaScriptFunctionality() throws InterruptedException {
		super();
	}

	public static void main(String[] args) throws InterruptedException {
		JavaScriptFunctionality j = new JavaScriptFunctionality();
		
		/*driver.get("url");
		driver.findElement(By.xpath("path")).sendKeys("values");
		driver.findElement(By.xpath("path")).click();*/
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location = 'https://opensource-demo.orangehrmlive.com/'");
		
		
		WebElement usnername = driver.findElement(By.name("txtUsername"));
		WebElement pwd = driver.findElement(By.name("txtPassword"));
		WebElement submit = driver.findElement(By.name("Submit"));
		

		js.executeScript("arguments[0].value='"+ "Admin" +"';", usnername);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='"+ "admin123" +"';", pwd);
		Thread.sleep(2000);

		js.executeScript("arguments[0].click();", submit);
		Thread.sleep(2000);

	}
}
