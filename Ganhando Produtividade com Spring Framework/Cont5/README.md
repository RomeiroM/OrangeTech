# :star: Explorando Padrões de Projetos na Prática com Java

_Instrutor: [Venilton Falvo Jr](https://linkedin.com/in/falvojr)_
DIO

_"Alguem está sentado na sombra hoje porque alguém plantou uma árvore há muito tempo." Warren Buffett_

## Padrões de Projetos

**São soluções consolidadas para problemas recorrentes no desenvolvimento e manutenção de software orientado a objetos.**

O livro **Design Patterns: Elements of Reusable Object-Oriented Software** (1995) é a principal referência sobre o tema, a qual tornou os autores **Gamma, Helm, Johnson e Vlissides** conhecidos como **"Gang of Four" (GoF)**.

São comumente classificados nas seguintes categorias:

- **Padrões Criacionais**: Abstract Factory, Builder, Factory Method, Prototype, _Singleton_.
- **Padrões Comportamentais**: Chain of Responsibility, Iterator, Observer, _Strtegy_, Template Method.
- **Padrões Estruturais**: Adapter, Bridge, Composite, Decorator, _Facade_, Flyweight, Proxy.

_"Falar é fácil. Mostre-me o código!" Linus Torvalds_

## Praticando com Java Puro: Singleton

**Singleton**

Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.

Exemplos:

~~~~java
/**
* Singleton "preguiçoso" .
*/

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public saic SingletonLazy getInstancia(){
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
~~~~

~~~~java
/**
* Singleton "apressado" .
*/

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SSingletonEager(){
        super();
    }

    public saic SingletonEager getInstancia(){
        return instancia;
    }
}
~~~~

Encapsulando a instância em uma classe interna:

~~~~java
/**
* Singleton "Lazy Holder".
*/

public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
~~~~

## Strategy

Simplificar a variação de algoritmos para a resolução de um mesmo problema.

## Spring Framework

explorando algunns padrões de projetos com Spring:

- **Singleton**: @Bean e @Autowired;
- **Strategy**: @Service e @Repository;
- **Facade**: construiremos uma API REST com o mesmoo objetivo desse padrão, abstrair a complexidade das seguintes integrações: _Spring Data JPA*_ e _ViaCEP_ (_Feign_).

_*Em memória (usando o "h2")._

## Saída Swagger UI

<div align="center">
  <p>Print do projeto concluído</p>
      <img src="https://user-images.githubusercontent.com/85644789/217676824-f4da0d3a-dab5-425e-9d6a-84260c7b17b3.png" width="600px">
</div>

## Referências

https://viacep.com.br/

https://www.jsonschema2pojo.org/