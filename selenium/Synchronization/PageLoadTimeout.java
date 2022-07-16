package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTimeout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKRITI\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http:/www.rediff.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println("Page title is "+driver.getTitle());
		driver.navigate().to("http:/www.ecotrak.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println("Page title is "+driver.getTitle());
		driver.navigate().back();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().forward();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
	}
}
		
		

