package pckg1.launchbrowser;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectmethodd {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		driver = new ChromeDriver();


		/*driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByIndex(0);
		fruits.selectByValue("grape");
		fruits.selectByVisibleText("Orange");

		fruits.deselectByIndex(3);
		fruits.deselectAll();*/



		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		System.out.println("browser maximized");

		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		driver.switchTo().defaultContent();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Select cnty= new Select(driver.findElement(By.xpath("//select[@name='country']")));
		/*List<WebElement> opt = cnty.getOptions();
		int size = opt.size();
		System.out.println("no of values in a dropdown :" +size);


		cnty.selectByVisibleText("AUSTRIA");
		System.out.println("visible selection is done");
		Thread.sleep(5000);

		cnty.selectByIndex(20);
		System.out.println("index selection is done");
		Thread.sleep(5000);

		cnty.selectByValue("CYPRUS");
		System.out.println("value selection is done");
		Thread.sleep(5000);*/
		
		List <WebElement> elementCount = cnty. getOptions();
		int iSize = elementCount. size();
		for(int i =0; i<iSize ; i++){
		String sValue = elementCount. get(i). getText();
		System. out. println(sValue);
		}
		

	}

}
