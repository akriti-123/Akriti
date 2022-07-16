package UIelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKRITI\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		List<WebElement> cb=driver.findElements(By.xpath("//input[@type='radio'])]"));
		int i=1;
		for(WebElement w: cb)
		{
			System.out.println("male "+i+" with title "+w.getAttribute("value")+" is "+w.isSelected());
			w.click();
			System.out.println("After click status of checkbox"+i+" with title "+w.getAttribute("value")+" is "+w.isSelected());
		}
		i++;

	}

}
