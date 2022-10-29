package product;

import common.Type;

public class Product {
    private final int id;
    private double cost;
    private Type type;

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
