# FIAPRide

## Sobre o projeto

O FIAPRide é um projeto desenvolvido em Java para praticar os conceitos de Programação Orientada a Objetos (POO). Nesta etapa, foi trabalhada a classe `Tenis`, que representa um tênis do mundo real.

## Classe Tenis

A classe `Tenis` possui três atributos que representam características de um tênis:

* `cor`: representa a cor do tênis.
* `marca`: representa a marca ou material informado para o tênis.
* `numeração`: representa o tamanho do tênis.

Um objeto da classe `Tenis` pode representar diferentes tênis, cada um com suas próprias características.

## Métodos

Foram adicionados dois métodos responsáveis por alterar o estado dos objetos da classe `Tenis`.

### alterarCor()

O método `alterarCor(String novaCor)` permite alterar a cor do tênis.

Antes de realizar a alteração, é feita uma validação para garantir que a nova cor não seja nula ou vazia.

Exemplo:

```java
meuTenis.alterarCor("Azul");
```

Nesse caso, a cor do objeto é alterada para `Azul`.

### alterarNumeracao()

O método `alterarNumeracao(double novaNumeracao)` permite alterar a numeração do tênis.

A regra de negócio determina que a nova numeração deve ser maior que zero. Caso seja informado um valor inválido, a alteração não é realizada.

Exemplo:

```java
meuTenis.alterarNumeracao(39);
```

Nesse caso, a numeração do objeto passa a ser `39`.

## Regras de negócio

Os métodos possuem validações para impedir que o objeto receba valores inconsistentes:

* A cor não pode ser `null` ou vazia.
* A numeração deve ser maior que zero.

Essas validações são realizadas por meio de estruturas condicionais `if`.

## Testes

Os métodos foram testados no arquivo `SistemaPrincipal.java` utilizando valores válidos e inválidos.

### Valores válidos

```java
meuTenis.alterarCor("Azul");
meuTenis.alterarNumeracao(39);
```

Os valores foram aceitos e o estado do objeto foi alterado.

### Valores inválidos

```java
meuTenis.alterarCor("");
meuTenis.alterarNumeracao(-10);
```

Os valores foram rejeitados pelas regras de negócio e o objeto manteve os valores válidos anteriores.

Após os testes, o resultado foi:

```text
Meu tênis é: Azul | A marca é: Tecido | A numeração é: 39.0
```

Isso demonstra que os métodos conseguem alterar o estado do objeto quando recebem valores válidos e impedem alterações quando os valores são inválidos.

## UML

O diagrama de classes foi atualizado para incluir os dois novos métodos da classe `Tenis`:

```text
+ alterarCor(novaCor: String): void
+ alterarNumeracao(novaNumeracao: double): void
```

O arquivo do diagrama está disponível na pasta `com/UML/` no formato `.asta`.

## Tecnologias utilizadas

* Java
* Programação Orientada a Objetos
* Astah UML
* Git e GitHub
