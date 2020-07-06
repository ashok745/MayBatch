package pckg1.launchbrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.location = 'https://opensource-demo.orangehrmlive.com/'");	
		Thread.sleep(3000);


		driver.manage().window().maximize();
		System.out.println("browser maximized");
		 
		WebElement admin = driver.findElement(By.name("txtUsername"));
		js.executeScript("arguments[0].value='"+ "yuvaraj" +"';", admin);
		Thread.sleep(1000);
		
		js.executeScript("document.getElementById('some id').value='someValue';");

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(1000);
		
		WebElement button = driver.findElement(By.id("btnLogin"));
		js.executeScript("arguments[0].click();", button);
		Thread.sleep(3000);
		
		/*Robot robot = new Robot(); 
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin" +Keys.TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_A); 
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_D); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_M); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_I); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_N); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_1); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_2); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_3); 
		Thread.sleep(500); 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		//driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//Thread.sleep(1000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);

		//classname obj = new classname();
		//obj.methodname;


		Actions a = new Actions(driver);

		WebElement admin = driver.findElement(By.xpath("//b[text()='Admin']"));
		a.moveToElement(admin).build().perform();
		System.out.println("admin mouseovered successfully");
		Thread.sleep(5000);

		WebElement qualification = driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']"));
		a.moveToElement(qualification).perform();


		//Double click the button to launch an alertbox
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		ac.doubleClick(link).perform();


		//click and hold
	    driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html"); 
		driver.manage().window().maximize();

		WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']")); 

		Actions ac = new Actions(driver); 
		ac.contextClick(titleC).perform();
		Thread.sleep(2000);
		ac.moveToElement(titleC); 
		ac.clickAndHold().perform(); 
		ac.release().perform();

		//drag and drop
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[contains(@class,'demo-frame')])[1]")));
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		WebElement from= driver.findElement(By.xpath("//h5[contains(text(),'High')]"));
		Thread.sleep(2000);
		WebElement to= driver.findElement(By.xpath("//div[@id='trash']")); 
		Thread.sleep(2000);
		ac.dragAndDrop(from, to).build().perform();
		//ac.dragAndDrop(from, to).build().perform();



		WebElement live= driver.findElement(By.xpath("(//a[contains(text(),'Tester')])[1]"));     
		ac.moveToElement(live).build().perform();
		Thread.sleep(3000);


		//drag and drop x-y offset
		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions ac = new Actions(driver);

		driver.switchTo().frame(0);
		WebElement from = driver.findElement(By.cssSelector("#draggable"));
		WebElement to = driver.findElement(By.cssSelector("#droppable"));
		Point location = to.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x +" " +y);

		//ac.dragAndDrop(from, to).build().perform();
		ac.dragAndDropBy(from, 146, 18).perform();*/
	}
}
