package loops;
import java.util.Scanner;

/**
 * Ex4_ParEImpar
 */
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