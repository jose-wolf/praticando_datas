package colecoes.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Melão");
        linkedHashSet.add("Maça");
        linkedHashSet.add("Manga");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Manga");
        linkedHashSet.add("Abacaxi");

        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains("Banana"));


    }

}
