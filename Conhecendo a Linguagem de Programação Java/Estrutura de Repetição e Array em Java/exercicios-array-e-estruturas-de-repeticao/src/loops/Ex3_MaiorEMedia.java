package loops;

import java.util.Scanner;

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
