package purchase;

/**
 * This is like a factory used to create an immutable instance of Product object , with its unique id. It starts from 1.
 */

public final class ProductGenerator {

    private static int generatedId=1;

    private ProductGenerator(){}

    public static Product createProduct(double cost, Type type){
        return new Product(generatedId++,cost,type);
    }
}
