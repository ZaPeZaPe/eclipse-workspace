package atividades;

import org.junit.Test;

public class Atividade1 {
	@Test
	public void metodoTeste1() {
		System.out.println("Execu��o do teste 1");
	}
	
	@Test
	public void metodoTeste2() {
		System.out.println("Execu��o do teste 2");
	}
	
	public void metodoSemTest() {
		System.out.println("Execu��o sem o @Test");
	}
}
