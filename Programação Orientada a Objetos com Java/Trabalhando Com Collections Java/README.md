# Trabalhando Com Collections Java
_[Instrutora: Camila Cavalcante](https://github.com/cami-la/curso-dio-intro-collections)_

## Collection
- Collection é um objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade.
- Serve para armazenar e processar conjuntos de dados de forma eficiente.

## Composição Collections
- **Interfaces**: É um contrato que quando assumido por uma
classe deve ser implementado.

- **Implementações ou Classes**: são as materializações, a
codificação das interfaces.

 - **Algoritmos**: É uma sequência lógica, finita e definida de
instruções que devem ser seguidas para resolver um problema.

## java.util.List
Coleção com iterações ordenadas: List

Conhecendo os métodos

Ordenação da coleção List

-  Define uma coleção ordenada que pode conter elementos duplicados.
-  As classes e interfaces dessa estrutura de coleções são membros do pacote java.util.

## java.util.Set
- Não permite elementos duplicados
- Não possui índice

## java.util.Map
- Elementos únicos (key) para cada valor (value);
- construção de índices;
- a chave não pode ser repetida ao contrário do valor, mas se caso tiver uma chave repetida é sobrescrito pela última chamada
- A sintaxe deve obedecer a lugares apontados da chave e valor, pois cada chave leva somente um elemento, segue o exemplo abaixo:
~~~~java
Map<Elemento> mapa = new Type();
~~~~
Elemento - é o objeto declarado, podendo ser classes Wrappers ou tipo de coleção.


Type - é o tipo de objeto da coleção a ser usado.

**Exemplo de atribuição e impressão de valores:**

~~~~java
import java.util.HashMap;
import java.util.Map;

public class TestaInterfaceMap {

  public static void main(String[] args) {

    Map<integer, string=""> mapaNomes = new HashMap<integer, string="">();
    mapaNomes.put(1, "João Delfino");
    mapaNomes.put(2, "Maria do Carmo");
    mapaNomes.put(3, "Claudinei Silva");

System.out.println(mapaNomes);

    //resgatando o nome da posição 2
    System.out.println(mapaNomes.get(2));

  }
}
~~~~
### Classe HashMap
Essa classe é a implementação da interface Map mais trabalhada no campo de desenvolvimento.

- Os elementos não são ordenados;
- É rápida na busca/inserção de dados;
- Permite inserir valore e chaves nulas;
  
**Sintaxe**

~~~~java
HashMap mapa = new Type();
~~~~
- E - é o objeto declarado, podendo ser classes Wrappers ou tipo de coleção.
- Type - é o tipo de objeto da coleção a ser usado.

**Métodos úteis**

Esses métodos oferece bastante ajuda quando é trabalhado com a interface Map.

- **values()** - É uma Collection com todos os valores que foram associados a alguma das chaves.
- **keySet()** - Retorna um Set com as chaves do mapa especificado.
- **entrySet()** - Retorna um conjunto de Maps contido no mapa configurado, podendo ser possível acessar suas chaves e valores.
- **put** (Key key, Value value) - Associa um valor a uma chave específica.

Para interagir sobre um mapa é preciso trabalhar com a interface Collection ou métodos set() para converter esse mapa em um conjunto de dados.

~~~~java
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestaInterfaceMap {

  public static void main(String[] args) {

    Map<integer, string=""> mapaNomes = new HashMap<integer, string="">();
    mapaNomes.put(1, "João Delfino");
    mapaNomes.put(2, "Maria do Carmo");
    mapaNomes.put(3, "Claudinei Silva");

    //Collection<integer> conjNomes = mapaNomes.keySet();

    Set<entry<integer, string="">> set = mapaNomes.entrySet();
    Iterator it = set.iterator();

    System.out.println("Código\t\tValor");

                 //getKey() - recupera a chave do mapa
    //getValue() - recupera o valor do mapa

    while(it.hasNext()){
      Entry<integer, string=""> entry = (Entry)it.next();
      System.out.println(entry.getKey() + "\t\t"+entry.getValue());
    }
  }
}
~~~~
### Classe HashTable

Essa classe trabalha com algoritmo hash para conversão das chaves e um mecanismo de pesquisa de valores, sendo que tem seus métodos sincronizados (thread-safe) que permitem checar acessos concorrentes e armazenagem. Também possui uma eficiente pesquisa de elementos baseados em chave-valor, mas não aceita valores nulos.

## Classe Anônima

A classe anônima em Java é uma classe que não recebeu um nome e é tanto declarado e instanciado em uma única intrução. Você deve considerar o uso de uma classe anônima sempre que você precisa para criar uma classe que será instanciado apenas uma vez. 

## Functional Interface

Qualquer interface com um SAM (Single Abstract Mathod) é uma interface funcional e sua implementaçã pode ser tratada como expressões lambda.

## Lambda 

Uma função lamba é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e modificadores de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado. As funções lambda em Java tem sintaxe definida como (argumento) -> (corpo).

## Reference Method

Method Reference é um novo recurso do Java 8 que permite fazer refêrencia a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado num ponto específico do código, deixando-o, basta informar uma classe ou rêferencia seguida do símbolo "::" e o nome do método sem os parênteses no final.

## Streams API

A Streams API traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da programação funcional. Combinada com as expressões lambda, ela proporciona uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvoldedor uma maneira simples e concisa de escrever código que resulta em facilidade de manipulação e paralelização sem efeitos indesejados em tempo de execução.
