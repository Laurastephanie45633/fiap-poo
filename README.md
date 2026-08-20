# FIAPRide

Projeto desenvolvido em Java para a disciplina de Programação Orientada a Objetos (POO).

## Classe Tenis

A classe `Tenis` representa um tênis e possui os seguintes atributos:

* `cor`
* `marca`
* `numeração`

## Métodos adicionados

Foram implementados dois métodos para alterar os dados do tênis:

### `alterarCor()`

Altera a cor do tênis. A nova cor não pode ser vazia ou nula.

### `alterarNumeracao()`

Altera a numeração do tênis. A numeração deve ser maior que zero.

Os dois métodos possuem validações para evitar valores inválidos.

## Testes

Os métodos foram testados no `SistemaPrincipal.java` com valores válidos e inválidos.

Exemplos:

```java
meuTenis.alterarCor("Azul");
meuTenis.alterarNumeracao(39);
```

Também foram testados valores inválidos:

```java
meuTenis.alterarCor("");
meuTenis.alterarNumeracao(-10);
```

Os valores inválidos não alteraram o estado do objeto.
