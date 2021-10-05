package atividades;

import org.junit.Test;

public class Atividade1 {
	@Test
	public void metodoTeste1() {
		System.out.println("Execução do teste 1");
	}
	
	@Test
	public void metodoTeste2() {
		System.out.println("Execução do teste 2");
	}
	
	public void metodoSemTest() {
		System.out.println("Execução sem o @Test");
	}
}
