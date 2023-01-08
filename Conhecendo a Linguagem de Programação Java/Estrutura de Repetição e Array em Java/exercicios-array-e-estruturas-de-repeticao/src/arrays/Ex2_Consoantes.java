package arrays;

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
