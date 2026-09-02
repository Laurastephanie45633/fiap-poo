package br.com.fiapride.model;


public class SistemaPrincipal {

    public static void main(String[] args) {

        Tenis meuTenis = new Tenis();
        meuTenis.cor = "Branco";
        meuTenis.marca = "Tecido";
        meuTenis.numeração = 37;

        Tenis tenisDoProfessor = new Tenis();
        tenisDoProfessor.cor = "Preto";
        tenisDoProfessor.marca = "Tecido";
        tenisDoProfessor.numeração = 40;

        System.out.println(
            "Meu tênis é: " + meuTenis.cor +
            " | A marca é: " + meuTenis.marca +
            " | A numeração é: " + meuTenis.numeração
        );

        System.out.println(
            "O tênis do professor é: " + tenisDoProfessor.cor +
            " | A marca é: " + tenisDoProfessor.marca +
            " | A numeração é: " + tenisDoProfessor.numeração
        );

        meuTenis.alterarCor("Azul");
        meuTenis.alterarNumeracao(39);

        meuTenis.alterarCor("");
        meuTenis.alterarNumeracao(-10);

        System.out.println("\nApós as alterações:");

        System.out.println(
            "Meu tênis é: " + meuTenis.cor +
            " | A marca é: " + meuTenis.marca +
            " | A numeração é: " + meuTenis.numeração
        );
    }
}