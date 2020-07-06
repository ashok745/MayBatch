package pckg1.launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon extends Launch{
	
	public amazon(String url) throws InterruptedException {
		super(url);
	}


	public static void main(String[] args) throws InterruptedException {
	 amazon a =new amazon("https://amazon.in");
	
	}	
}
