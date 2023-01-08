package loops;

import java.util.Scanner;

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
