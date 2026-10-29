package br.com.fiapride.model;

// Interface para objetos DIFERENTES
public interface Vendavel {
	
	void vender(int preco);
	
	int PRECO_MINIMO =  100;
	int PRECO_MAXIMO = Integer.MAX_VALUE;
}
