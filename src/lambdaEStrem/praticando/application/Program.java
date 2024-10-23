package lambdaEStrem.praticando.application;

import lambdaEStrem.praticando.entities.Product;
import lambdaEStrem.praticando.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.5));
        list.add(new Product("Hd Case", 80.90));

        ProductService ps = new ProductService();

        double total = ps.filtrarSoma(list, p -> p.getNome().charAt(0) == 'T');

        System.out.println("O valor total dos produtos que comaçam com 'T' é: " + total);;

    }

}
