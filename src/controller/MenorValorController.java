package controller;

public class MenorValorController {

	public MenorValorController() {
		super ();
	}
	public int menorValor(int [] vetor, int tamanho) {
		//Condição de parada ==> Quando o vetor não tiver mais posições
		if (tamanho == 0) {
			return 0;
		} else {
			int ultimaPosicao = tamanho -1;
			//Função deverá retornar a última posição na qual contém o primeiro menor valor da serie
			int valor = vetor[ultimaPosicao];
			tamanho = tamanho - tamanho;
			return valor + menorValor(vetor, tamanho);

		}
	}
}
