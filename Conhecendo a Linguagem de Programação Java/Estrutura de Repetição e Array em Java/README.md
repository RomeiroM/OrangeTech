# :star: Estruturas de Repetição e Array em Java

:woman: _Instrutora: [Camila Cavalcante](https://www.linkedin.com/in/cami-la/)_

:computer: Curso disponível na plataforma [DIO](https://web.dio.me/course/estruturas-de-repeticao-e-arrays-em-java/learning/c8f1bd80-21dc-4aa9-b967-a7da11000851?back=/track/orange-tech-backend&tab=undefined&moduleId=undefined)

## :arrows_counterclockwise: Estrutura de Repetição

- O real poder dos computadores está na sua habilidade para repetir uma operação ou uma série de operações várias vezes.
- Cada repetição é chamada laço (loop) é um dos conceitos básicos da programação estruturada.
- **Uma estrutura de repetição permite que uma sequência de comandos seja executada repetidamente, caso determinadas condições sejam satisfeitas.**
- As estruturas de repetição podem ser classificadas em:
  - Repetição com teste no início (while)
  - Repetição com teste no final (do-while)
  - Repetição contada (for)
- O comando _break_ é utilizado para terminar de forma abrupta uma repetição. 
- Quando o comando _continue é executado, os comandos restantes da repetição são ignorados e o programa volta a testar novamente ou não_

### :pencil2: Operadores de incremento e decremento

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

### :pencil2: Operações aritméticas

**Para:** | **Use o atalho:** | **Forma original**
:-------- | :---------------: | :----------------
Somar _k_ unidades ao valor da variável | numero += _k_ | numero = numero + _k_
Subtrair _k_ unidades ao valor da variável | numero -= _k_ | numero = numero - _k_
Multiplicar o valor da variável por _k_ | numero *= _k_ | numero = numero * _k_
Dividir o valor da variável por _k_ | numero /= _k_ | numero = numero / _k_

### :1234: Arrays

- Arraya é um **objeto utilizado para armazenar sequencialmente dados do mesmo tipo**.
- Permanecem com o **mesmo tamanho depois de criados**.


### :white_check_mark: Exercícios Resolvidos

#### :page_with_curl: Exercícios de loop

##### :one: **Nome e Idade**

<p>Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)</p>

**Exemplo de solução :**

~~~~java

public static void nomeIdade(String nome, int idade){
    Scanner scan = new Scanner(System.in);
    while(true){
        System.out.print("Nome: ");
        nome = scan.next();
        if (nome.equals("0")) break;
            
        System.out.print("Idade: ");
        idade = scan.nextInt();

    }
}
~~~~

##### :two: **Nota**

<p>Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.</p>

**Exemplo de solução :**

~~~~java
public class Ex2_Nota {
    public static void nota(int nota){

        Scanner scan = new Scanner(System.in);

        System.out.print("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.print("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

        scan.close();
    }
}
~~~~

##### :three: **Maior e Média**

<p>Faça um programa que leia 5 números e informe o  maior número e a média desses números.</p>

**Exemplo de solução :**

~~~~java
public class Ex3_MaiorEMedia {

    public static void maiorEMenor(int numero, int maior) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int count = 0;
        do {
            System.out.print("Numero: ");
            numero = scan.nextInt();

            soma = numero + soma;
            if (numero> maior) maior = numero;

            count+= 1;
        } while (count < 5);

        System.out.println("Maior: "+ maior);
        System.out.println("Média: "+ (soma/5));
        scan.close();
    }
}

~~~~

##### :four: **Par e Impar**

<p>Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.</p>

**Exemplo de solução :**

~~~~java
public class Ex4_ParEImpar {

    public static void parEImpar() {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0, quantPares = 0, quantImpares = 0;

        System.out.print("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade Par: "+ quantPares);
        System.out.println("Quantidade Impar: "+ quantImpares);
    }
}
~~~~

##### :five: **Tabuada**

<p>Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:</p>

<p>Tabuada do 5:</p>
<p>5 X 1 = 5</p>
<p>5 X 2 = 10</p>
<p>. . .</p>
<p>5 X 10 = 50</p>

**Exemplo de solução :**

~~~~java
public class Ex5_Tabuada {
    public static void tabuada() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tabuada do : ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do "+ tabuada);

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada+" X "+i+" = "+(i*tabuada));
        }
    }
}
~~~~

##### :six: **Fatorial**

<p>Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.</p>
<p>Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)</p>

**Exemplo de solução :**

~~~~java
public class Ex6_Fatorial {
    public static void fatorial() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Número: ");
        int numFatorial = scan.nextInt();
        int fatorial=1;

        for(int i = numFatorial ; i > 0; i--){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
}

~~~~

#### :page_with_curl: Exercícios de array

##### :one: **Ordem Inversa**
<p> Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.</p>

**Exemplo de solução :**

~~~~java
public class Ex1_OrdemInversa {
    public static void main(String[] args){

        int[] vetor = {0, -5, 15, 50, 8, 4};

        int count = 0;
        while (count < vetor.length) {
            System.out.print(vetor[count]+" ");
            count++;
        }
        System.out.println("\nVetor inverso ");
        for(int i =(vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i]+" ");
        }
    }
}
~~~~

##### :two: **Consoantes**
<p> Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.</p>

**Exemplo de solução :**

~~~~java
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoante = 0;
        int count = 0;
        do {

            System.out.print("Letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a")|
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") | 
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u"))){
                consoantes[count]= letra;
                quantidadeConsoante++;
            }
            count++;
        } while (count < consoantes.length);

        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante+" ");
            }
        }
        System.out.println("\nQuantidade de consoantes: "+ quantidadeConsoante);
        scan.close();
    }
}
~~~~

##### :three: **Números Aleatórios**
<p> Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final mostre os números e seus sucessores.</p>

**Exemplo de solução :**

~~~~java
import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for (int num : numerosAleatorios) {
            System.out.print(num+" ");
        }

        System.out.println("\nSucessores dos números aleatórios: ");
        for (int num : numerosAleatorios) {
            System.out.print((num+1)+" ");
        }
    }
}

~~~~

##### :four: **Array Multidimencional**
<p> Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.</p>

**Exemplo de solução :**

~~~~java
import java.util.Random;

public class Ex4_ArrayMultidimencional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna+" ");
            }
            System.out.println(" ");
        }
    }
}
~~~~
