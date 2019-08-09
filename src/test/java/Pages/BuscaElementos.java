package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscaElementos {

	static WebDriver driver;

	public BuscaElementos (WebDriver driver) throws InterruptedException {
		BuscaElementos.driver = driver;
		
	}

	public void BuscaLinks () throws InterruptedException {
		
				
		WebElement AbreLink = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		AbreLink.click();
		Thread.sleep(1000);
			
		WebElement Links = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[1]/a"));
		Links.click();
		Thread.sleep(1000);
		
		WebElement Sucess = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/a"));
		Sucess.click();
		Thread.sleep(1000);
		
		WebElement VoltarSucess = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
		VoltarSucess.click();
		Thread.sleep(1000);
		
		WebElement BadRequest = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div[1]/a"));
		BadRequest.click();
		Thread.sleep(1000);
		
		WebElement VoltarBadRequest = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
		VoltarBadRequest.click();
		Thread.sleep(1000);		
		
		WebElement PageNotFound = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/a"));
		PageNotFound.click();
		Thread.sleep(1000);
		
		WebElement VoltarPageNotFound = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
		VoltarPageNotFound.click();
		Thread.sleep(1000);
		
		WebElement ServerError = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div[2]/a"));
		ServerError.click();
		Thread.sleep(1000);
		
		WebElement VoltarServerError = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
		VoltarServerError.click();
		Thread.sleep(1000);
		
		WebElement Imputs = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[2]/a"));
		Imputs.click();
		Thread.sleep(1000);
		
		WebElement PrimeiroNome = driver.findElement(By.id("first_name"));
		PrimeiroNome.sendKeys("Carlos Félix");
		Thread.sleep(1000);
		
		WebElement UltimoNome = driver.findElement(By.id("last_name"));
		UltimoNome.sendKeys("Guillen");
		Thread.sleep(1000);
		
		WebElement SenhaImput = driver.findElement(By.id("password"));
		SenhaImput.sendKeys("Jorge123Senha");
		Thread.sleep(1000);
		
		WebElement EmailImput = driver.findElement(By.id("email"));
		EmailImput.sendKeys("cfelixpenha@yahoo.com.br");
		Thread.sleep(1000);
		
		WebElement TestArea = driver.findElement(By.id("textarea1"));
		TestArea.sendKeys("Teste de imputar dados, validar como quebrar linhas dentro do código.");
		Thread.sleep(2000);
	}

	
}
