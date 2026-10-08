package br.com.fiapride.model;

import java.util.ArrayList;
import java.util.List;

public class TesteTenis {

    public static void main(String[] args) {

        // Criando os proprietários
        Dono proprietario = new Dono("Laura");
        Dono professor = new Dono("Professor");

        // Criando os tênis
        Tenis meuTenis = new Tenis("Branco", "Tecido", 37, proprietario);
        Tenis tenisDoProfessor = new Tenis("Preto", "Tecido", 40, professor);

        // Exibindo os dados
        System.out.println(
            "Meu tênis é: " + meuTenis.getCor() +
            " A marca é: " + meuTenis.getMarca() +
            " A numeração é: " + meuTenis.getNumeracao()
        );

        System.out.println(
            "O tênis do professor é: " + tenisDoProfessor.getCor() +
            " A marca é: " + tenisDoProfessor.getMarca() +
            " A numeração é: " + tenisDoProfessor.getNumeracao()
        );

        // Alterando os dados
        meuTenis.setCor("Azul");
        meuTenis.setNumeracao(39);

        System.out.println("\nApós as alterações:");

        System.out.println(
            "Meu tênis é: " + meuTenis.getCor() +
            " A marca é: " + meuTenis.getMarca() +
            " A numeração é: " + meuTenis.getNumeracao()
        );

        // Testando validação
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

        // Testando a associação
        System.out.println("\nTestando a associação");

        System.out.println(
            "O proprietário do meu tênis é: " +
            meuTenis.getProprietario().getNome()
        );

        // Testando a herança - TenisAdulto
        System.out.println("\nTestando TenisAdulto");

        TenisAdulto tenisAdulto = new TenisAdulto(
            "Preto",
            "Nike",
            42,
            proprietario,
            true
        );

        System.out.println(
            "Tênis adulto: " + tenisAdulto.getCor() +
            " Marca: " + tenisAdulto.getMarca() +
            " Numeração: " + tenisAdulto.getNumeracao() +
            " Tem cadarço: " + tenisAdulto.isTemCadarco()
        );

        // Testando a herança - TenisInfantil
        System.out.println("\nTestando TenisInfantil");

        TenisInfantil tenisInfantil = new TenisInfantil(
            "Azul",
            "Adidas",
            32,
            professor,
            true
        );

        System.out.println(
            "Tênis infantil: " + tenisInfantil.getCor() +
            " Marca: " + tenisInfantil.getMarca() +
            " Numeração: " + tenisInfantil.getNumeracao() +
            " Tem velcro: " + tenisInfantil.isTemVelcro()
        );

        // Teste do Polimorfismo 
        // A lista é da superclasse Tenis,
        // mas recebe objetos das subclasses.
        List<Tenis> listaTenis = new ArrayList<>();

        listaTenis.add(tenisAdulto);
        listaTenis.add(tenisInfantil);

        double valorTenis = 200.00;

        for (Tenis tenis : listaTenis) {

            double desconto = tenis.calcularDesconto(valorTenis);
            double valorFinal = valorTenis - desconto;

            System.out.println("\nTipo de tênis: " + tenis.getClass().getSimpleName());
            System.out.println("Marca: " + tenis.getMarca());
            System.out.println("Cor: " + tenis.getCor());
            System.out.println("Numeração: " + tenis.getNumeracao());
            System.out.println("Valor original: R$ " + valorTenis);
            System.out.println("Desconto aplicado: R$ " + desconto);
            System.out.println("Valor final: R$ " + valorFinal);

        }
    }
}