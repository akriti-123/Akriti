package goibibo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectModel.SearchFlight;

public class SearchSteps {
	public WebDriver driver;
	public SearchFlight obj;
	
	@BeforeMethod
	public void beftest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKRITI\\selenium\\chromedriver.exe");
	 	driver=new ChromeDriver();
    	driver.get("https://www.goibibo.com/");
    	driver.manage().window().maximize();
    	obj=new SearchFlight(driver);
	}
	@Test
	public void test() throws InterruptedException
	{
		obj.wait();
		obj.roundtrip();
		obj.wait();
		obj.Search();
		Thread.sleep(5000);
		obj.book();
		Thread.sleep(10000);
		obj.firstname("Akriti");
		Thread.sleep(10000);
		obj.lastname("gupta");
		Thread.sleep(10000);
		obj.email("xyz@gmail.com");
		Thread.sleep(10000);
		obj.mobile("8579955651");
		Thread.sleep(10000);
		obj.proceed();	
		Thread.sleep(10000);
		obj.wait();
	}

	
	@AfterMethod
	public void aftmethod() {
		driver.close();
	}
	@AfterTest
	public void aftTest()
	{
		System.out.println("Done..");
	}
}
