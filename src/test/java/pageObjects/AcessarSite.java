package pageObjects;

import core.BasePage;
import core.DriverFactory;

public class AcessarSite extends BasePage {

	private static String SITE = "https://www.microsoft.com/en-us/";
	

	public void acessarMicrosoft() {
		DriverFactory.getDriver().get(SITE);
	}
	

}
