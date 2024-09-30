package controller;

import model.estrutura.Pilha;

public class TestePilha {
	
	public void testePilha() {
		Pilha<Object> pilha = new Pilha<>();

		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
			
		System.out.println(pilha.pop().toString());
		System.out.println(pilha.toString());
	}
	
}
