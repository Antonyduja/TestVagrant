package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class google {
	
@FindBy(xpath="//input[@title='Search']")
public static WebElement search;

@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")
public static WebElement searchbtn;

@FindBy(xpath="(//a[contains(@href,'imdb.com')])[1]")
public static WebElement imdbUrl;

@FindBy(xpath="(//a[contains(@href,'wikipedia')])[1]")
public static WebElement wikiUrl;

}
