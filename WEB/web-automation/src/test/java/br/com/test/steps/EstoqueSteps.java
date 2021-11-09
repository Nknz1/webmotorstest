package br.com.test.steps;

import static br.com.test.driver.DriverManager.getDriver;
import static org.testng.Assert.assertEquals;

import data.utils.toolboxSelenium;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import page.objects.EstoquePage;
import page.objects.MarcaPage;

public class EstoqueSteps extends toolboxSelenium {

	@Dado("pesquisar por {string} no filtro de Marcas")
	public void pesquisar_por_no_filtro_de_marcas(String marca) {
		click(MarcaPage.Action().ButtonVerTodasAsMarcas);
		fillText(MarcaPage.Action().InputSearch, marca);
		click(MarcaPage.Action().resultSearch);
	}
	@Dado("pesquisar por {string} no filtro de Modelos")
	public void pesquisar_por_no_filtro_de_modelos(String modelo) {
		click(MarcaPage.Action().buttonTodosOsModelos);
		click(MarcaPage.Action().resultSearch);
	}
	@Quando("abrir os detalhes do primeiro veiculo nos resultados de pesquisa")
	public void abrir_os_detalhes_do_primeiro_veiculo_nos_resultados_de_pesquisa() {
		click(EstoquePage.Action().firstCarStoque);
	}
	@Quando("clicar para ver todos os carros do vendedor")
	public void clicar_para_ver_todos_os_carros_do_vendedor() {
	    click(EstoquePage.Action().buttonVerTodosVeiculos);
	}
	@Entao("retornar para a tela de resultados de pesquisa somente com os carros do vendedor")
	public void retornar_para_a_tela_de_resultados_de_pesquisa_somente_com_os_carros_do_vendedor() {
		
	}


}
