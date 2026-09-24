package br.com.fiapride.model;

public class TenisInfantil extends Tenis {

    private boolean temVelcro;

    public TenisInfantil(String cor, String marca, int numeracao, Dono proprietario, boolean temVelcro) {
        super(cor, marca, numeracao, proprietario);
        this.temVelcro = temVelcro;
    }

    public boolean isTemVelcro() {
        return this.temVelcro;
    }
}
