package aula01;

public class Emprestimo {

    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){

        if(parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final com 2 parcelas: "+ valorFinal);
        }else if(parcelas == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final com 3 parcelas: "+ valorFinal);
        }else{
            System.out.println("Quantidades de parcelas não aceitas.");
        }
    }
}
