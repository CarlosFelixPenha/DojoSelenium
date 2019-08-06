package Test;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class CadastroTest {
    // Instanciando a classe WebDriver
	static WebDriver driver;
 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	// Dizer onde se encontra o executavél do Chrome
	System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	// Abrindo o Browser
	driver.get("https://automacaocombatista.herokuapp.com/");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	// Fechando o Browser
	driver.close();
		
	}

	
}