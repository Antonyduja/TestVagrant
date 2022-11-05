package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class imdb {

	@FindBy(xpath="//a[contains(text(), 'Release date')]/following-sibling::div//ul/child::li/a")
	public static WebElement imdbReleaseDate;
	
	@FindBy(xpath="//span[contains(text(), 'Country of origin')]/parent::li/div/child::ul/li/a\r\n")
	public static WebElement imdbReleaseCountry;
	
}
