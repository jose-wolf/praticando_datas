package colecoes.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Maçã", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Abacaxi", 30);


        System.out.println(hashMap.containsKey("Kiwi"));
        System.out.println("Tamanho: " + hashMap.size());

        hashMap.put("Laranja", 150);

        System.out.println("Quantidade de Abacaxi: " + hashMap.get("Abacaxi"));

        System.out.println(hashMap.remove("Banana"));

        for (String key : hashMap.keySet()){
            System.out.println(key + " - " + hashMap.get(key));
        }

    }

}
