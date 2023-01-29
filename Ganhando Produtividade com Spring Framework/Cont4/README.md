# :star: Criando uma API REST Documentada com Spring Web e Swagger

Instrutor [Gleydson Sampaio](https://github.com/digitalinnovationone/dio-springboot)
DIO

Curso de Springboot Web da plataforma DIO.

## O que é API ?

Uma API (interface application program) é um código programável que faz a “ponte” de comunicação entre duas aplicações distintas.

## REST e RESTful

A API **REST** (representational state transfer) é como um guia de boas práticas e  **RESTful** é a capacidade de determinado sistema aplicar os princípios de REST.

## Princípios

Para que uma arquitetura seja RESTful, é necessário ter uma série de princípios ou padrões. Vejamos quais são eles:

- **cliente-servidor** — significa aprimorar a portabilidade entre várias plataformas de interface do usuário e do servidor, permitindo uma evolução independente do sistema;
- **interface uniforme** — representa uma interação uniforme entre cliente e servidor. Para isso, é preciso ter uma interface que identifique e represente recursos, mensagens autodescritivas, bem como hypermedia (HATEOAS);
- **stateless** — indica que cada interação via API tem acesso a dados completos e compreensíveis;
- **cache** — necessário para reduzir o tempo médio de resposta, melhorar a eficiência, desempenho e escalabilidade da comunicação;
- **camadas** — permite que a arquitetura seja menos complexa e altamente flexível.

## Nível de Maturidade

Para padronizar e facilitar o desenvolvimento de APIs REST, Leonard Richardson propôs um modelo de maturidade para esse tipo de API, definido em 4 níveis.

### Nível 0: Ausência de Regras

Esse é considerado o nível mais básico de uma API, quem implementa apenas esse nível não pode ser considerada REST pois não segue qualquer padrão.

Verbo HTTP | URI | Operação
:--------: | :-- | :-------
POST | /getUsuario | Pesquisar Usuário
POST | /salverUsuario | Salvar
POST | /alterarUsuario | Alterar
POST | /excluirUsuario | Deletar


### Nível 1: Aplicação de Resources

Verbo HTTP | URI | Operação
:--------: | :-- | :-------
GET | /usuarios/1| Pesquisar Usuário
POST | /usuarios | Salvar
PUT | /usuarios/1 | Alterar
DELETE | /usuarios/1 | Deletar

Observe que o nome dos recursos foram equalizados e para não gerar ambiguidade é necessário definir o verbo apropriadamente.

### Nível 2: Implementação de verbos HTTP

Como a definição dos verbos já foi requisitada no Nível 1, o Nível 2 se encarrega de validar a aplicabilidade dos verbos para finalidades específicas como:

Verbo HTTP | Função
:--------: | :-- 
GET | Retorna Dados
POST | Grava dados 
PUT | Altera Dados
DELETE | Remove Dados

### Nível 3: HATEOAS

HATEOAS significa Hypermedia as the Engine of Application State. Uma API que implementa esse nível fornece aos seus clientes links que indicarão como poderá ser feita a navegação entre seus recursos. Ou seja, quem for consumir a API precisará saber apenas a rota principal e a resposta dessa requisição terá todas as demais rotas possíveis.

## Primeiro Controller

Vamos criar nosso primeiro controller,para uma demonstração de uso de nossos serviços pela web.

## Rest Controller

Um Rest Controller em Spring, nada mais é que uma classe contendo anotações específicas para a disponibilização de recursos HTTPs, baseados em nossos serviços e regras de negócio.

Anotações e configurações mais comuns:

- **@RestController**: Responsável por designar o bean de compoment, que surporta requisições HTTP com base na arquitetura REST.
- **@RequestMapping("prefix")**: Determina qual a URI comum para todos os recursos disponibilizados pelo Controller.
- **@GetMapping**: Determina que o método aceitará requisições HTTP do tipo GET.
- **@PostMapping**: Determina que o método aceitará requisições HTTP do tipo POST.
- **@PutMapping**: Determina que o método aceitará requisições HTTP do tipo PUT.
- **@DeleteMapping**: Determina que o método aceitará requisições HTTP do tipo DELETE.
- **@RequestBody**: Converte um JSON para o tipo do objeto esperado como parâmetro no método.
- **@PathVariable**: Consegue determinar que parte da URI será composta por parâmetros recebidos nas requisições. 


## Referências

https://glysns.gitbook.io/spring-framework/spring-web/introducao