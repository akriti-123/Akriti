package UIelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKRITI\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.id("promtButton")).click();
		Alert alt =driver.switchTo().alert();
		System.out.println("Message displayed in pop up : "+alt.getText());
		alt.sendKeys("Amit");
		Thread.sleep(3000);
		alt.accept();
		driver.switchTo().defaultContent();
			
		}
	}


