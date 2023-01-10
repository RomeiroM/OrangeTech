# Programação Orientada a Objetos

_Instrutor:[Thiago Leite e Carvalho](https://www.linkedin.com/in/thiago-leite-e-carvalho-1b337b127/)_
Curso disponível na plataforma DIO

## Percurso

- Aula 1 - Porque usar?
- Aula 2 - Os fundamentos
- Aula 3 - A estrutura
- Aula 4 - As relações
- Aula 5 - A Organização
- Aula 6 - Próximos passos

## Aula 1 - Porque usar?

### 1
 - Paradigma Estruturado tem uma representação mais simplista
 - Paradigma Orientado a Objetos tem uma representação mais realista
  
### 2
- Paradigma Estruturado foca em operações(funções) e dados 
- Paradigma Orientado a Objetos foca na modelagem de entidades e nas interações entre estas

### 3
- Programação Estruturada foca mais no "como fazer"
- Programação Orientada a Objetos foca mais no "o que fazer"

### Vantagens da POO

- Melhor coesão
- Melhor acoplamento 
- Diminuição do Gap semântico
- Coletor de lixo


## Aula 2: Os fundamenos

<p>"A Orientação a Objetos é um paradigma de análise, 
projeto e programação de sistemas de software 
baseado na composição e interação entre 
diversas  unidades de software 
chamadas de objetos."</br>
(https://pt.wikipedia.org/wiki/Orientação_a_objetos)
</p>

### Fundamentos

- Abstração
<p>"Processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objetos."</p>

- Reuso
<p>"Capacidade de criar novas unidades de código a partir de outras já existentes."</p>

- Encapsulamento
<p>"Capacidade de esconder complexidades e proteger dados."</p>

### Exercitando
<p>Levando em consideração uma loja  on-line de livros, modele uma entidade livro.</p>

## Aula 3: A estrutura 

### Objetivos
1. Apresentar os conceitos que criam as estruturas básicas da OO:
   - Classe
   - Atributo
   - Método
   - Objeto
   - Mensagem

### Classe

<p>"É uma estrutura que abstrai um conjunto de objetos com
características similares. Uma classe define o comportamento
de seus objetos através de métodos e os estados possíveis
destes objetos através de atributos. Em outros termos, uma 
classe descreve os serviços providos por seus objetos e quais
informações eles podem armazenar."
</br>
(https://pt.wikipedia.org/wiki/Classe_(programação))
</p>

- Dicas:
  - Substantivos
  - Nome simplificativos
  - Contexto deve ser considerado

- Codigos:

Java:
~~~~java
class Carro {

}
~~~~
C#:
~~~~c#
class Carro {

}
~~~~
Python:
~~~~python
class Carro :
    pass
~~~~

### Exercitando 1
Crie a classe "Carro".</br>
Obs: use a linguagem que gosta e siga as dicas sobre como criar classes

### Atributo

 "É o elemento de uma classe responsável por definir sua
estrutura de dados. O conjunto destes será responsável
por representar suas características e fará parte dos
 objetos criados a partir da classe." 

#### Atributo X Variável

**Atributo:** O que é próprio e peculiar a alguém ou a alguma coisa.</br>
**Variável:** Sujeito a variações ou mudanças; que pode variar; inconstante, instável

- Dicas:
    - Substantivos e adjetivos
    - Nome significativos
    - Contexto deve ser considerado
    - Abstração
    - Tipos adequados

- Códigos:
Java:
~~~~java
class Carro {
    int portas;
}
~~~~
C#:
~~~~c#
class Carro {
    int portas;
}
~~~~
Python:
~~~~python
class Carro :
    portas = 0
~~~~

### Exercitando 2

Evolua o exercicio 1 e defina 3 atributos para sua classe "Carro": cor, modelo e capacidade do tanque.

Obs: use a linguagem que gostar e siga as dicas sobre como criar atributos

### Método
"É uma porção de código (sub-rotina) que é disponibilizada pela classe. Este é executado quando é feita uma requisição a ele. Um método serve para identificar quais serviços, ações, 
que a classe oferece. Eles são responsáveis por definir
 e realizar um determinado comportamento"

- Dicas:
  - Verbos
  - Nomme significativos
  - Contexto deve ser considerado

- Códigos:
Java:
~~~~java
class Carro {
     void frear(){
   ...
  }

}
~~~~
C#:
~~~~c#
class Carro {
     void frear(){
   ...
  }
}
~~~~
Python:
~~~~python
class Carro :
    def frear()
~~~~

- Dois métodos especiais:
  - Construtor
  - Destrutor

#### Construtor 
Java:
~~~~java
class Carro {
     Carro(){
   ...
 }
}
~~~~
C#:
~~~~c#
class Carro {
    Carro(){
   ...
 }
}
~~~~
Python:
~~~~python
class Carro :
   def __init__(self):
        ...
~~~~

#### Destrutor 
Java:
~~~~java
class Carro {
    void finalize(){
   ...
  }
}
~~~~
C#:
~~~~c#
class Carro {
   ~Carro(){
   ...
 }
}
~~~~
Python:
~~~~python
class Carro:
   def __del__(self):
        ...
~~~~


### Exercitando 3

Evolua o conceito do exercício 2 e defina 1 método para calcular o valor total  para encher o tanque. Este deve receber como parâmetro o valor da gasolina. Faça também duas sobrecargas do construtor.

Obs: use a linguagem que gostar e siga as dicas
sobre como criar métodos

Obs: Crie métodos específicos para fornecer e
obter os valores dos atributos(set/get),
caso aplicável. 

### Objeto

"Um objeto é a representação de um conceito/entidade do mundo
real, que pode ser física (bola, carro, árvore etc.) ou conceitual (viagem, estoque, compra etc.) e possui um significado bem definido para um determinado software. Para esse 
conceito/entidade, deve ser definida inicialmente 
uma classe a partir da qual posteriormente serão
instanciados objetos distintos."

- Criação

Java:
~~~~java
Carro carro = new Carro();
~~~~
C#:
~~~~c#
Carro carro = new Carro();

~~~~
Python:
~~~~python
carro = new Carro()
~~~~

### Mensagem

"É o processo de ativação de um método de um objeto. Isto ocorre quando uma requisição (chamada) a esse método é realizada, assim disparando a execução  de seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja a um método estático."

Java:
~~~~java
Carro carro = new Carro();
carro.<método>;

Carro.<método>;
~~~~
C#:
~~~~c#
Carro carro = new Carro();
carro.<método>;

Carro.<método>;
~~~~
Python:
~~~~python
carro = Carro()
carro.<método>

Carro.<método>
~~~~

#### Exercitando 4

Evolua o conceito do exercício 3 criando objetos da classe "Carro". Use os métodos set/get, quando aplicáveis, para definir os valores dos atributos e exibir estes valores "get". Passe também uma mensagem para o cálculo do total pra encher o tanque.

Obs: use a linguagem que gostar e siga as dicas
sobre como criar métodos, atributos, etc.

Obs: use System.out, Console.WriteLine ou print

## Aula 4: As relações
### Objetivos
1. Apresentar os conceitos que ajudam a criar entidades a partir de outras entidades:
   - Herança
   - Associação
   - Interface

### Herança
"É o relacionamento entre classes em que uma classe chamada de subclasse (classe filha, classe derivada) é uma extensão, um subtipo, de outra classe chamada de superclasse (classe pai, classe mãe, classe base). Devido a isto, a subclasse consegue
reaproveitar os atributos e métodos dela. Além dos que 
venham a ser herdados, a subclasse pode definir
seus próprios membros."

Java:
~~~~java
class A extends B{
    ...
}
~~~~
C#:
~~~~c#
class A : B {
    ...
}
~~~~
Python:
~~~~python
class A(B):
    ...
~~~~

### Exercitando 1
Crie a classe "Veiculo","Carro", "Moto" e "Caminhao". ​

Obs: use a linguagem que gostar e siga as dicas sobre como criar classes. Faça a relação de herança que julgue adequada.

### Herança

- Tipos de herança
  - Simples
  - Múltipla

#### Simples
A classe filha tem só uma classe mãe

#### Múltipla
A classe filha tem uma ou mais classes mães
_obs: em Java esse tipo de herança não é permitido_

#### Upcast
Java:
~~~~java
A a = new B ();
~~~~
C#:
~~~~c#
A a = new B ();
~~~~
#### Downcast
Java:
~~~~java
B b = (B) new A();
~~~~
C#:
~~~~c#
B b = (B) new A();
~~~~

#### Polimorfismo
"A mesma ação, se comportando diferente."

#### Sobrescrita
"A mesma ação, podendo se comportar diferente. "​

#### Exercitando 2
Crie as classes "Funcionario", "Gerente", "Vendedor" e "Faxineiro". Realize upcasts e downcasts.

Obs: use a linguagem que gostar e siga as dicas sobre como criar classes. Faça a relação de herança de acordo com o slide.

#### Exercitando 3
Analise do comportamento de Polimorfismo e Sobrescrita.

### Associação
"Possibilita um relacionamento entre classes/objetos, no qual estes possam pedir ajuda a outras classes/objetos e representar de forma completa o conceito ao qual se destinam. Neste tipo de relacionamento, as classes e os objetos interagem entre si para atingir seus objetivos."

- Tipos
  - Estrutural
    - Composição: "Com parte Todo"
    - Ex Pessoa e Endereço
    ~~~~java
    class Pessoa {
        Endereco endereco;
    }
    ~~~~
    - Agregação: "Sem Parte Todo
    - Ex Diciplina e Aluno"
    ~~~~java
    class Disciplina {
        Aluno aluno;
    }
    ~~~~ 
  - Comportamental
    - Dependência: "depende de"

#### Exercitando 4
Apenas para praticar, codifique os exemplos dos slides anteriores sobre as associações.

Obs: use a linguagem que gostar e siga as dicas sobre como criar classes.

### Interface
"Define um contrato que deve ser seguido pela classe que a implementa. Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos que a interface disponibiliza."

Java:
~~~~java
interface A {
  ...
}

class B implements A {
  ...
}
~~~~
C#:
~~~~c#
interface A {
   ...
}

class B : A {
  ...
}
~~~~

#### Exercitando 5
Apenas para praticar, crie uma interface chamada "OperacaoMatematica". Crie também 4 métodos das operações básicas: soma, subtração, multiplicação e divisão.

Obs: use a linguagem que gostar e siga as dicas sobre como criar classes. Tente não implementar algum dos métodos  e veja o que acontece.

## Aula 5: A organização
1. Apresentar os conceitos que organização a OO:
   - Pacotes
   - Visibilidades

### Pacotes
"São uma organização física ou lógica criada para separar
classes com responsabilidades distintas. Com isso, 
espera-se que a aplicação fique mais organizada
e seja possível separar classes de finalidades
e representatividades diferentes."

Java:
~~~~java
package ...;

import ...;
~~~~
C#:
~~~~c#
namespace {...}

using ...;

~~~~
Python:
~~~~python
__init__.py(2.x)

from ...
import ...
~~~~

### Visibilidade
"Um modificador de acesso tem como finalidade determinar até
que ponto uma classe, atributo ou método pode ser usado. A
utilização de modificadores de acesso é fundamental para o
uso efetivo da Orientação a Objetos. Algumas boas práticas e
conceitos só são atingidos com o uso corretos deles."

- tipos 
  - Private
  - Protected
  - Public

**Private:** Só dentro da classe

Java
~~~~java
private

private int i;
private void do();
~~~~

**Protected:** Dentro da classe, mesmo pacote e subclasses:

Java
~~~~java
protected

protected int i;
protected void do();
~~~~

**Public:** Em qualquer lugar:

Java
~~~~java
public

public int i;
public void do();
~~~~

## Para saber mais
https://www.casadocodigo.com.br/products/livro-oo-conceitos

