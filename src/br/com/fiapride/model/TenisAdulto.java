package br.com.fiapride.model;

// A palavra 'extends' faz a mágica da herança acontecer!
public class TenisAdulto extends Tenis {

	    private boolean temCadarco;

	    public TenisAdulto(String cor, String marca, int numeracao, Dono proprietario, boolean temCadarco) {
	        super(cor, marca, numeracao, proprietario);
	        this.temCadarco = temCadarco;
	    }

	    public boolean isTemCadarco() {
	        return this.temCadarco;
	    }
	    
	    @Override
	    public double calcularDesconto(double valor) {
	        return valor * 0.10;
	    }
	}