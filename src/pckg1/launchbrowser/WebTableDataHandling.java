package pckg1.launchbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDataHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		driver.switchTo().defaultContent();

		List<WebElement> col = driver.findElements(By.xpath("//table[@class='dataTable']//tr/th"));
		int c = col.size();
		for (int i = 0; i < c; i++) 
		{
			String coltext = col.get(i).getText();
			System.out.print(coltext  +"   ");
		}
		System.out.println();

		for(int j=1;j<=5;j++)
		{
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']//tr/td["+j+"]"));
		int r =row.size();
		System.out.println(r);
		for(int i=0;i<r;i++)
		{
			String rowtext = row.get(i).getText();
			System.out.print(rowtext   +"  ");
		}
		}


		WebElement currentprice = driver.findElement(By.xpath("//table[@class='dataTable']//tr[7]/td[4]"));
		System.out.println(currentprice.getText());

		for (int i = 0; i < args.length; i++) {

		}


	}

}
