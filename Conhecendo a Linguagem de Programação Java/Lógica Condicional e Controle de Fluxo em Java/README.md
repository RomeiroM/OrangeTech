# Lógica Condicional e Controle de Fluxo em Java

_Instrutor: Thiago Leite e Carvalho_

- Aula 1 - Operadores relacionais
- Aula 2 - Operadores Lógicos
- Aula 3 - Controle de fluxo
- Aula 4 - Blocos

## Aula 1 Operadores Relacionais

### Conceituação
<p>"São símbolos especiais que são capazes de realizar comparações entre determinados operadores e, em seguida, retornar um resultado"</p>

<p>Tipos:</p>

- Similaridade: igual, diferente
- Tamanho: maior, maior igual, menor, menor igual

### Utilização

<p>Similaridade</p>

- **Igualdade**:  determina se um operador é igual ao outro
- **Diferença**: determina se um operador não é igual ao outro

<p>Simbologia</p>

- **Igualdade**: ==
- **Diferença**: !=

<p>Tamanho</p>

- **Maior**:  determina se um operador é maior do que o outro
- **Maior Igual**: determina se um operador é maior ou igual ao outro
- **Menor**:  determina se um operador é menor do que o outro
- **Menor Igual**: determina se um operador é menor ou igual ao outro

<p>Simbologia</p>

- **Maior**: >
- **Maior Igual**: >=
- **Menor**: <
- **Menor Igual**: <=

## Aula 2 - Operadores Lógicos

### Conceituação

<p>"São síbolos especiais quais são capazes de realizar comparações lógicas entre operadores lógicos ou expressões e, em seguida, retornar um resultado"</p>

<p>Tipos:</p>

- Conjunção
- Disjunção
- Disjunção exclusiva
- Negação

#### Tipos

**Conjunção**: Operação lógica que só é verdadeira quando ambos os operadores ou expressões envolvidas são verdade.

- **Simbologia:** &&
- **Terminologia:** and(e)

<p>O - Operando E - Expressão R - Resultado</p>
  
O-E | O-E | R
:-: | :-: | :-:
V | V | V
V | F | F
F | V | F
F | F | F

**Disjunção**: Operação lógica que só é falsa quando ambos os operadores ou expressões envolvidas são falsos.

- **Simbologia:** ||
- **Terminologia:** or(ou)

<p>O - Operando E - Expressão R - Resultado</p>
  
O-E | O-E | R
:-: | :-: | :-:
V | V | V
V | F | V
F | V | v
F | F | F

**Disjunção exclusiva**: Operação que só é verdade quando ambos os operadores ou expressões envolvidas são opostos.

- **Simbologia:** ^
- **Terminologia:** xor

<p>O - Operando E - Expressão R - Resultado</p>
  
O-E | O-E | R
:-: | :-: | :-:
V | V | F
V | F | V
F | V | v
F | F | F

**Negação**: Operação que inverte o valor lógico de um operando ou expressão.

- **Simbologia:** !
- **Terminologia:** inverção

<p>O - Operando E - Expressão R - Resultado</p>
  
O-E | R
:-: | :-:
V | F
F | V

## Aula 3: Controle de fluxo

### Conceituação

<p>"São estruturas que tem a capacidade de direcionar o fluxo de execução do código"</p>

**Tipos:**

- Decisão: if, if-else,  if-else-if, switch e operador ternário
- Repetição: for, whole, do while
- Interrupção: break, continue e return

### Criação

**Decisão**: estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de execução.

- Operações: if(se), switch(escolha) e operador ternário.

if
~~~~java
if (idade > 18){
    //código
}
~~~~

if-else
~~~~java
if (aprovado){
    //código
} else {
    //código
}
~~~~
if-else-if
~~~~java
if (casado  && temFilhos){
    //código
} else if(casado && semFilhos){
    //código
}else{

}
~~~~

- Operador ternário

~~~~java
condicao ? true : false;
~~~~
_*evitar o uso do operador ternário_

- switch
~~~~java
switch(variavel){
    case 1:
        break;
    case ...:
        break;
    default:
        break;
}
~~~~

### Boas práticas

- Switch é para valores exatos e if para expressões booleanas;
- Evitar usar o default do switch para "cases genéricos";
- Evitar o efeito "flecha" do if's;
- Evitar muitos if's aninhados;
- usar a boa prática da aula 2 para diminuir o tamanho if.

## Aula 04 - Blocos

### Conceituação

<p>É um grupo de 0 ou mais códigos quais trabalham em conjunto para executar uma operação.</p>

**Tipos**
- Locais: dentro de métodos;
- Estáticos: dentro de classes;
- Instância: dentro de classes.