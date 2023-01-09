package aula01;

public class Calculadora {

    public static void soma(double numero1, double numero2){
        double resultado =  numero1 + numero2;
        System.out.println(numero1 +" + "+numero2+" = "+resultado);
    }

    public static void subtrai(double numero1, double numero2){
        double resultado =  numero1 - numero2;
        System.out.println(numero1 +" - "+numero2+" = "+resultado);
    }

    public static void multiplica(double numero1, double numero2){
        double resultado =  numero1 * numero2;
        System.out.println(numero1 +" * "+numero2+" = "+resultado);
    }

    public static void divide(double numero1, double numero2){
        double resultado =  numero1 / numero2;
        System.out.println(numero1 +" / "+numero2+" = "+resultado);
    }
    
}
