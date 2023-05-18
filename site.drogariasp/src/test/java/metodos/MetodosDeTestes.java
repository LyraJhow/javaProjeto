package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MetodosDeTestes extends DriversFactory{
	
	public void abrirNavegador(String site,String passo) {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.err.println("***************Erro ao abrir navegador************");
			System.err.println("**************Erro no passo "+ passo);
		}
	}
	public void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("***************Erro ao clicar no elemento************");
			System.err.println("**************Erro no passo "+ passo);
		}
	}
	public void verificarTitle (String titleDesejado, String passo) {
		try {
			String titleCapturado = driver.getTitle();
			assertEquals(titleDesejado, titleCapturado);
		} catch (Exception e) {
			System.err.println("***************Erro na url************");
			System.err.println("**************Erro no passo "+ passo);
		}
				
	}
	
	public void tirarPrint(String nomeEvidencia) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("./evidencia/" + nomeEvidencia + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
			e.getCause();
		}
	}
		
	public void fecharNavegador () {
		driver.quit();
	}

}
