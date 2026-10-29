package br.com.fiapride.model;

public class TenisInfantil extends Tenis implements Vendavel {

    private boolean temVelcro;

    public TenisInfantil(String cor, String marca, int numeracao, Dono proprietario, boolean temVelcro) {
        super(cor, marca, numeracao, proprietario);
        this.temVelcro = temVelcro;
    }

    public boolean isTemVelcro() {
        return this.temVelcro;
    }
    
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.15;
    }
    
    @Override
    public void exibirTipo() {
        System.out.println("Tipo: Tênis Infantil");
    }

	// Interface para objetos DIFERENTES
	@Override
	public void vender(int preco) {
		if (preco < Vendavel.PRECO_MINIMO || preco > Vendavel.PRECO_MAXIMO) {
            System.out.println("Erro: Preco inválido!");
            return;
        }
        
        System.out.println("Tenis Infantil: " + this.getMarca() + " vender por " + preco + "$");			
	}

}
