package lambdaEStrem.auladois.application;

import lambdaEStrem.aulaum.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",900.00));
        list.add(new Product("Mouse", 80.99));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Pilha", 20.50));
        list.add(new Product("Caneta", 10.0));

        //list.removeIf(p -> p.getPreco() >= 100);
        //list.removeIf(new ProductPredicate()); implementando a interface
        //list.removeIf(Product::staticProductPredicate); referencia por método estático
       // list.removeIf(Product::noStaticProductPredicate); referencia por método não estático

//        Predicate<Product> pred = p -> p.getPreco() >= 100; expressão lambdaEStrem declarada
//        list.removeIf(pred);

        list.removeIf(p -> p.getPreco() >= 100.0);

        for(Product p : list){
            System.out.println(p);
        }

    }

}
