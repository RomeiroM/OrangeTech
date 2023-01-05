# Aprendendo a Sintaxe Java
<p>Instrutor do Curso: <a href="https://glysns.gitbook.io/java/">Gleyson Sampaio</a></p>

_Curso disponível na plataforma [DIO](https://web.dio.me/home)_

## Anatomia das classes
<p>A escrita de códigos de um programa é feita através da composição de, palavras pré-definidas pela linguagem, com as expressões que utilizamos para determinar o nome do nossos arquivos, classes, atributos e métodos.</p>
<p>É muito comum mesclarmos expressões no idioma americano com o nosso vocabulário. Existem projetos que recomendam que toda a implementação do seu programa seja escrita na língua inglesa.</p>

**<p>Sintaxe de declaração de uma nova classe:</p>**


~~~~java
public class MinhaClasse{

    //SEU CÓDIGO AQUI

}
~~~~

- 99,9% das nossas classes iniciarão com **public class**;
- Toda classe precisa de nome, exemplo **MinhaClasse**;
- O nome do arquivo deve ser idêntico ao nome da classe pública;
- Após o nome, definir o corpo **{ }** , onde iremos compor nossas classes com atributos e métodos.

~~~~java
public class MinhaClasse{

    //CORPO DA CLASSE

    public static void main(String [] args){
        //CORPO DO MÉTODO main
    }

}
~~~~

- É de suma importância que agora você consiga se localizar dentro do conjunto de chaves _**{ }**_ existentes em sua classe.
- Dentro de uma aplicação, **recomenda-se que somente uma classe possua o método _main_**, responsável por iniciar todo o nosso programa.
- O método **main** recebe seu nome main, sempre terá a visibilidade **public**, será difinido como static, não retornará nenhum valor com **void** e receberá um parâmetro do tipo array de caracteres **String[]**.

## Padrão de nomenclatura

<p>Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padrões estão expressos nos itens abaixo:</p>

- **Arquivo .java:** Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula, exemplo:
**Calculadora.java, CalculadoraCientifica.java**

- **Nome da classe no arquivo:** A classe deve possuir o mesmo nome do arquivo.java, exemplo:

~~~~java
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
~~~~

- **Nome de variável:** toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA, exemplo: ano e anoFabricacao. O nome dessa prática para nomear variáveis dessa forma se chama "camelCase".

_Existe uma regra adicional para variáveis, quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome br sempre representará "Brasil" e nunca mudará seu valor, logo, determinamos como escrita o código abaixo:_

~~~~java
String BR = "Brasil"
double PI = 3.14
int ESTADOS_BRASILEIRO = 27
int ANO_2000 = 2000
~~~~

_Recomendações: Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém, devemos seguir algumas regras da linguagem._

- Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9;
- Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número;
- Deve iniciar com uma letra minúscula (boa prática – ver abaixo);
- Não pode conter espaços;
- Não podemos usar palavras-chave da linguagem;
- O nome deve ser único dentro de um escopo.

~~~~java
// Declação inválida de variáveis

int numero&um = 1; //Os únicos símbolos permitidos são _ e $
int 1numero = 1;    //Uma variável não pode começar com númerico
int numero um = 1; //Não pode ter espaço no nome da variável
int long = 1; //long faz parte das palavras reservadas da linguagem
 
 // Declaração válida de veriáveis
int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;	
~~~~

## Declarando variáveis e métodos

<p>Como identificar a diferença entre, declaração de variáveis e métodos em nossa programa? Existe uma estrutura comum para ambas as finalidades, exemplo:</p>

- Declarar uma variável em Java segue sempre a seguinte estrutura:

~~~~java
// Estrutura

Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)

// Exemplo

int idade = 23;
double altura = 1.62;
Dog spike; //observe que aqui a variável spike não tem valor, é normal
~~~~

- Declarar métodos em Java segue uma estrutura bem simples:

~~~~java
// Estrutura

TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

//Exemplo

int somar (int numeroUm, int numero2)

String formatarCep (long cep)
~~~~

## Indentação (indentation)

<p>Basicamente indentar é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.</p>

~~~~java
public class BoletimEstudantil {
	public static void main(String[] args) {
		int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
}
~~~~

## Organizando arquivos

<p>À medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização destes arquivos através de pacotes (packages).</p>
<p>Com o uso de pacotes, as nossas classes (.java) passam a possuir duas identificações, o nome simples e nome qualificado:</p>

- **Nome Simples:** Nome do arquivo, exemplo ContaBanco.
- **Nome Qualificado:** Nome do pacote + nome do arquivo, exemplo: com.suaempresa.ContaBanco.

## Java Beans

<p>Umas das maiores dificuldades na programação é escrever algoritmos legíveis, a níveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso, a linguagem Java sugere através de convenções, uma escrita universal, para nossas classes, atributos, métodos e pacotes.</p>

### Variáveis

<p>Mais cedo já aprendemos algumas regras de declaração de variáveis, mas agora iremos conhecer algumas sugestões de nomenclatura:</p>

- Uma variável deve ser clara, sem abreviações ou definição sem sentido;
- Uma variável é sempre no singular, exceto quando se referir a um array ou coleção.
- Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.

**Não recomendado:**
~~~~java
double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 
~~~~

**Recomendado**
~~~~java
double salarioMedio=1500.23;
String email ="aluno@escola.com";
String [] emails = {"aluno@escola.com","professor@escola.com"}
String meuNome = "JOSEPH" 
~~~~

### Métodos
<p>Os métodos deverão ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. Em princípio todas as letras que compõem o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta, a partir da segunda palavra.</p>
<p>Exemplos sugeridos para nomenclatura de métodos:</p>

~~~~java
somar(int n1, int n2){}

abrirConexao(){}

concluirProcessamento() {}

findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
~~~~

## Tipos de Variáveis
<p>Os oito tipos primitivos em Java são:
int, byte, short, long, float, double, boolean e char – esses tipos não são considerados objetos e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)</p>

<p>Tipos Primitivos e seus Valores:</p>

Tipo | Memória | Valor Minimo | Valor Máximo
:--: | :-----: | :----------: | :----------:
byte | 1 byte |-128 | 127
short | 2 byte | -32.768 | 32.767
int | 4 bytes | -2.147.483.648 | 2.147.483.647
long | 8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807

<p>Os tipos primitivos, que podem conter partes fracionárias podem ser representados por dois tipos:</p>

Tipo | Memória | Valor Minimo | Valor Máximo | Precisão
:--: | :-----: | :----------: | :----------: | :------:
float | 4 bytes | -3,4028E + 38 | 3,4028E + 38 | 6 – 7 dígitos
double |8 bytes | -1,7976E + 308 | 1,7976E + 308 | 15 dígitos

### Declaração de Variáveis
<p>Variável, é uma identificação de um espaço em memória, utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuído.</br>int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. </p>

~~~~java
int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
~~~~

<p>Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos. Observe no exemplo abaixo:</p>

~~~~java
public class TipoDados {
	public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
	}
}
~~~~
_<p>Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia, podem estimular uma alteração de tipos de dados convencional</p>_

#### Variáveis e Constantes

<p>Uma variável é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado, define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.</p>
<p>No Java, utilizamos identificadores que representam uma referência (ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor, sendo portanto esta a causa do nome "variável", pois o valor pode variar.</p>
<p>Já as Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada final, seguida do tipo.</p>
<p>Por convenção, Constantes são sempre escritas em CAIXA ALTA.</p>
<p>Abaixo, temos um exemplo explicativo sobre uso de variáveis e constantes:</p>

~~~~java
public class ExemploVariavel {
	public static void main(String[] args) {
		/*
		 * esta linha é considerada como declaração de variável iniciamos a existência
		 * variavel numero com valor 5 regra: tipo + nome + valor
		 */
		int numero = 5;

		/*
		 * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
		 * não é mais necessário, pois a variável já foi declarada anteriormente
		 */
		numero = 10;

		System.out.print(numero);
		
		/*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 25 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
		final double VALOR_DE_PI = 3.14;
		
		VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
	}
}
~~~~
