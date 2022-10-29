package product;

import common.Type;
import product.Product;

public final class ProductGenerator {

    private static int generatedId;

    private ProductGenerator(){}

    public static Product createProduct(double cost, Type type){
        return new Product(generatedId++,cost,type);
    }
}
