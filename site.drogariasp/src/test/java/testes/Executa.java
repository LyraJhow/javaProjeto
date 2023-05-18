package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;

public class Executa {
	
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();
	
	@Before
	public void iniciarTeste1  () {
		metodos.abrirNavegador("https://www.drogariasaopaulo.com.br", "Abrindo o site");
	}
	@Test
	public void cenario1 () {
		metodos.clicar(el.el1, "cenario 1");
		metodos.verificarTitle("Ofertas da Revista | Drogaria São Paulo", "TITLE CENARIO 1");
		metodos.tirarPrint("Evidencia cenario 1");
									
	}
	@Test
	public void cenario2 () {
		metodos.clicar(el.el2, "cenario 2");
		metodos.verificarTitle("Vacina da Gripe: Saiba mais e Faça agora | Drogaria São Paulo", "TITLE CENARIO 2");
		metodos.tirarPrint("Evidencia cenario 2");
	}
	@Test
	public void cenario3 () {
		metodos.clicar(el.el3, "cenario 3");
		metodos.verificarTitle("Assinatura – Drogaria Sao Paulo", "TITLE CENARIO 3");
		metodos.tirarPrint("Evidencia cenario 3");
	}
	@Test
	public void cenario4 () {
		metodos.clicar(el.el4, "cenario 4");
		metodos.verificarTitle("Propria Marca – Drogaria Sao Paulo", "TITLE CENARIO 4");
		metodos.tirarPrint("Evidencia cenario 4");
	}
	@Test
	public void cenario5 () {
		metodos.clicar(el.el5, "cenario 5");
		metodos.verificarTitle("Vitrine Direta cupom20", "TITLE CENARIO 5");
		metodos.tirarPrint("Evidencia cenario 5");

	}
	@Test
	public void cenario6 () {
		metodos.clicar(el.el6, "cenario 6");
		metodos.verificarTitle("Teste Covid-19 na farmácia: agende seu teste rápido! | Drogarias Pacheco", "TITLE CENARIO 6");
		metodos.tirarPrint("Evidencia cenario 6");

	}
	@Test
	public void cenario7 () {
		metodos.clicar(el.el7, "cenario 7");
		metodos.verificarTitle("Produtos Mamãe e Bebê | Drogaria São Paulo", "TITLE CENARIO 7");
		metodos.tirarPrint("Evidencia cenario 7");

	}
	@Test
	public void cenario8 () {
		metodos.clicar(el.el8, "cenario 8");
		metodos.verificarTitle("Rexona em Promoção - Drogaria São Paulo", "TITLE CENARIO 8");
		metodos.tirarPrint("Evidencia cenario 8");

	}
	@Test
	public void cenario9 () {
		metodos.clicar(el.el9, "cenario 9");
		metodos.verificarTitle("Nova indicator Black", "TITLE CENARIO 9");
		metodos.tirarPrint("Evidencia cenario 9");

	}
	@Test
	public void cenario10 () {
		metodos.clicar(el.el10, "cenario 10");
		metodos.verificarTitle("Dove em Promoção - Drogaria São Paulo", "TITLE CENARIO 10");
		metodos.tirarPrint("Evidencia cenario 10");

	}
	@Test
	public void cenario11 () {
		metodos.clicar(el.el11, "cenario 11");
		metodos.tirarPrint("Evidencia cenario 11");
		
		
	}
	
	@After
	public void encerrarTeste () {
		metodos.fecharNavegador();
	}
}
