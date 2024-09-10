package colecoes.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        Set<Integer> treeSetA = new TreeSet<>(Arrays.asList(0,2,4,6,8,10,11));
        Set<Integer> treeSetB = new TreeSet<>(Arrays.asList(1,3,5,7,8,9,11));

        System.out.println(treeSetA);
        System.out.println(treeSetB);

        System.out.println("---");
        Set<Integer> treeSetC = new TreeSet<>(treeSetA);
        treeSetC.addAll(treeSetB); //união
        System.out.println(treeSetC);

        System.out.println("----");
        Set<Integer> treeSetD = new TreeSet<>(treeSetA);
        treeSetD.retainAll(treeSetB); //interseção
        System.out.println(treeSetD);

        System.out.println("----");
        Set<Integer> treeSetE = new TreeSet<>(treeSetA);
        treeSetE.removeAll(treeSetB); //diferença
        System.out.println(treeSetE);

    }

}
