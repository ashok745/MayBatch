package pckg1.launchbrowser;

import java.io.IOException;

public class excelhandling extends Launch {

	
	
	public excelhandling(String baseurl) throws InterruptedException {
		super(baseurl);
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		excelhandling f = new excelhandling("https://fb.com");
		screenshot.sshot(driver);
		System.out.println("hi excel handling function gonna start");
	}

}
