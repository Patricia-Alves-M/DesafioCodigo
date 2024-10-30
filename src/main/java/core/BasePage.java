package core;

import static core.DriverFactory.getDriver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriverWait wait = new WebDriverWait(getDriver(), 10);
	
	
	/********** Clique **********/

	public void clicar(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}
	
	
	/********** Gerar email **********/

	public static String gerarEmailRandomico() {
		int i, vogalAleatoria, consoanteAleatoria;

		String vogal[] = { "a", "e", "i", "o", "u" }, vogalConsoante = "", email = "", consoante[] = { "b", "c", "d",
				"f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "w", "x", "y", "z" };
		Random random = new Random();

		for (i = 0; i <= 8; i++) {
			vogalAleatoria = 0 + random.nextInt(4);
			consoanteAleatoria = 0 + random.nextInt(19);
			vogalConsoante = vogal[vogalAleatoria] + consoante[consoanteAleatoria];
			email = email + vogalConsoante;
		}
		return email + "@emailaleatorio.com";
	}
	
	
	/********** Input **********/

	public void escrever(By by, String text) {
		waitForLoad(getDriver());
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(by)));
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(text);
	}

	
	/********** Espera **********/
	public static void esperarElementoFicarVisivel(By by) throws TimeoutException {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	private void waitForLoad(WebDriver driver) {
		new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	
	/********** ComboBox **********/

	public void selecionarComboBoxIndice(By by, int numIndice) {
		waitForLoad(getDriver());
		Select dropdown = new Select(getDriver().findElement(by));
		dropdown.selectByIndex(numIndice);	
	}
	
	
	/*********** Gera numero automatico ***********/
	public String geraSenha() {
		String numAuto = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME).substring(12, 21).replace(".", "")
				.replace(":", "");
		return numAuto;
	}
	
	
	/********* Fecha Navegador ********/
	public void fecharBrowser() {
		getDriver().quit();
	}


	public void sleep(double d) throws Exception {
		try {
			Thread.sleep((long) (d*1000));
		} catch (Exception e) {
			//registraErro("sleep: " + e.getStackTrace().toString());
			e.printStackTrace();
		};
	}
	
	public boolean elementoPresente(By by) {
		return getDriver().findElement(by).isDisplayed();
	}

}
