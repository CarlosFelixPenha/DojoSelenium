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
	static CadastroPages cadastroPages;
	static BuscaElementos buscaElementos;
 	//static Tempo sleep;
 	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	// Dizer onde se encontra o executavél do Chrome
	System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	// Abrindo o Browser
	driver.get("https://automacaocombatista.herokuapp.com/");
	driver.manage() .window() .maximize();
	cadastroPages = new CadastroPages (driver);
	buscaElementos = new BuscaElementos (driver);
	//Sleep sleep = new Sleep (driver);
	
	}

	//@Test
	//public void cadastroUsuario() {
		//cadastroPages.clicarAutomacaoWeb();
		//cadastroPages.preenchercampos();
		//buscaElementos.BuscaLinks();
		
	//}
	
	@Test
	public void buscarLinks() throws InterruptedException {
		//Thread.sleep(1000);		
		cadastroPages.clicarAutomacaoWeb();
		buscaElementos.BuscaLinks();
		
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	// Fechando o Browser
	driver.close();
		
	}

	
}