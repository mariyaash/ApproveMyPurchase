package purchase;

/**
 * A factory used to create an immutable instance of Product object , with its unique id. It starts from 1, in order to
 * each id is a positive value.
 */

public final class ProductGenerator {

    private static int generatedId=1;

    private ProductGenerator(){}

    public static Product createProduct(double cost, Type type){
        return new Product(generatedId++,cost,type);
    }
}
