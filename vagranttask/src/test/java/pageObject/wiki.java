package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class wiki {
	
	@FindBy(xpath="//table//th//div[contains(text(),'Release date')]/ancestor::tr//td//div//ul//li\r\n")
	public static WebElement wikiReleaseDate;
	
	@FindBy(xpath="//table//th[contains(text(),'Country')]/parent::tr//td")
	public static WebElement wikiReleaseCountry;
  
}
