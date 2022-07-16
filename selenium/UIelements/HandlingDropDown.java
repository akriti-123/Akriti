package UIelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKRITI\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms09.htm");
		WebElement choices=driver.findElement(By.name("mydropdown"));
		Select mydropdown new Select(choices);
		System.out.println("Default selected option is "+mydropdown.getFirstSelectedOption().getT
		mydropdown.selectByVisibleText("Hot Bread");
		System.out.println("Currently selected option is "+mydropdown.getFirstSelectedOption()
		List<WebElement> allOptions=mydropdown.getOptions();
		System.out.println("All available options are...");
		for(WebElement w : allOptions)
		{
			System.out.println(w.getText());
		}
		
		

	}

}
