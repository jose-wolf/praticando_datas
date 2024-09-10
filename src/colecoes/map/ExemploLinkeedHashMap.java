package colecoes.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkeedHashMap {

    public static void main(String[] args) {

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adiciona pares chave-valor ao mapa
        linkedHashMap.put("Maçã", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Abacaxi", 30);



        for (String key : linkedHashMap.keySet()){
            System.out.println(key);
        }
    }

}
