package colecoes.map;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Example1");
        cookies.put("email", "Example1@gmail.com");
        cookies.put("telefone", "91234-5678");

        cookies.remove("email");
        cookies.put("telefone", "98765-4321");

        System.out.println("Contains 'telefone' key: " + cookies.containsKey("telefone"));

        System.out.println("Número do telefone: " + cookies.get("telefone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Tamanho: " + cookies.size());


        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }

}
