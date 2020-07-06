package pckg1.launchbrowser;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxradiobutton {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		System.out.println("browser maximized");
		
		driver.findElement(By.id("vfb-7-1")).click();
		driver.findElement(By.id("vfb-7-2")).click();

		driver.findElement(By.id("vfb-6-1")).click();
		driver.findElement(By.id("vfb-6-1")).click();
		WebElement chkbox1 = driver.findElement(By.id("vfb-6-0"));
		chkbox1.click();
		
		if(chkbox1.isSelected())
		{
			chkbox1.click();
			System.out.println("deselected the chkbox1");
		}

		
	}

}
