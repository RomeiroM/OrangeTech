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

~~~~xml
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

- Apó a instalação clicr em ctrl+shift+p e criar um projeto com Springboot com as configurações desejadas.