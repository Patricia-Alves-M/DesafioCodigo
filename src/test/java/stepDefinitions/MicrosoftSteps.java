package stepDefinitions;

import core.BasePage;
import io.cucumber.java.an.E;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.AcessarSite;
import pageObjects.MicrosoftPage;


public class MicrosoftSteps extends BasePage{
	
	AcessarSite acessoURL = new AcessarSite(); // Instanciando a classe generica para acesso a url 	
	MicrosoftPage microsoft = new MicrosoftPage();
	

	@Dado("que acesso o site Microsoft")
	public void queAcessoOSiteMicrosoft() {
	    acessoURL.acessarMicrosoft();
	}
	
	@Dado("Valide se todos os itens do menu est(.*)o presentes (.*) Microsoft (.*) (.*) Windows (.*) Surface (.*) Xbox (.*) Deals (.*) Small Business (.*) Support")
	public void valideSeTodosOsItensDoMenuEstOPresentesMicrosoftWindowsSurfaceXboxDealsSmallBusinessSupport() {
		microsoft.validarMenusPresentes();	
	}

	@Dado("acesse o Menu Windows")
	public void acesseOMenuWindows() {
		microsoft.clicarMenuWindows();	
	}

	@Dado("acesse o subMenu About Windows")
	public void acesseOSubMenuAboutWindows() {
		microsoft.clicarSubMenuAboutWindows();
	}

	@Dado("imprima os elementos do menu suspenso")
	public void imprimaOsElementosDoMenuSuspenso() {
		microsoft.imprimeNomeMenu();
	}

	@Dado("acesse o menu Pesquisa")
	public void acesseOMenuPesquisa() {
	}

	@Dado("pesquise por Visual Studio")
	public void pesquisePorVisualStudio() {
	}

	@Dado("imprima o pre(.*)o o item selecionado")
	public void imprimaOPreOOItemSelecionado() {
	}

	@Dado("armazene o pre(.*)o")
	public void armazeneOPreO() {
	}

	@Dado("clique no bot(.*)o Obter Assinatura")
	public void cliqueNoBotOObterAssinatura() {
	}

	@Dado("valide se ambos os pre(.*)os N(.*)O s(.*)o os mesmos")
	public void valideSeAmbosOsPreOsNOSOOsMesmos() {
	}

	@Dado("Clique no bot(.*)o Adicionar ao carrinho")
	public void cliqueNoBotOAdicionarAoCarrinho() {
	}

	@Dado("Verifique se todos os (.*) valores de pre(.*)o Individual, Itens, Total s(.*)o os mesmos")
	public void verifiqueSeTodosOsValoresDePreOIndividualItensTotalSOOsMesmos() {
	}

	@Dado("acesse o menu suspenso N de itens")
	public void acesseOMenuSuspensoNDeItens() {
	}

	@Dado("selecione (.*) e valide se o valor total (.*) Pre(.*)o unit(.*)rio multiplicado por (.*)")
	public void selecioneEValideSeOValorTotalPreOUnitRio() {
	}
	
	
}



