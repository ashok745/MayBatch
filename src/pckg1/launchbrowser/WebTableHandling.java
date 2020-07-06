package pckg1.launchbrowser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableHandling {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.switchTo().frame("flow_close_btn_iframe");
		System.out.println("imp wait done");


		Wait wait = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(TimeoutException.class);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='closeBtn']")));
		//driver.findElement(By.xpath("//div[@id='closeBtns']")).click();


		WebDriverWait wait1 = new WebDriverWait(driver,30);
		try{wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='closeBtn']")));
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();}
		catch(Exception e) { System.out.println("exception");}

		//System.out.println("imp wait done");
		driver.switchTo().defaultContent();
		//System.out.println("imp wait done");
		//driver.quit();

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("sheet001");

		List<WebElement> coll = driver.findElements(By.xpath("//table[@class='dataTable']//tr/th"));

		/*for (int i = 0; i <coll.size(); i++) {
			System.out.println(coll.get(i).getText());


		}*/
		List<WebElement> row = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody//tr/td[1]"));
		System.out.println(row.size());

		List<WebElement> all = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody//tr/td"));
		System.out.println(all.size());

		for (int i = 1; i <= row.size(); i++) {
			XSSFRow row1 = sheet.createRow((i-1));

			for (int j = 1; j <= coll.size(); j++) {
				WebElement element = driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody//tr["+i+"]/td["+j+"]"));

				String text = element.getText();

				XSSFCell createCell = row1.createCell((j-1));
				createCell.setCellValue( (String) text);
			}
		}

		FileOutputStream op = new FileOutputStream("./data/webhandling01.xlsx");
		wb.write(op);
		op.close();
	}
}
