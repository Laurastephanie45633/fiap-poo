# Projeto FiapRide - Laura Stephanie Vasquez Oliveira
## Informações do Aluno
- **Nome:** Laura Stephanie Vasquez Oliveira
- **RM:** 567277
- **Turma:** 2CCPB
- **Curso:** Ciência da Computação
- **GitHub:** Laurastephanie45633

## Descrição do Projeto
Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde
desenvolvemos um sistema de mobilidade urbana que permite organizar passageiros, veículos e viagens. 
Durante o desenvolvimento, são trabalhados conceitos como classes e objetos, métodos, encapsulamento, 
construtores, associação, herança, polimorfismo, classes abstratas e interfaces. O objetivo é desenvolver 
um código organizado, reutilizável, seguro e de fácil manutenção, simulando situações que poderiam ocorrer 
em uma aplicação real de transporte.

## Checklist de Implementação
- [✓] Aula 1 - Classes e Objetos
- [✓] Aula 2 - Métodos
- [✓] Aula 3 - Encapsulamento
- [✓] Aula 4 - Construtores
- [✓] Aula 5 - Associação
- [✓] Aula 6 - Herança
- [✓] Aula 7 - Polimorfismo
- [✓] Aula 8 - Classes Abstratas
- [✓] Aula 9 - Interfaces

## Perguntas de Reflexão
### Aula 1 - Classes e Objetos
**Pergunta:** "**Pergunta:** Por que precisamos criar uma classe `Passageiro`? Não seria mais fá
cil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 5
0.0`?
**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?"
**Sua Resposta:**

Criar a classe Passageiro facilita a organização das informações de cada usuário, pois podemos reunir atributos como nome e saldo em uma única estrutura. Se utilizássemos variáveis soltas, o código ficaria muito grande e difícil de manter conforme a quantidade de passageiros aumentasse. Com a orientação a objetos, podemos criar vários objetos a partir da mesma classe, cada um com seus próprios dados. Isso evita a repetição de código e facilita a inclusão de novas funcionalidades. Mesmo que o sistema tenha um milhão de usuários, a classe permite manter um padrão para representar cada passageiro. Dessa forma, o código fica mais organizado, reutilizável e fácil de evoluir.

### Aula 2 - Métodos
**Pergunta:** "Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo \+ 100` di
retamente no código principal, por que dá tanto trabalho criar um método específico chamado `adi
cionarSaldo\(valor\)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade
se deixássemos qualquer programador alterar o saldo diretamente?"
**Sua Resposta:**

Criar um método específico para adicionar saldo permite controlar como o dinheiro dos passageiros é alterado. Se qualquer parte do programa pudesse modificar o saldo diretamente, um programador poderia inserir valores negativos, realizar alterações incorretas ou comprometer os registros financeiros. Com o método adicionarSaldo(valor), podemos validar o valor recebido antes de atualizar o saldo. Também podemos impedir operações inválidas e centralizar as regras de negócio em um único lugar. Isso facilita a manutenção, porque qualquer mudança na regra de atualização precisa ser feita apenas no método responsável. Em um sistema de mobilidade, esse cuidado é importante para evitar inconsistências financeiras e aumentar a confiabilidade da aplicação.

### Aula 3 - Encapsulamento
**Pergunta:** "No nosso código, os atributos são `private`, mas os métodos `getSaldo\(\)` e `get
Nome\(\)` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo
original público?
Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o docum
ento ORIGINAL para a pessoa rasurar? "
**Sua Resposta:**

O encapsulamento permite proteger os dados internos de uma classe, utilizando o modificador private para impedir o acesso direto aos atributos. Os métodos getSaldo() e getNome() podem ser públicos porque permitem consultar as informações sem necessariamente dar permissão para modificá-las. É como entregar uma cópia de um documento para alguém consultar, sem permitir que essa pessoa altere o original. Se os atributos fossem públicos, qualquer parte do programa poderia modificar os valores sem respeitar as regras estabelecidas. Dessa forma, manter os atributos privados e disponibilizar métodos públicos controlados ajuda a preservar a integridade dos dados e torna o sistema mais seguro e previsível.

### Aula 4 - Construtores
**Pergunta:** "> "Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito impo
rtantes:
>
> 1. Nós **não** criamos o método `setModelo\(\)`.
> 2. O `setPlaca\(\)` foi criado como **privado**, e criamos um método público chamado `atualiza
rPlaca\(\)` para acessá-lo.
>
> Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters
e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o s
istema de fraudes e falhas de lógica?"
_Dica: Pense sobre o que pode ou não mudar fisicamente em um carro, e a diferença entre "alterar
um dado no banco" e "executar um processo real no Detran"_"
**Sua Resposta:**

Criar getters e setters para todos os atributos sem analisar sua necessidade pode permitir alterações que não fazem sentido para as regras do sistema. No caso da classe Veiculo, não disponibilizar um método setModelo() impede que o modelo seja alterado livremente depois da criação do objeto, caso essa seja a regra definida pelo projeto. Já deixar setPlaca() privado e disponibilizar atualizarPlaca() permite controlar a mudança da placa por meio de um método específico. Esse método pode verificar se a nova placa é válida e se a alteração atende às regras estabelecidas. No mundo real, mudar uma placa não é apenas modificar um texto no banco de dados, pois pode exigir procedimentos oficiais. Assim, o código representa melhor as regras do negócio e evita alterações indevidas. Isso demonstra que os métodos devem existir para atender a uma necessidade real, e não apenas por convenção.

### Aula 5 - Associação
**Pergunta:** ""No construtor da `Viagem`, nós exigimos o objeto inteiro \(`Passageiro solicitan
te`\). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve
pedir apenas a String do nome no construtor da Viagem \(`String nomeDoPassageiro`\) em vez do ob
jeto todo?"
_Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa desc
ontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro del
a? _"
**Sua Resposta:**

Receber um objeto Passageiro no construtor da classe Viagem é mais adequado porque a viagem precisa se relacionar com o passageiro real, e não somente com seu nome. Uma String permite identificar textualmente uma pessoa, mas não oferece acesso ao seu saldo nem aos métodos responsáveis por realizar operações sobre seus dados. Ao receber o objeto completo, a viagem mantém uma associação com o passageiro e pode utilizar suas funcionalidades de acordo com as regras do sistema. Por exemplo, ao finalizar uma corrida, o sistema pode consultar o saldo e realizar a cobrança correspondente. Além disso, essa associação evita depender apenas de nomes, que podem se repetir. Dessa maneira, as classes trabalham em conjunto e mantêm as responsabilidades bem definidas.

### Aula 6 - Herança
**Pergunta:** ""No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `pr
ivate`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de
`Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super\(\)` ou o `setPl
aca\(\)`.
Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princí
pio das aulas passadas que isso está protegendo?""
**Sua Resposta:**

A classe Carro não pode acessar diretamente os atributos privados da classe Veiculo porque o modificador private restringe o acesso ao próprio corpo da classe em que os atributos foram declarados. Embora Carro herde características de Veiculo, isso não significa que possa modificar livremente seus dados privados. Essa restrição protege o encapsulamento, que busca preservar a integridade dos atributos e controlar como eles são utilizados. Para inicializar ou modificar esses dados, a classe filha deve utilizar os construtores apropriados, como super(), ou métodos disponibilizados pela classe mãe, respeitando suas regras de acesso. Isso evita alterações indevidas e garante que a hierarquia de classes funcione de maneira organizada e segura.

### Aula 7 - Polimorfismo
**Pergunta:** "No nosso loop `for \(Veiculo veiculo : frota\)`, a variável `veiculo` é do tipo g
enérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia\(\)` lá na classe mãe `
Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Ca
rro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?"
**Sua Resposta:**

O método calcularAutonomia() precisa estar declarado na classe base Veiculo porque a variável utilizada no loop é desse tipo. Mesmo que os objetos armazenados na lista sejam instâncias de Carro ou Moto, o compilador verifica quais métodos estão disponíveis por meio do tipo declarado da variável. Quando o método existe na classe base e é sobrescrito nas classes filhas, cada veículo pode fornecer sua própria implementação. Assim, ao chamar veiculo.calcularAutonomia(), o Java executa a versão correspondente ao objeto real. Esse comportamento é chamado de polimorfismo e permite trabalhar com diferentes tipos de veículos de maneira uniforme, sem precisar criar condições específicas para cada classe. Isso reduz a repetição de código e facilita a inclusão de novos tipos de veículos.

### Aula 8 - Classes Abstratas
**Pergunta:** "Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser
um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem se
r carro, moto, caminhão ou nada disso?
Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? P
or que ele não deduz isso sozinho?
Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new V
eiculo\(\)` e quebrar a lógica do nosso sistema?"
**Sua Resposta:**

Declarar a classe Veiculo como abstrata faz sentido porque ela representa um conceito geral, enquanto Carro e Moto representam tipos específicos de veículos. Na prática, normalmente identificamos um veículo por uma categoria concreta, com características e comportamentos próprios. Ao utilizar o modificador abstract, o Java impede a criação direta de objetos da classe Veiculo, evitando instâncias genéricas que talvez não façam sentido para as regras do sistema. O compilador não deduz automaticamente essa intenção, pois uma classe comum pode representar um conceito geral ou um objeto que realmente deve ser instanciado. Por isso, o desenvolvedor precisa declarar explicitamente a abstração. Essa decisão ajuda a garantir que o sistema trabalhe com os tipos de veículos previstos na modelagem e permite definir comportamentos que as subclasses devem implementar.

### Aula 9 - Interfaces
**Pergunta:** "Por que Java permite herança simples \(apenas uma mãe\), mas múltipla implementaç
ão de interfaces \(vários contratos\)?
Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo \(herança mú
ltipla\), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar\(\)`?
Como as interfaces resolvem esse problema? "
**Sua Resposta:**

A linguagem Java permite que uma classe implemente várias interfaces porque elas definem contratos que a classe deve cumprir, possibilitando combinar diferentes capacidades. Por outro lado, a herança de classes é limitada a uma única classe mãe para evitar ambiguidades e conflitos na herança de estado e implementação. Por exemplo, se CarroEletrico pudesse herdar de Veiculo e de uma classe Bateria, e ambas tivessem um método ligar() com implementações diferentes, poderia haver dúvidas sobre qual comportamento deveria ser utilizado. Com interfaces, podemos definir contratos como Recarregavel ou Ligavel, que uma classe pode implementar conforme suas necessidades. Assim, o veículo pode herdar de Veiculo e implementar múltiplas interfaces sem precisar herdar a implementação de várias classes. Isso favorece a flexibilidade, o reaproveitamento e a organização do código.


## Desafios Técnicos Implementados
### Desafio Pessoal (Seu Projeto)
**Qual foi o domínio que você escolheu para seu projeto pessoal?**

Escolhi o domínio de artigos esportivos, desenvolvendo um projeto em Java para representar um Tênis. O objetivo foi aplicar os conceitos ensinados em aula, criando uma classe com atributos e métodos para representar as características do produto e permitir alterações controladas em seus dados.
**Quais classes você criou?**
Tenis.java: classe base que representa um tênis e reúne suas características e comportamentos comuns.
TenisInfantil.java: classe que representa um tênis infantil, especializando a classe Tenis.
TenisAdulto.java: classe que representa um tênis adulto, também especializada a partir da classe Tenis.
Dono.java: classe que representa o dono e permite organizar as informações relacionadas a ele.
Vendavel: interface que define um contrato relacionado à venda dos produtos.

**Qual foi o maior desafio técnico que você enfrentou?**

Um dos maiores desafios foi compreender como organizar as classes e fazer com que elas trabalhassem juntas utilizando os conceitos de Programação Orientada a Objetos. A criação da classe Tenis permitiu reunir características comuns dos produtos, evitando a repetição de código. Com as classes TenisInfantil e TenisAdulto, pude trabalhar o conceito de herança, aproveitando a estrutura da classe base e especializando os tipos de tênis. Outro ponto importante foi a utilização da interface Vendavel, que permite definir um contrato para as classes que precisam implementar comportamentos relacionados à venda. A classe Dono também faz parte da estrutura do projeto e permite representar essa entidade no sistema. Durante o desenvolvimento, foi importante entender a responsabilidade de cada classe e como os conceitos de orientação a objetos ajudam a organizar o código. Esse projeto contribuiu para melhorar minha compreensão sobre reutilização, organização e manutenção de código em Java.



## Conclusão
**O que você aprendeu nestas 9 aulas?**

Durante as nove aulas de POO, aprendi a organizar melhor o código utilizando classes, objetos, métodos, construtores e encapsulamento. Também compreendi como a herança permite reutilizar códigos e criar classes mais específicas, como TenisInfantil e TenisAdulto, a partir da classe Tenis. Aprendi sobre polimorfismo, classes abstratas e interfaces, entendendo como esses conceitos ajudam a deixar o código mais flexível e organizado. No meu projeto, também pude praticar a utilização da interface Vendavel e trabalhar com diferentes classes que representam elementos do sistema. Essa experiência me ajudou a entender melhor como a teoria é aplicada na prática e como desenvolver programas mais organizados, reutilizáveis e fáceis de manter.

**Qual conceito foi mais difícil de entender?**

O conceito que achei mais difícil de entender foi o polimorfismo e a estrutura de interfaces, pois no início tive dificuldade para compreender como diferentes classes podem utilizar uma estrutura em comum e apresentar comportamentos específicos. Com os exemplos apresentados nas aulas e a prática no desenvolvimento do projeto, comecei a entender melhor a relação entre as classes e como a orientação a objetos facilita a reutilização do código. Também percebi que praticar e analisar exemplos ajuda bastante a compreender esses conceitos.

**O que você melhoraria no seu projeto se pudesse refazer?**

Se pudesse refazer meu projeto, melhoraria a organização do código e acrescentaria mais funcionalidades ao sistema de tênis. Também investiria em validações para evitar informações incorretas, além de criar testes para verificar o funcionamento dos métodos. Outra melhoria seria aprimorar a utilização da interface Vendavel e explorar melhor os conceitos de herança e polimorfismo entre as classes Tenis, TenisInfantil e TenisAdulto. Dessa forma, o projeto ficaria mais completo, organizado e fácil de manter, além de me permitir aprofundar os conhecimentos adquiridos durante as aulas.
