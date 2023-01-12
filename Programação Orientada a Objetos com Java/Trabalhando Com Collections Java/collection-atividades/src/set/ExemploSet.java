package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas de um aluno(7, 8.5, 9.3, 5, 7, 0, 3.6), faça:

        //System.out.println("Crie uma lista e adicione sete notas.");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 5d,7d,0d,3.6,9.3)); 
        System.out.println(notas);
 
        System.out.println("Confira se a nota 5.0 está na lista: "+ notas.contains(5d));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));

        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

       //System.out.println("Exiba a soma dos valores: ");
       Iterator<Double> iterator = notas.iterator();
       Double soma=0d;
       while(iterator.hasNext()){//hasNext verifica se tem mais elementos na proxima posição da lista
           Double next = iterator.next();
           soma += next;
       }
       System.out.println("Exiba a soma dos valores: "+ soma);

       System.out.println("Exiba a média das notas: "+ (soma/notas.size()));

       System.out.println("remova a nota 0: ");
       notas.remove(0d);
       System.out.println(notas);

       
       System.out.println("Remova as notas menores que 7 e exiba a lista: ");
       Iterator<Double> iterator1 = notas.iterator();
       while(iterator1.hasNext()) {
           Double next = iterator1.next();
           if(next <7) iterator1.remove();
       }
       System.out.println(notas);

       System.out.println("Exiba todas as notas na ordem que foram informados");
       Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 5d,7d,0d,3.6,9.3));
       System.out.println(notas2);

       System.out.println("Exiba todas as notas em ordem crescente: ");
       Set<Double> notas3 = new TreeSet<>(notas2);
       System.out.println(notas3);

       System.out.println("Apague toda a lista: ");
       notas.clear();
       System.out.println(notas);
       
       System.out.println("Confira se a lista está vazia: "+ notas.isEmpty());
   
    }
}
