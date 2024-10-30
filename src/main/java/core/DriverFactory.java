package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

	private static WebDriver driver;

	static String extension = "";

	private DriverFactory() {

	}

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (Browsers.browser) {
			case CHROME:
				if (System.getProperty("os.name").startsWith("Windows")) {
					extension = ".exe";
					System.setProperty("webdriver.chrome.driver",
							"src/test/resources/drivers/chromedriver" + extension);
					ChromeOptions optionsChrome = new ChromeOptions();
					//optionsChrome.addArguments("start-maximized", "incognito"/*, "--headless"*/); // Abrir o browser sempre maximizado e em modo anonimo
					optionsChrome.addArguments("start-maximized"); // Abrir o browser sempre maximizado e em modo anônimo
					DesiredCapabilities capabilitiesChrome = new DesiredCapabilities();
					capabilitiesChrome.setCapability(ChromeOptions.CAPABILITY, optionsChrome);
					optionsChrome.merge(capabilitiesChrome);
					driver = new ChromeDriver(optionsChrome);
					break;
				}
			case FIREFOX:
				if (System.getProperty("os.name").startsWith("Windows")
						&& System.getProperty("os.arch").equals("amd64")) {
					extension = ".exe";
					System.setProperty("webdriver.gecko.driver",
							"src/test/resources/drivers/geckodriver_x64" + extension);
					driver = new FirefoxDriver();
					break;
				} 
			}
		}
		return driver;
	}


}
