package map;

import java.util.Collections;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
/*
Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
modelo = gol - consumo = 14,4 Km/l;
modelo = Uno - consumo = 15,6 Km/l;
modelo = mobi - consumo = 16,1 Km/l;
modelo = hb20 - consumo = 14,5 Km/l;
modelo = kwid - consumo = 15,6 Km/l; 
*/
public static void main(String[] args) {

    //Método put()
    System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos gastos");
    Map<String, Double> carrosPopulares = new HashMap<>(){{
        put("gol", 14.4);
        put("Uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
    }};
    System.out.println(carrosPopulares);

    System.out.println("\nSubstitua o consumo ddo gol por 15,2 Km/l: ");
    carrosPopulares.put("gol",15.2);
    System.out.println(carrosPopulares);

    //Método contrainsKey()
    System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

    //Método get()
    System.out.println("\nExiba o consumo do Uno: "+ carrosPopulares.get("Uno"));

    //Método KeySet
    System.out.println("\nExiba os modelos: "+  carrosPopulares.keySet());
    // ou Set<String> modelos = carrosPopulares.keySet();
    
    //Método values
    System.out.println("\nExiba os consumos dos carros: "+ carrosPopulares.values());
    // ou Set<Double> consumo = carrosPopulares.values();

    System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
    //Método entry()
    Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
    Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
    String modeloMaisEficiente = "";
    for(Map.Entry<String, Double> entry : entries ){
        if(entry.getValue().equals(consumoMaisEficiente)){ 
            modeloMaisEficiente = entry.getKey();
            System.out.println(modeloMaisEficiente + " - "+ consumoMaisEficiente);
        }
    }

    System.out.println("\nExiba o modelo menos econômico e seu consumo: ");
    Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
    String modeloMenosEficiente = "";
    for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
        if(entry.getValue().equals(consumoMenosEficiente)){
            modeloMenosEficiente = entry.getKey();
            System.out.println(modeloMenosEficiente + " - "+ consumoMenosEficiente);
        }
    }

    System.out.println("Exiba a soma dos consumos: ");
    Iterator<Double> iterator = carrosPopulares.values().iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
        soma+= iterator.next();
    }
    System.out.println("Exiba a soma dos consumos: "+ soma);

    System.out.println("Exiba a media dos consumos deste dicionário de carros: "+ (soma/carrosPopulares.size()));

    System.out.println("Remova os modelos com o consumo igual a 15,6 Km/l: ");
    Iterator<Double> iterator1 = carrosPopulares.values().iterator();
    while (iterator1.hasNext()) {
        if(iterator1.next().equals(15.6)) iterator1.remove();
    }
    System.out.println(carrosPopulares);

    System.out.println("Exiba todos os carros na ordem em que foram informados: ");
    Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
        put("gol", 14.4);
        put("Uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
    }};
    System.out.println(carrosPopulares1);

    System.out.println("Exiba o dicionário ordenado pelo modelo: ");
    Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
    System.out.println(carrosPopulares2.toString());

    System.out.println("Apague o dicionario de carros: ");
    carrosPopulares.clear();

    System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());

    }
}
