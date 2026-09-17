package br.com.fiapride.model;

public class Tenis {

    private String cor;
    private String marca;
    private double numeracao;
    private Dono proprietario;

    // Construtor
    public Tenis(String cor, String marca, double numeracao, Dono proprietario) {
        this.setCor(cor);
        this.setMarca(marca);
        this.setNumeracao(numeracao);
        this.proprietario = proprietario;
    }

    // GET da cor
    public String getCor() {
        return this.cor;
    }

    // SET da cor
    public void setCor(String novaCor) {
        if (novaCor != null && !novaCor.trim().isEmpty()) {
            this.cor = novaCor;
        } else {
            System.out.println("Erro: A cor não pode ser vazia.");
        }
    }

    // GET da marca
    public String getMarca() {
        return this.marca;
    }

    // SET da marca
    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    // GET da numeração
    public double getNumeracao() {
        return this.numeracao;
    }

    // SET da numeração
    public void setNumeracao(double novaNumeracao) {
        if (novaNumeracao > 0) {
            this.numeracao = novaNumeracao;
        } else {
            System.out.println("Erro de Segurança: A numeração deve ser maior que zero.");
        }
    }

    // GET do proprietário
    public Dono getProprietario() {
        return this.proprietario;
    }

    // Métodos da atividade
    public void alterarCor(String novaCor) {
        setCor(novaCor);
    }

    public void alterarNumeracao(double novaNumeracao) {
        setNumeracao(novaNumeracao);
    }
}