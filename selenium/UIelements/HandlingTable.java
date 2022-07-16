package UIelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKRITI\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> colHeadings=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total columns in table are"+colHeadings.size());
		for(WebElement w :colHeadings)
		{
			System.out.println(w.getText());
		}
		

	}

}
