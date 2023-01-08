package loops;

import java.util.Scanner;

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
