package fida.tests.homepage;

import org.testng.annotations.Test;
import fida.framework.core.BaseTest;
import fida.pageobjects.homepage.GoogleHomepage;

public class GoogleHomepageTests extends BaseTest {

	@Test
	public void homepageTests() {
		GoogleHomepage googleHomepage = new GoogleHomepage(getDriver());
		System.out.println("test successful");
	}
}