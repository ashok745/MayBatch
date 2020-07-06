package pckg1.launchbrowser;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {
	static WebDriver driver;

	
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		Thread.sleep(5000);

		String parentwindow = driver.getWindowHandle();
		Set<String> y = driver.getWindowHandles();
		
	
		for (String windowname : y) //y=parent . child
		{

			if(!parentwindow.equals(windowname))
			{
				driver.switchTo().window(windowname);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                			
				driver.findElement(By.name("btnLogin")).click();			
				driver.close();	
			}

		}

		driver.switchTo().window(parentwindow);
		String text = driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).getText();
		System.out.println(text);
		driver.quit();
	}





	/*String mainWindow=driver.getWindowHandle();

		 Set<String> windowHandles = driver.getWindowHandles();
		    for(String childwindow : windowHandles) {
		        if (!mainWindow.equals(childwindow)) {
		            driver.switchTo().window(childwindow);
		            driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                			
					driver.findElement(By.name("btnLogin")).click();			
					driver.close();		        }
		    }*/


	/*Set<String> set =driver.getWindowHandles();
		Iterator<String> itr= set.iterator();
		while(itr.hasNext())
		{
			String childWindow=itr.next();
			if(!mainWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                			
				driver.findElement(By.name("btnLogin")).click();			
				driver.close();	
			}
		}*/
	/*driver.switchTo().window(mainWindow);
		String text = driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).getText();
		System.out.println(text);
		driver.quit();*/

}
