package loops;

import java.util.Scanner;

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
