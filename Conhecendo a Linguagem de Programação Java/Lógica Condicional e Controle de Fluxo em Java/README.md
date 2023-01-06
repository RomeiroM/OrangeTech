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