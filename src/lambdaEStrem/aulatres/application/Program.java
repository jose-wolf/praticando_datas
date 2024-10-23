package lambdaEStrem.aulatres.application;

import lambdaEStrem.aulaum.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",900.00));
        list.add(new Product("Mouse", 80.99));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Pilha", 20.50));
        list.add(new Product("Caneta", 10.0));

        //List<String> nomes = list.stream().map(new UppercaseName()).collect(Collectors.toList());
        //List<String> nomes = list.stream().map(Product::staticUppercaseNome).collect(Collectors.toList());
        //List<String> nomes = list.stream().map(Product::noStaticUppercaseNome).collect(Collectors.toList());

        //Function<Product, String> func = p -> p.getNome().toUpperCase();
        //List<String> nomes = list.stream().map(func).collect(Collectors.toList());

        List<String> nomes = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());

        nomes.forEach(System.out::println);

    }

}

