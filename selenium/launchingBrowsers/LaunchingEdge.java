package launchingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKRITI\\selenium\\msedgedriver.exe" );
		WebDriver driver=new EdgeDriver();
		driver.get("http://rediff.com");

	}

}
