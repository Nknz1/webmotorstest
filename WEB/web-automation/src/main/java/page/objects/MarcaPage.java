package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import data.utils.toolboxSelenium;

public class MarcaPage extends AbstractPageObject {

	public static MarcaPage Action() {
		return new MarcaPage();
	}

	@FindBy(xpath = "//a[@title='honda']")
	public WebElement MarcaHonda;

	@FindBy(xpath = "//div[@text()='Ver todas as marcas']")
	public WebElement ButtonVerTodasAsMarcas;

	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[5]/div[2]/div[2]/div[2]")
	public WebElement buttonTodosOsModelos;

	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[5]/div[2]/div[2]/div[3]")
	public WebElement buttonTodasVersao;

	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div[2]/div/div[4]/div/div[4]/div/input")
	public WebElement InputSearch;

	@FindBy(xpath = "/html/body/div[1]/main/div[1]/div[2]/div/div[4]/div/div[5]/a")
	public WebElement resultSearch;

	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div[2]/div/div[3]/div/div[5]/a[2]")
	public WebElement resultSearchModelo;

	@FindBy(xpath = "//a[@text()='1.5 EX 16V FLEX 4P AUTOMÁTICO']")
	public WebElement inputVersao;

	@FindBy(xpath = "/html/body/div[1]/main/div[1]/div[3]/h1")
	public WebElement titleSearch;

	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div[3]/div[2]/div/div[1]/div/div[1]/div/div[2]/a[1]/div[3]/h2")
	public WebElement firstCarResult;

}
