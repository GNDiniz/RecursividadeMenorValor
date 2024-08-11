package view;

import controller.MenorValorController;

public class Principal {

	public static void main(String[] args) {
		
		int[] vetor = {80, 155, 244, 322, 75, 22, 13};
		int tamanho = vetor.length;
		
		MenorValorController mvc = new MenorValorController();
		int menorValor = mvc.menorValor(vetor, tamanho);
		System.out.println("O menor valor do vetor é igual a: "+menorValor);
	}
}
