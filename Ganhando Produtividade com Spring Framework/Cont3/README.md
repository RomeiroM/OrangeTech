# :star: Imersão no Spring Framework com Spring Boot

Curso da plataforma [DIO](https://web.dio.me/)

_Instrutor: Gleyson Sampaio_

## Spring Framework

Framework open source desenvolvido para a plataforma Java baseado nos padrões de projetos inversão de controle e injeção de dependências.

Sua estrutura é composta por módulos afins de reduzir a complexidade no desenvolvimento aplicações simples ou corporativa.

### Spring versus Java EE

Olhando um pouco a história, há muito, mas muito tempo atrás, o Java EE era realmente muito complicado e nem era necessário entrar numa discussão, usar o Spring era um caminho mais simples e mais fácil de evoluir. Aí chegou a versão 5 do Java EE e a discussão voltou a ficar um pouco mais quente.

### Inversão de Controle

Inversion of Control ou IoC, trata-se do redirecionamento do fluxo de execução de um código retirando parcialmente o controle sobre ele e delegando-o para um container.

O principal propósito é minimizar o acoplamento do código.

### Injeção de Dependências

Injeção de dependências é um padrão de desenvolvimento com a finalidade de manter baixo o nível de acompanhamento entre módulos de um sistema.

### Beans

Objeto que é instanciado (criado), montado e gerenciado por um container através do princípio da inversão de controle.

### Scopes

#### **Singleton**

O contêiner do Spring IoC define apenas uma instância do objeto.

#### **Prototype**

Será criado um novo objeto a cada solicitação ao container.

#### **HTTP - Request**

Um bean será criado para requisição HTTP.

_Os objetos existirão enquanto a requisição estiver em execução._

#### **HTTP - Session**

Um bean será criado para a sessão de usuário.
_Precisamos acessar a mesma solicitação duas vezes para testar os escopos específicos da web._

#### **HTTP - Global**

Ou Application Scope cria um bean para o ciclo de vida do contexto da aplicação.

_Objetos compartilhados por toda a aplicação._

#### **Autowired**

~~~~java
public class MyApp implements ComandLineRunner{
    
    @Autowired

    private Calculadora calculadora;
    @Override
    public static void run(String... args) throws Exception{
        System.out.print("o resultado é "+ calculadora.somar(2,7));
    }
}
~~~~

Uma anotação (indicação) onde deverá ocorrer uma injeção automática de dependência.

- **byName** : É buscado um método set que corresponde ao nome do Bean.
- **byType** : É considerado o tipo da classe para inclusão do Bean.
- **byConstrutor** : Usamos o construtor para incluir a dependência.

## Projeto Springboot

Enquanto que o Spring Framework é baseado no padrão de injeção de dependências, o Springboot foca na configuração automática.

_Dado que a maior parte das configurações necessárias para o início de um projeto são sempre as mesmas, por que não iniciar um projeto com todas estas configurações já definidas?_

### Primeiros passos

A seguir será mostrada duas formas de criar um projeto com SpringBoot:

1) A partir do site do initializr: 
   
[Site Spring initializr](https://start.spring.io/)

<div align="center">
<img src="https://user-images.githubusercontent.com/85644789/214850012-1def3a53-6a19-4cde-8d67-23822c16aec8.png" width="400px">
</div>

1) A partir do Visual Studio Code:

Instalar as seguintes extensões para facilitar a criação:

- Spring Boot Extention Pack
- Lombok Annotations Support for VS Code 

- Apó a instalação inserir o  atalho ctrl+shift+p e criar um projeto com Springboot com as configurações desejadas.

### Beans versus Components

Se tiver acesso ao código fonte recomenda-se usar o @Component, caso contrário utilize @Bean.

### Conceitos de ORM e JPA

**ORM**

Object-Relational Mapping, em português, mapeamento objeto-relacional, é um recurso para aproximar o paradigma da orientação a objetos ao contexto ode banco de dados relacional.

O uso de ORM é realizado atrvés do mapeamento de objeto para uma tabela por uma biblioteca ou framework.

**JPA**

JPA é uma especificação baseada em interfaces, que através de um framework realiza operações de persistencia de objetos em Java.

**Mapeamento**

Vamos connhecer os aspectos das anotações de mapeamento do JPA

- Identificação
- Definição
- Relacionamento
- Herança
- Persistência

Mapeamento na prática:

~~~java
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class Usuario{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_usuario")
    private Long id;

    private String nome;

    @Column(name="login_usuario")
    private String login;

    @Column(length = 100 , nullable = false, name="senha_usuario")
    private String senha;

}
~~~

### Banco de Dados

_Conecte o seu projeto Spring Boot em qualquer banco de dados relacional._

O projeto Spring Data JPA é capaz de se conectar a qualquer banco de dados relacional.

Em um projeto Spring Boot toda a parte de configuração fica centralizada no arquivo **application.properties** inclusive configurações de banco. Vamos demonstrar uma configuração para acessar o banco de dados PostgreSQL mas serve para todos os bancos de dados relacionais.

~~~~java
#Opcional
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update

#Obrigátorio de acordo com o seu banco de dados
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_db
spring.datasource.username=seu_user
spring.datasource.password=seu_pass
~~~~

- A linha 2: Quando deseja exibir todo sql gerado no console.
- A linha 3: O JPA é capaz de criar as tabelas do sistema conforme mapeamento.
- A linha 6: Determina a plataforma de interpretação de SQL.
- A linha 7: O drive do banco de dados.
- A linha 8: A URL do banco de dados.
- A linha 9: O usuário do banco de dados.
- A linha 10: A senha do banco de dados.

Após definir qual banco de dados será utilizado, é necessário adicionar o drive como dependência no **pom.xml**.

~~~~xml
<!-- POSTGRES -->
<dependency>
	<groupId>org.postgresql</groupId>
	<artifactId>postgresql</artifactId>
	<scope>runtime</scope>
</dependency>
~~~~

## Referências
https://glysns.gitbook.io/spring-framework