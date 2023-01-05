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

## Operadores

<p>Símbolos especiais, que tem um significado próprio para a linguagem e estão associados a determinadas operações.</p>

Operador | Comparação
:------: | :--------:
== | Igual
!= | Diferente
< | Menor
_>_ | Maior
<= | Menor Igual
_>=_ | Maior Igual

### Classificação dos Operadores

#### **Atribuição**

<p>Representado pelo símbolo de igualdade "=".
O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. em Java, definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição. Exemplos abaixo:</p>

~~~~java
//classe Operadores.java
String nome = "FULANO";
int idade = 27;
double peso = 70.2;
char sexo = 'M';
boolean doadorOrgao = true;
Date dataNascimento = new Date();
~~~~

#### **Aritméticos**

<p>O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.</p>

Simbolo | significado
:-----: | :--------:
+ | adição
- | subtração
* | multiplicação
/ | divisão

_ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”._

#### **Unários**

<p>Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.</p>

- (+) **Operador unário de valor positivo** – números são positivos sem esse operador explicitamente;
- (-) **Operador unário de valor negativo** – nega um número ou expressão aritmética;
- (++) **Operador unário de incremento de valor** – incrementa o valor em 1 unidade;
- (--) **Operador unário de decremento de valor** – decrementa o valor em 1 unidade;
- (!) **Operador unário lógico de negação** – nega o valor de uma expressão booleana.

#### **Ternário**

<p>O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária, como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.
O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:</p>

~~~~java
// classe Operadores.java
int a, b;

a = 5;
b = 6;

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println(valor);
~~~~

#### **Relacionais**

<p>Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando um valor booleano como resultado.</p>

- == Quando desejamos verificar se uma variável é IGUAL A outra.
- != Quando desejamos verificar se uma variável é DIFERENTE da outra.
- ">" Quando desejamos verificar se uma variável é MAIOR QUE a outra.
- ">=" Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
- < Quando desejamos verificar se uma variável é MENOR QUE outra.
- <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

##### **Comparações avançadas**

<p>Quando se refere a comparação de conteúdos na linguagem, devemos ter um certo domínio, de como o Java trata o armazenamento destes valores na memória.</p>

_Quando estiver mais familiarizado com a linguagem, recomendamos se aprofundar no conceito de espaço em memória Stack versus Heap._

~~~~java
// ComparacaoAvancada.java
public static void main(String[] args) {

        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??

    }
~~~~

<p>== versus equals: Existe uma relevância forte, em realizar comparações com == e equals na qual precisamos ter uma compreensão de quais as regras seguidas pela linguagem **** , exemplo:</p>

~~~~java
// ComparacaoAvancada.java
 public static void main(String[] args) {
        
        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2); //true
        
        Integer numero1 = 130;
        Integer numero2 = 130;

        System.out.println(numero1 == numero2); //false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
        
         System.out.println(numero1.equals(numero2)); 
 }
~~~~

#### **Lógicos**

<p>Os operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões.</p>

- && Operador Lógico "E"
- || Operador Lógico "OU"

~~~~java
// Operadores.java
boolean condicao1=true;

boolean condicao2=false;

/* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

if(condicao1 && condicao2)
	System.out.print("Os dois valores precisam ser verdadeiros");;

//Se condicao1 OU condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
	System.out.print("Um dos valores precisa ser verdadeiro");
~~~~

##### **Expressões lógicas avançadas**

<p>Nós acabamos de aprender que existem os operadores lógicos "&"(E) e "||" (OU), mas por que no exemplo acima, foram ilustradas as condições:</br>
if (condicao1 && condicao2) e if(condicao1 || condicao2) ?</p>

_A duplicidade nos operadores lógicos é um recurso conhecido como Operador Abreviado, isso quer dizer que, se a condição1 atender aos critérios, não será necessário validar a condição2._

~~~~java
// ComparacaoAvancada.java
int numero1 = 1;
int numero2 = 1;

if(numero1== 2 & numero2 ++ == 2 )
    System.out.println("As 2 condições são verdadeiras");

System.out.println("O numero 1 agora é " + numero1);
System.out.println("O numero 2 agora é " + numero2);

// Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )
~~~~

## Métodos

<p>Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes.</p>

### Critério de nomeação de Métodos

<p>Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:</p>

- Deve ser nomeado como verbo;
- Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

_ATENÇÃO! Não existe em Java o conceito de métodos globais. Todos os métodos devem SEMPRE ser definidos dentro de uma classe._

### Critério de definição de métodos

<p>Mas, como sabemos a melhor forma, de definir os métodos das nossas classes? Para chegar à essa conclusão, somos auxiliados por uma convenção estrutural para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:</p>

1. **Qual a proposta principal do método?** Você deve se perguntar constantemente até compreender a real finalidade do mesmo.
2. **Qual o tipo de retorno esperado após executar o método?** Você deve analisar se o método será responsável por retornar algum valor ou não.

_Caso o método não retorne nenhum valor, ele será representado pela palavra-chave void._

1. **Quais os parâmetros serão necessários para execução do método?** Os métodos às vezes precisarão de argumentos como critérios para a execução.
2. **O método possui o risco de apresentar alguma exceção?** Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.
3. **Qual a visibilidade do método?** Avaliar se será necessário que o método seja visível a toda aplicação, somente em pacotes, através de herança ou somente a nível a própria classe.

<p>Abaixo, temos um exemplo de uma classe com dois métodos e suas respectivas considerações:</p>

~~~~java
public class MyClass {
	
	public double somar(int num1, int num2){
		//LOGICA - FINALIDADE DO MÉTODO
		return ... ;
	}
	
	public void imprimir(String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN
		//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
	}
	// throws Exception : indica que o método ao ser utilizado
	// poderá gerar uma exceção
	public double dividir(int dividendo, int divisor) throws Exception{}
	
	// este método não pode ser visto por outras classes no projeto
	private void metodoPrivado(){}
	
	//alguns equívocos estruturais
	public void validar(){
		//este método deveria retornar algum valor
		//no caso boolean (true ou false)
	}
	public void calcularEnviar(){
		//um método deve representar uma única responsabilidade
	}
	public void gravarCliente(String nome, String cpf, Integer telefone, ....){
		//este método tem a finalidade de gravar
		//informações de um cliente, por que não criar
		//um objeto cliente e passar como parâmetro ?
		//veja abaixo
	}
	public void gravarCliente(Cliente cliente){}
	//ou
	public void gravar(Cliente cliente){}
}
~~~~

## Escopo

<p>O escopo pode ser entendido como,o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.</p>
A variável é criada no primeiro acesso à ela, se tornando inacessível <p>após o interpretador sair do bloco de execução, ao qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.</p>
<p>Em uma Classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da Classe, sendo portanto, acessíveis por todos os métodos.</p>
<p>Caso você declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.</p>
<p>Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização do código em questão. Sem um domínio sobre escopo de códigos, seu projeto tende a conter falhas estruturais e comprometer a proposta principal da aplicação.</p>

~~~~java
public class Conta {
	//variavel da classe conta
	double saldo=10.0;
	
	public void sacar(Double valor) {
		//variavel local de método
		double novoSaldo = saldo - valor;
	}
	public void imprimirSaldo(){
		//disponível em toda classe
		System.out.println(saldo);
		//somente o método sacar conhece esta variavel
		System.out.println(novoSaldo);
	
	}
	public double calcularDividaExponencial(){
		//variável local de método
		double valorParcela = 50.0;
		double valorMontante = 0.0; // começando a variável com valor zero
		for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
		//escopo de fluxo
		//x e valorCalculado nunca estarão disponíveis fora do for
		
		return valorMontante;
	}
}
~~~~

## Palavras reservadas

<p>Palavras reservadas, são identificadores de uma linguagem que já possuem uma finalidade específica, portanto, não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.</p>
<p>A linguagem Java possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos e escritas com letra minúscula, sendo identificadas com uma cor especial pela maioria das IDE's. Abaixo temos a lista de palavras agrupadas por suas finalidades.</p>

Controle de pacotes
:-----------------:
**import**: importa pacotes ou classes para dentro do código;
**package**: especifica a que pacote, todas as classes de um arquivo pertencem.