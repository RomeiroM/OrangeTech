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

<p>"É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome."</p>
<p>Alterar a assinatura do método:</br>Ass = nome + parâmetros</p>
<p>Exemplos:</p>
<p>converterParaInteiro(float f);</br>
converterParaInteiro(double d);</br>
converterParaInteiro(String s);</br>
converterParaInteiro(float f, RoundType rd);</br>
converterParaInteiro(double d, RoundType rd);</br> 
converterParaInteiro(String s, RoundType rd);</br> 
converterParaInteiro();</p>

**Exercitando**

<p>Criar uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.</br>Obs.: Use sobrecarga.</p>

## Retornos

- É uma instrução de interrupção
- Simbologia: return

<p>O método executa seu retorno quando:</p>

- completa todas suas instruções internas;
- Chega a uma declaração explicita de retorno;
- Lança uma exceção.

### Considerações
- O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto;
- O tipo de dado do return deve ser compatível com o do método;
- Se o método for sem retorno(void), pode ou não ter um "return" para encerrar sua execução.

### Exercitando
<p>Recrie a aplicação que calcula a área dos 3 quadrilateros notáveis. Agora faça os métodos retornarem valores.</p>