# Estruturas de Repetição e Array em Java

_Instrutora: [Camila Cavalcante](https://www.linkedin.com/in/cami-la/)_

Curso disponível na plataforma [DIO](https://web.dio.me/course/estruturas-de-repeticao-e-arrays-em-java/learning/c8f1bd80-21dc-4aa9-b967-a7da11000851?back=/track/orange-tech-backend&tab=undefined&moduleId=undefined)

## Estrutura de Repetição

- O real poder dos computadores está na sua habilidade para repetir uma operação ou uma série de operações várias vezes.
- Cada repetição é chamada laço (loop) é um dos conceitos básicos da programação estruturada.
- **Uma estrutura de repetição permite que uma sequência de comandos seja executada repetidamente, caso determinadas condições sejam satisfeitas.**
- As estruturas de repetição podem ser classificadas em:
  - Repetição com teste no início (while)
  - Repetição com teste no final (do-while)
  - Repetição contada (for)
- O comando _break_ é utilizado para terminar de forma abrupta uma repetição. 
- Quando o comando _continue é executado, os comandos restantes da repetição são ignorados e o programa volta a testar novamente ou não_

### Operadores de incremento e decremento

**Pré-Fixados:**

**Para:** | **Use o atalho:** | **Forma original**
:-------- | :---------------: | :----------------
Soma uma unidade ao valor da variável | ++numero | numero = numero + 1; (retorne numero)
Subtrai uma unidade do valor da variável | --numero | numero = numero - 1; (retorne numero)

**Prós-Fixados:**

**Para:** | **Use o atalho:** | **Forma original**
:-------- | :---------------: | :----------------
Soma um ao valor da variável, retornando o valor original | numero++ | (retorne numero) numero = numero + 1; 
Subtrai um do valor da variável, retornando o valor original | numero-- | (retorne numero) numero = numero - 1;

### Operações aritméticas

**Para:** | **Use o atalho:** | **Forma original**
:-------- | :---------------: | :----------------
Somar _k_ unidades ao valor da variável | numero += _k_ | numero = numero + _k_
Subtrair _k_ unidades ao valor da variável | numero -= _k_ | numero = numero - _k_
Multiplicar o valor da variável por _k_ | numero *= _k_ | numero = numero * _k_
Dividir o valor da variável por _k_ | numero /= _k_ | numero = numero / _k_

### Arrays

- Arraya é um **objeto utilizado para armazenar sequencialmente dados do mesmo tipo**.
- Permanecem com o **mesmo tamanho depois de criados**.
