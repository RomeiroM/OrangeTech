package aula01;

public class Main {
    public static void main(String[] args) {
        //Calculadora
        Calculadora.soma(3, 6);
        Calculadora.subtrai(9, 1.5);
        Calculadora.multiplica(7, 5);
        Calculadora.divide(78, 4);

        //Menssagem
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(2);
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(30);

        //Emprestimo
        Emprestimo.calcular(100, 2);
        Emprestimo.calcular(100, 3);
        Emprestimo.calcular(100, 4);
    }
}
