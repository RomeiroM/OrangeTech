package loops;

import java.util.Scanner;

class Ex1_NomeEIdade {
    
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
    
}