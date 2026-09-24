package br.com.fiapride.model;


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
	        " | A marca é: " + meuTenis.getMarca() +
	        " | A numeração é: " + meuTenis.getNumeracao()
	    );

	    System.out.println(
	        "O tênis do professor é: " + tenisDoProfessor.getCor() +
	        " | A marca é: " + tenisDoProfessor.getMarca() +
	        " | A numeração é: " + tenisDoProfessor.getNumeracao()
	    );

	    // Alterando os dados
	    meuTenis.setCor("Azul");
	    meuTenis.setNumeracao(39);

	    System.out.println("\nApós as alterações:");

	    System.out.println(
	        "Meu tênis é: " + meuTenis.getCor() +
	        " | A marca é: " + meuTenis.getMarca() +
	        " | A numeração é: " + meuTenis.getNumeracao()
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
	    System.out.println("\n--- Testando a associação ---");

	    System.out.println(
	        "O proprietário do meu tênis é: " +
	        meuTenis.getProprietario().getNome()
	    );

	    // Testando a herança - TenisAdulto
	    System.out.println("\n--- Testando TenisAdulto ---");

	    TenisAdulto tenisAdulto = new TenisAdulto(
	        "Preto",
	        "Nike",
	        42,
	        proprietario,
	        true
	    );

	    System.out.println(
	        "Tênis adulto: " + tenisAdulto.getCor() +
	        " | Marca: " + tenisAdulto.getMarca() +
	        " | Numeração: " + tenisAdulto.getNumeracao() +
	        " | Tem cadarço: " + tenisAdulto.isTemCadarco()
	    );

	    // Testando a herança - TenisInfantil
	    System.out.println("\n--- Testando TenisInfantil ---");

	    TenisInfantil tenisInfantil = new TenisInfantil(
	        "Azul",
	        "Adidas",
	        32,
	        professor,
	        true
	    );

	    System.out.println(
	        "Tênis infantil: " + tenisInfantil.getCor() +
	        " | Marca: " + tenisInfantil.getMarca() +
	        " | Numeração: " + tenisInfantil.getNumeracao() +
	        " | Tem velcro: " + tenisInfantil.isTemVelcro()
	    );
	}
    }
