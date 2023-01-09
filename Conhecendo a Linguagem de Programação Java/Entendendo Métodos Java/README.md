# :star: Entendendo Métodos em Javas
:man: _Instrutor: Thiago Leite e Carvalho_

_Engenheiro de Software, Professor, Escritor_

Curso disponível na plataforma [DIO]()

## Objetivo do curso

<p>Possibilitar que o aluno compreenda o que é um método, como criá-lo e utilizá-lo.</p>

## Criação

### Conceituação

<p>"É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento."</p>
<p>Padrão de definição:</p>
**<?visibilidade?><?tipo?><?modificador?>retorno nome(<?parâmetro?>)<?exceções?>corpo**

<p>onde:</p>

- **Visibilidade:** "public", "protected" ou "private"
- **Tipo:** concreto ou abstrato
- **Modificador:** "static" ou "final"
- **Retorno:** tipo de dado ou "void"
- **Nome:** nome que é fornecido ao método
- **Parâmetro:** parâmetros que pode receber
- **Exceções:** exceções que pode lançar
- **Código:** código que possui ou vazio

### Particularidades

- Assinatura: é a forma de identificar unicamente o método
  - Ass = nome + parâmetros.
- Construtor e Destrutor : são métodos especiais usadados na Orientação a Objeto;
- Mensagem: é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto oou a uma classe.
- Passagem de parâmetros:
  - Por valor (cópia)
  - Por referência (endereço)

### Boas práticas

- Nomes devem ser descritivos, mas curtos
- Notação camelo
  - Ex: verificasSaldo(); executarTransferencia(...). existeDebito ();
- Deve possuir entre 80 e 120 linhas
- Evite lista de parâmetros longas 
- Visibilidades adequada

### Exercitando

Criar uma aplicação que resolva as seguintes situações:
- Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
- A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.
- Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam. Defina arbitrariamente as faixas que influenciam nos valores.

**Observações:**
- Tente ao máximo criar métodos que trabalhem sozinhos ou em conjunto
- Pode chamar um método dentro de outro
- Pode passar como parâmetro, a chamada de um outro método

## Sobrecarga

## Retornos