package testValidation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.google;
import pageObject.imdb;
import pageObject.wiki;
import setUp.function;

public class testing extends function{
String wikiUrl;
String imdbUrl;
String imdbReleaseDate;
String imdbReleaseCountry;
String wikiReleaseDate;
String wikiReleaseCountry;

	public void googlepage()
	{
		String googleurl = prop.getProperty("googleUrl");
		driver.get(googleurl);
		PageFactory.initElements(driver,google.class);
		google.search.sendKeys(prop.getProperty("movie"));
		google.search.sendKeys(Keys.ENTER);
		 imdbUrl = google.imdbUrl.getAttribute("href");
		 wikiUrl = google.wikiUrl.getAttribute("href");
	}
	public void imdbpage()
	{
		driver.get(imdbUrl);
		PageFactory.initElements(driver,imdb.class);
		imdbReleaseDate = imdb.imdbReleaseDate.getText();
		imdbReleaseCountry = imdb.imdbReleaseCountry.getText();
	}
	public void wikipage()
	{
		driver.get(wikiUrl);
		PageFactory.initElements(driver,wiki.class);
		wikiReleaseCountry = wiki.wikiReleaseCountry.getText();
		wikiReleaseDate = wiki.wikiReleaseDate.getText();
	}
	@Test
	
	public void validation()
	{
		googlepage();
		imdbpage();
		wikipage();
		Assert.assertEquals(imdbReleaseCountry, wikiReleaseCountry);
		Assert.assertNotEquals(imdbReleaseDate,wikiReleaseDate);
	}
}
