package launchingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKRITI\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println("Source code of google page"+driver.getPageSource());
		System.out.println("URL of the application is"+driver.getCurrentUrl());
		System.out.println("Title of the application is"+driver.getTitle());
		driver.quit();

	}

}
