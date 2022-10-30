package purchase;

/**
 * Stores information about purchase characteristics( unique id, cost and type of the exact purchase).
 */
public class Product {
    private final int id;
    private double cost;
    private final Type type;

    Product(int id, double cost, Type type) {
        this.id = id;
        this.cost = cost;
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public Type getType() {
        return type;
    }

    public int getId() {
        return id;
    }
}
