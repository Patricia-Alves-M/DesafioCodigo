package pageObjects;

import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;

import org.junit.jupiter.api.Assertions;

public class MicrosoftPage extends BasePage {

	private String subMenuAboutWindows = "//button[contains(.,'About Windows')]";
	private String menuMicrosoft365 = "//li//a[@class='c-uhf-nav-link'][text()='Microsoft 365']";
	private String menuWindows = "//li//a[@class='c-uhf-nav-link'][text()='Windows']";
	private String menuSurface = "//li//a[@class='c-uhf-nav-link'][text()='Surface']";
	private String menuXbox = "//li//a[@class='c-uhf-nav-link'][text()='Xbox']";
	private String menuDeals = "//li//a[@class='c-uhf-nav-link'][text()='Deals']";
	private String menuSmallBusiness = "//li//a[@class='c-uhf-nav-link'][text()='Small Business']";
	private String menuSupport = "//li//a[@class='c-uhf-nav-link'][text()='Support']";
	
	public void clicarMenuWindows() {
		clicar(By.xpath(menuWindows));	
	}
	

	public void clicarSubMenuAboutWindows() {
		clicar(By.xpath(subMenuAboutWindows));			
	}


	public void validarMenusPresentes() {
		esperarElementoFicarVisivel(By.xpath(menuMicrosoft365));
		try {
			Assertions.assertTrue(elementoPresente(By.xpath(menuMicrosoft365)));
			Assertions.assertTrue(elementoPresente(By.xpath(menuWindows)));
			Assertions.assertTrue(elementoPresente(By.xpath(menuSurface)));
			Assertions.assertTrue(elementoPresente(By.xpath(menuXbox)));
			Assertions.assertTrue(elementoPresente(By.xpath(menuDeals)));
			Assertions.assertTrue(elementoPresente(By.xpath(menuSmallBusiness)));
			Assertions.assertTrue(elementoPresente(By.xpath(menuSupport)));
			System.out.println("Achou os elementos do menu!");
			String descMenuMicrosofot365 = DriverFactory.getDriver().findElement(By.xpath(menuMicrosoft365)).getText();
			System.out.println(descMenuMicrosofot365);
			
		} catch (Exception e) {
			System.out.println("Não achou um ou mais elementos de menu!");
		}		
		
	}


	public void imprimeNomeMenu() {
		String descMenuAbout = DriverFactory.getDriver().findElement(By.xpath(subMenuAboutWindows)).getText();
		System.out.println(descMenuAbout);
	}



}
