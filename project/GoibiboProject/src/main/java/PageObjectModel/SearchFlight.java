package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlight {
public WebDriver driver;

@FindBy(className = "sc-GEbAx izHSju")
public WebElement roundTripBtn;

@FindBy(className ="sc-fHeRUh jHgPBA")
public WebElement Searchflight;


@FindBy(className = "srp-card-uistyles__BookButton-sc-3flq99-21 jwPCLd dF justifyCenter alignItemsCenter txtUpper")
public WebElement Book;

@FindBy(className = "common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 iRNcHD")
public WebElement Title;

@FindBy(name = "givenname")
public WebElement FirstName;

@FindBy(name = "lastname")
public WebElement LastName;

@FindBy(name = "email")
public WebElement Email1;

@FindBy(className = "common-elementsstyles__IpTxt-sc-ilw4bs-11 kwnYsg width100")
public WebElement MobileNumber;

@FindBy(className = "dweb-commonstyles__FltBtn-sc-13fxsy5-12 ggIRhd fb quicksand wid25 font16")
public WebElement Proceed;

public SearchFlight() {
	PageFactory.initElements(driver, this);
}
//constructor
	public SearchFlight(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//methods
	public void roundtrip()
	{
		roundTripBtn.click();
	}
	public void Search()
	{
		Searchflight.click();
	}
	public void book()
	{
		Book.click();
	}
	public void title(String ms)
	{
		Title.sendKeys(ms);
	}
	public void firstname(String akriti)
	{
		FirstName.sendKeys(akriti);
	}
	public void lastname(String k)
	{
		LastName.sendKeys(k);
	}
	public void email(String xyz)
	{
		Email1.sendKeys(xyz);
	}
	public void mobile(String ab)
	{
		MobileNumber.sendKeys("12");
	}
	public void waitt() {
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 }

	public void proceed()
	{
		Proceed.click();
	}
	
		
}
