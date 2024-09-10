package colecoes.set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSET {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Melão");
        hashSet.add("Maçã");
        hashSet.add("Manga");
        hashSet.add("Banana");
        hashSet.add("Manga");


        for (String conjunto : hashSet){
            System.out.println(conjunto);
        }

        System.out.println("-----");
        System.out.println("Possui " + hashSet.size() + " elementos");

        hashSet.add("Kiwi");
        hashSet.remove("Maça");
        System.out.println("-----");

        for (String conjunto : hashSet){
            System.out.println(conjunto);
        }
        System.out.println("-----");

        hashSet.removeIf(x  -> x.charAt(0) == 'M');

        for (String conjunto : hashSet){
            System.out.println(conjunto);
        }

    }

}
