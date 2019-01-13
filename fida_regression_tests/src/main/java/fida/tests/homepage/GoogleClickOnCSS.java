package fida.tests.homepage;

import org.testng.annotations.Test;
import fida.framework.core.BaseTest;
import fida.pageobjects.homepage.GoogleHomepage;
import org.openqa.selenium.*;

public class GoogleClickOnCSS extends BaseTest {

	@Test
	public void clickOnCss(String locator){
		driver.findElement(By.cssSelector(locator)).click();
	}

}
