package arrays;

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
