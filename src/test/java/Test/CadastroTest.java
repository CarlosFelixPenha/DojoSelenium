package Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.BuscaElementos;
import Pages.CadastroPages;

	public class CadastroTest {
    // Instanciando a classe WebDriver
	static WebDriver driver;
	static CadastroPages cadastropages;
	static BuscaElementos buscaelementos;
 	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	// Dizer onde se encontra o executavél do Chrome
	System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	// Abrindo o Browser
	driver.get("https://automacaocombatista.herokuapp.com/");
	cadastropages = new CadastroPages (driver);
	buscaelementos = new BuscaElementos (driver);
	
	}

	@Test
	public void cadastroUsuario() {
		//cadastropages.clicarAutomacaoWeb();
		cadastropages.preenchercampos();
		//buscaelementos.BuscaLinks();
		
	}
	
	@Test
	public void buscarLinks() {
		//cadastropages.clicarAutomacaoWeb();
		buscaelementos.BuscaLinks();
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	// Fechando o Browser
	//driver.close();
		
	}

	
}