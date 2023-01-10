package aula03;

public class Main {
    public static void main(String[] args) {
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área: "+ areaQuadrado);
        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Área: "+ areaRetangulo);
        double areaTrapezio = Quadrilatero.area(7, 8, 9); 
        System.out.println("Área: "+ areaTrapezio);
    }
}
