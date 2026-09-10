package br.com.fiapride.model;

public class TesteTenis {

    public static void main(String[] args) {

        // Criando meu tênis
        Tenis meuTenis = new Tenis("Branco", "Tecido", 37);

        // Criando o tênis do professor
        Tenis tenisDoProfessor = new Tenis("Preto", "Tecido", 40);

        // Mostrando os dados usando GETTERS
        System.out.println(
            "Meu tênis é: " + meuTenis.getCor() +
            " | A marca é: " + meuTenis.getMarca() +
            " | A numeração é: " + meuTenis.getNumeracao()
        );

        System.out.println(
            "O tênis do professor é: " + tenisDoProfessor.getCor() +
            " | A marca é: " + tenisDoProfessor.getMarca() +
            " | A numeração é: " + tenisDoProfessor.getNumeracao()
        );

        // Alterações usando SETTERS
        meuTenis.setCor("Azul");
        meuTenis.setNumeracao(39);

        System.out.println("\nApós as alterações:");

        System.out.println(
            "Meu tênis é: " + meuTenis.getCor() +
            " | A marca é: " + meuTenis.getMarca() +
            " | A numeração é: " + meuTenis.getNumeracao()
        );

        // TESTANDO A PROTEÇÃO
        System.out.println("\n--- Testando a proteção ---");

        System.out.println("Tentando colocar numeração -10...");
        meuTenis.setNumeracao(-10);

        System.out.println(
            "Numeração atual do meu tênis: " + meuTenis.getNumeracao()
        );

        System.out.println("\nTentando colocar uma cor vazia...");
        meuTenis.setCor("");

        System.out.println(
            "Cor atual do meu tênis: " + meuTenis.getCor()
        );
    }
}