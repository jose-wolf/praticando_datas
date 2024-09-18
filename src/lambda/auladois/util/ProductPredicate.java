package lambda.auladois.util;

import lambda.aulaum.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product p) {
        return p.getPreco() >= 100;
    }
}
