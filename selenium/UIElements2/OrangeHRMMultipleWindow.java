package UIElements2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKRITI\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("WIndow handle of the current window is "+driver.getWindowHandle());
		//Clicking on image which opens job search page in new tab
		driver.findElement(By.cssSelector("img.OrangeHRM on Facebook")).click();
		//using window Handles
		Set<String> winIds=driver.getWindowHandles();
		Iterator<String> itr= winIds.iterator();
		String win1=itr.next();
		String win2=itr.next();
		//To switch to the new window job search tab
				driver.switchTo().window(win2);
				System.out.println("Title of the pge is "+driver.getTitle());
				driver.findElement(By.name("email")).sendKeys("Akriti");
				//driver.findElement(By.pass("fat")).click();
				Thread.sleep(3000);
				//To switch the first tab again
				driver.switchTo().window(win1);
				System.out.println("Title of the pge is "+driver.getTitle());
				driver.findElement(By.name("submit")).click();
				driver.quit();

	}

}
