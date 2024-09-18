package lambda.praticando.service;

import lambda.praticando.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filtrarSoma(List<Product> listProduct, Predicate<Product> criterio){
        double soma = 0.0;
        for (Product p : listProduct){
            if (criterio.test(p)){
                soma += p.getPreco();
            }
        }
        return soma;
    }

}
