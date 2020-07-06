package pckg1.launchbrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xdgf.usermodel.section.geometry.MoveTo;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.notification.RunListener.ThreadSafe;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class Launch {
	static WebDriver driver;
	
	public Launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();driver.manage().window().maximize();
		System.out.println("browser maximized");
		Thread.sleep(2000);	}
	
	public Launch(String baseurl) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);

		driver.manage().window().maximize();
		System.out.println("browser maximized");
		Thread.sleep(2000);	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Launch o = new Launch("https:fb.com");
		
	}
}
		/*Thread.sleep(5000);
		driver = new ChromeDriver();
		int size = driver.findElements(By.xpath("(//input[@type='radio'])")).size();
		for(int i=1;i<=size;i++)
		{
			driver.findElement(By.xpath("(//input[@type='radio'])["+i+"]"));				
			//selectTestSpec-->	(//table[contains(@data-csi-automation,'FinalInspectionSection-InspectionTestSpecs')]//div[contains(text(),'Select Test Specifications')])[1]
			//TestSpecChkBox -->	//span[text()='Test Specification']/ancestor::tr/th/div/input
			//materialpage.savebtn1
		}
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(1000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);

		driver.manage().window().maximize();
		System.out.println("browser maximized");
		Thread.sleep(5000);

		Actions action = new Actions(driver);
		WebElement ss = driver.findElement(By.xpath("//h3[text()='Custom Drag Avatar']"));
		action.moveToElement(ss).build().perform();

		Actions actions = new Actions(driver);
		Thread.sleep(3000);

		WebElement from = driver.findElement(By.xpath("//h5[contains(text(),'High')]"));
		Thread.sleep(1000);
		WebElement to = driver.findElement(By.xpath("//div[@id='trash']"));
		Thread.sleep(1000);

		actions.dragAndDrop(from, to).build().perform();
		System.out.println("completed");

		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);



		//MOUSE OVER
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//b[text()='Admin']"))).perform();	
		 

		CSS SELECTOR	

	 //String text = driver.findElement(By.className("panelTrigger")).getText();
		String text =driver.findElement(By.cssSelector("a.panelTrigger")).getText();
		System.out.println(text);

		driver.findElement(By.linkText("Welcome Admin")).click();
		System.out.println("welcome admin clicked sucessfully");

		driver.findElement(By.partialLinkText("Welcome")).click();
		System.out.println("welcome admin clicked sucessfully");




		driver.get("http://fb.com/");
		System.out.println("fb launched");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);

		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("browser maximized");

		driver.findElement(By.id("email")).sendKeys("yuvarajsrec4@yahoo.in");
		driver.findElement(By.name("email")).sendKeys("karthirajan@gmail.com");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yuvarajnandhak@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("passwordone");
		Thread.sleep(1000);
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input.email")).sendKeys("sfsfdsf");
		Thread.sleep(2000);
		String text = driver.findElement(By.className("html7magic")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("first name");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sur name");

		try {
			driver.findElement(By.name("hyshfhdjfh")).sendKeys("yuvaraj");
			Thread.sleep(1000);
		}
		catch(Exception eeee)
		{
			driver.findElement(By.name("firstname")).sendKeys("yuvaraj");
			Thread.sleep(1000);
			driver.findElement(By.name("lastname")).sendKeys("namdhakumar");

			Thread.sleep(2000);
			System.out.println(eeee);
		}
		driver.findElement(By.xpath("//div[text()='Surname']")).sendKeys("surname value");
		System.out.println("linked text locator validated");

		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("login button clicked");







		//driver.quit();


		 
*/





	