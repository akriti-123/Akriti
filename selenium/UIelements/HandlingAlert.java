package UIelements;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKRITI\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String expErrtxt="Please enter your password";
		//entering username
		driver.findElement(By.id("login1")).sendKeys("user1");
		//clicking sign in
		driver.findElement(By.name("proceed")).click();
		//creating Alert ref for the popup
		Alert alt =driver.switchTo().alert();
		String errTxt=alt.getText();
		if(errTxt.equalsIgnoreCase(expErrtxt))
		{
			System.out.println("Actual error message is matching with error message");
		}
		else
		{
			System.out.println("Actual error message is not matching with error message");
		}
		Thread.sleep(3000);
		alt.accept();
		driver.switchTo().defaultContent();
			
		}
	}


