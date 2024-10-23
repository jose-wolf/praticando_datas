package lambdaEStrem.aulatres.util;

import lambdaEStrem.aulaum.entities.Product;

import java.util.function.Function;

public class UppercaseName implements Function<Product,String> {

    @Override
    public String apply(Product p) {
        return p.getNome().toUpperCase();
    }

}
