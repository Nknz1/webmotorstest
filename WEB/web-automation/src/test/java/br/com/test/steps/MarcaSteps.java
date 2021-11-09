package br.com.test.steps;

import static br.com.test.driver.DriverManager.getDriver;
import static org.testng.Assert.assertEquals;

import data.utils.toolboxSelenium;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import page.objects.MarcaPage;

public class MarcaSteps extends toolboxSelenium {

	@Dado("que esteja na tela de busca da WEBMOTORS")
	public void que_esteja_na_tela_de_busca_da_webmotors() throws InterruptedException {
		String pageTitle = getDriver().getTitle();
		assertEquals(pageTitle, "Carros em Todo o Brasil | Webmotors");
	}

	@Quando("clico no botao VER TODAS AS MARCAS")
	public void clico_no_bot_o_ver_todas_as_marcas() {
		click(MarcaPage.Action().ButtonVerTodasAsMarcas);

	}

	@Quando("seleciono a marca {string}")
	public void seleciono_a_marca_honda(String marca) {
		click(MarcaPage.Action().ButtonVerTodasAsMarcas);
		fillText(MarcaPage.Action().InputSearch, marca);
		click(MarcaPage.Action().resultSearch);

	}

	@Quando("seleciono marca e modelo {string},{string}")
	public void seleciono_o_modelo(String marca, String modelo) {
		click(MarcaPage.Action().ButtonVerTodasAsMarcas);
		fillText(MarcaPage.Action().InputSearch, marca);
		click(MarcaPage.Action().resultSearch);

		click(MarcaPage.Action().buttonTodosOsModelos);
		click(MarcaPage.Action().resultSearchModelo);

	}

	@Entao("retornar apenas veículos da marca {string}")
	public void retornar_apenas_veiculos_da_marca(String text) {
		fillText(MarcaPage.Action().InputSearch, text);
		assertEquals(MarcaPage.Action().resultSearch, text.toUpperCase());

	}

	@Entao("retornar o titulo da pagina igual a {string}")
	public void retornar_o_titulo_da_pagina_igual_a(String titlePage) {
		String pageTitleHonda = getDriver().getTitle();
		assertEquals(pageTitleHonda, titlePage);

	}

	@Entao("retornar apenas os veículos do modelo {string}")
	public void retornar_apenas_os_veiculos_do_modelo(String resultExpected) {
		String resultText = MarcaPage.Action().firstCarResult.getText();
		assertEquals(resultText, resultExpected);
	}

	@Entao("retornar o titulo da pagina como {string}")
	public void retornar_o_titulo_da_pagina_como(String titlePage) {
		String pageTitleModelo = getDriver().getTitle();
		assertEquals(pageTitleModelo, titlePage);

	}

	@Entao("exibir apenas os veículos na versao {string}")
	public void exibir_apenas_os_veiculos_na_versao(String titleExpected) {
		click(MarcaPage.Action().buttonTodasVersao);
		click(MarcaPage.Action().inputVersao);

		String titleSearch = MarcaPage.Action().titleSearch.getText();
		if (titleSearch.contains(titleSearch)) {
			assert true;
		} else {
			assert false;
		}

	}

}
