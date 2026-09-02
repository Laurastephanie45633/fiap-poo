package br.com.fiapride.model;

public class Tenis {

    public String cor;
    public String marca;
    public double numeração;

    public void alterarCor(String novaCor) {
        if (novaCor != null && !novaCor.trim().isEmpty()) {
            this.cor = novaCor;
        }
    }

    public void alterarNumeracao(double novaNumeracao) {
        if (novaNumeracao > 0) {
            this.numeração = novaNumeracao;
        }
    }
}