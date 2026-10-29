package br.com.fiapride.model;

// A palavra 'extends' faz a mágica da herança acontecer!
public class TenisAdulto extends Tenis implements Vendavel {

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
	    
	    @Override
	    public void exibirTipo() {
	        System.out.println("Tipo: Tênis Adulto");
	    }

		// Interface para objetos DIFERENTES
		@Override
		public void vender(int preco) {
			if (preco < Vendavel.PRECO_MINIMO || preco > Vendavel.PRECO_MAXIMO) {
	            System.out.println("Erro: Preco inválido!");
	            return;
	        }
	        
	        System.out.println("Tenis Adulto " + this.getMarca() + " vender por " + preco + "$");			
		}
}