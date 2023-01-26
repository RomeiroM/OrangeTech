# Gerenciamento de Dependências e Build em Java com Maven
Curso da [DIO](https://web.dio.me)
_Instrutor:[Willyan Guimarães Caetano](https://www.linkedin.com/in/willyancaetanodev)_
## O que é Apache Maven?

O Maven é uma ferramenta utilizada para gerenciar projetos em Java e simplificar a vida do programador, auxiliando no ciclo de desenvolvimento incluindo compilação, controle de bibliotecas, distribuição e relatórios estatísticos. O projeto nasceu a partir das dificuldades encontradas principalmente em gerenciar a compilação de projetos e no controle de bibliotecas.

- Ferramenta para gerenciar build e dependências de um projeto
- Primeira versão em julho de 2004, mantido pela Apache Software Foundation


- Endereça como o software foi construído e suas dependências através do POM(Project Object Model)
- Facilita a compreensão do desenvolvedor
- Fornecer informações de qualidade

## Instalação e configuração

### Windows

- Baixar pacote no site oficial do [Apache Maven](https://maven.apache.org/):

https://maven.apache.org/

- Descompactar em um diretório
- Adicionar no Path pelo Painel Controle > Sistema e Segurança > Sistema > Configurações avançadas do sistema > Avançado > Variáveis de ambiente
````
mvn --version
````
## Criando um projeto via linha de comando
Com o cmd, vá até a pasta do desejada e inicie o projeto utilizando o seguinte código: 

````
mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinteractiveMode=false
````

### Comandos 

- Compilar: mvn compile
- Testar: mvn test
- Empacotar: mvn package
- Limpar o diretório de trabalho: mvn clean

## POM, Dependências e Repositórios

A configuração do Maven se baseia em um único arquivo, chamado pom.xml, que contém os metadados de um projeto. É a partir deste arquivo que toda a mágica por trás do Maven acontece.

- POM - Project Objetct Model
- Unidade fundamental de trabalho
- Formato XML
- Detalha o projeto
- Detalha como construir o projeto
- Maven sempre procura pelo pom.xml para realizar sua execução
- Nome do projeto
- Dependências
- Módulos
- Configurações de build
- Detalhes do projeto (nome, descrição, licença, url)
- Configurações de ambiente (repositório, tracking, profiles)
- Exemplo:
  - ~~~~xml
    <project>
        <modelVersion>4.0.0</modelVersion>
        <groupId>one.digitalinnovation</groupId>
        <artifactId>quick-start-maven</artifactId>
        <version>1</version>
  </project>
    ~~~~

### Repositórios

- São locais onde podemos encontrar plugins e bibliotecas que o Maven provê 
- Dois tipos: Local e Remoto
- Configurações
  - Via settings.xml
  - Localização: pasta_apache_maven/conf/settings.xml
- Repositório local
  - É o repositório na máquina utilizado pelo Maven para buscar os artefatos.
  - Estratégia de cachingg
  - Localizações:
    - Windows: %USERPROFILE%\\.m2\repository
    - Linux: $HOME/.m2/repository

### Como adicionar dependências

~~~~xml
<dependencies>
    <dependency>
      <groupId>one.digitalinnovation</groupId>
      <artifactId>app-spring</artifactId>
      <version>1.0.0</version>
    </dependency>
  </dependencies>
~~~~ 

- groupId: É como se fosse o id da organização. Segue as regras de nomes de pacote Java
- artifactId: Nome do projeto em si
- version: Número da versão que será utilizada

### Escopos

O Maven provê escopos para limitar a trnsitividade das dependências. Existem 6 tipos de escopos que podemos utilizar.

**Classpath**
  - Rumtime
  - Test
  - Compile

- Escopo Compile
  - Escopo deafult
  - Disponível em todos os classpaths
  - É transitivo

- Escopo provided
  - Indica que a dependência será fornecida em tempo de execução por uma implementação na JDK ou via container 
  - Exemplos: Servlet API, Java EE APIs
  - A dependência com esse escopo é adicionado no classpath usado para compilação(compile) e teste(test) mas não em runtime;
  - Não é transitiva

~~~xml
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>3.1.0</version>
      <scope>provided</scope>
    </dependency>
~~~

- Escopo runtime
  - Indica que a dependência é necessária para execução e não para compilação
  - Maven inclui no classpath dos escoposa de runtime e test

~~~xml
    <dependency>
      <groupId>msql</groupId>
      <artifactId>msql-connector-java</artifactId>
      <version>6.0.6</version>
      <scope>runtime</scope>
    </dependency>
~~~

- Escopo test
  - Disponível somente para compilação e execução de testes
  - Não é transitivo

~~~xml
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>${junit-jupiter.version}</version>
      <scope>test</scope>
    </dependency>
~~~

- Esopo system
  - Similar ao escopo provided exceto por ser necessário prover o JAR explicitamente
  - A dependência com esse escopo é adicionado no classpath usado para compilação(compile) e teste(test) mas não em runtime;
  - Não é transitiva

~~~xml
    <dependency>
      <groupId>com.baeldung</groupId>
      <artifactId>custom-dependency</artifactId>
      <version>1.3.2</version>
      <scope>system</scope>
      <systemPath>${project.basedir}/libs/custom-dependency-1.3.2.jar</systemPath>
    </dependency>
~~~

- Escopo import
  - Este escopo é disponível apenas com uma dependência do tipo pom e com tag _<dependencyManagement>_
  - Indica um processo de reutilizar dependências de um projeto

~~~xml
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>com.programmergirl</groupId>
                <artifactId>my-project</artifactId>
                <version>1.1</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
~~~

### Ver o classpath

Códigos para ver informações do classpath:
~~~~cmd
mvn dependency:build-classpath –DincludeScope=compile
~~~~

~~~~cmd
mvn dependency:build-classpath –DincludeScope=test
~~~~

~~~~cmd
mvn dependency:build-classpath –DincludeScope=runtime
~~~~

### Depêndencias Opcionais
- Utilizado quando uma dependência não é necessária para os projetos que irão reutilizar seu componente.
~~~~xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
    <optional>true</optional>
</dependency>
~~~~ 

### Exclusions
- Utilizado quando o componente que você usa compartilha uma biblioteca que você já tem ou não quer ter disponível

~~~~xml
<dependency>
    <groupId>one.digitalinnovation</groupId>
    <artifactId>component</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <exclusions>
        <exclusion>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
        </exclusion>
    </exclusions>
</dependency>
~~~~ 

## Maven Build Lifecycle

**O que é:**
- Conceito de ciclo de vida de construção
- Conceito e os comandos da ferramenta
- Composto por 3 ciclos de vida
- Cada ciclo possui fases (Maven Phases)
- Cada fase possui objetivos (Maven Goals)

## Pluguins mais utilizados

- eclipse
- jacoco
- ear
- war
- compile
- clean
- checkstyle
- javadoc

**Uso do pluguin**
````
mvn [pluguin-name]:[goal-name]
````
~~~~xml
<build>
    <pluguis>
        <pluguin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compile-plugin</artifactId>
            <version>3.8.0</version>
            <configuration>
                <release>11</release>
            </configuration>
        <pluguin>
    </pluguis>
</build>
~~~~ 

## Referências 

https://www.devmedia.com.br/gerenciando-projetos-com-maven/10823#:~:text=O%20arquivo%20pom.,compilar%20e%20distribuir%20uma%20aplica%C3%A7%C3%A3o.

https://maven.apache.org/guides/introduction/introduction-to-optional-and-excludes-dependencies.html