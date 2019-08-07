package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscaElementos {

	static WebDriver driver;

	public BuscaElementos (WebDriver driver) {
		BuscaElementos.driver = driver;
				
	}
	
	public void BuscaLinks () {
		
		WebElement BotaoEntra = driver.findElement(By.xpath ("//*[@id=\"index-banner\"]/div/div[3]/a"));
		BotaoEntra.click();
		
		WebElement AbreLink = driver.findElement(By.className ("collapsible-header waves-teal"));
		AbreLink.click();
			
		//WebElement CriarUsuario = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a"));
		//CriarUsuario.click();
		
		//WebElement Nome = driver.findElement(By.id("user_name"));
		//Nome.sendKeys("Carlos Félix");
		
		//WebElement UltimoNome = driver.findElement(By.id("user_lastname"));
		//UltimoNome.sendKeys("Guillen");
		
		//WebElement Email = driver.findElement(By.id("user_email"));
		//Email.sendKeys("cfelixpenha@yahoo.com.br");
		
		//WebElement Endereco = driver.findElement(By.id("user_address"));
		//Endereco.sendKeys("Alameda dos Paiaguas N:1001 - São Paulo");
		
		//WebElement Universidade = driver.findElement(By.id("user_university"));
		//Universidade.sendKeys("Universidade Federal do Mato Grosso do Sul");
		
		//WebElement Profissao = driver.findElement(By.id("user_profile"));
		//Profissao.sendKeys("Quality Assurance");
		
		//WebElement Genero = driver.findElement(By.id("user_gender"));
		//Genero.sendKeys("Masculino");
		
		//WebElement Idade = driver.findElement(By.id("user_age"));
		//Idade.sendKeys("48");
		
		//WebElement BotaoCriar = driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/div/div/input"));
		//BotaoCriar.click();

		
	}
	
}
