package pckg1.launchbrowser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vipin {
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		System.out.println("Launch the guru 99 customer app");
		driver.manage().window().maximize();

		System.out.println("Maximize the browser");
		Thread.sleep(3000);
		driver.findElement(By.name("cusid")).sendKeys("007");
		System.out.println("Cust Id is passed");
		driver.findElement(By.name("submit")).click();
		System.out.println("Submit button is clicked");
		Thread.sleep(1000);

		Alert obj=driver.switchTo().alert();
		String text=obj.getText();
		System.out.println("The Given Text is :"+text);
		Thread.sleep(1000);
		obj.accept();
		System.out.println("Alert is accepted");

		System.out.println("---------------------------------------------");
		driver.findElement(By.name("cusid")).sendKeys("005");					
		driver.findElement(By.name("submit")).submit();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("values");
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		System.out.println("Alert is Dismissed");
		driver.quit();
		System.out.println("Quit the browser");


	}
}
