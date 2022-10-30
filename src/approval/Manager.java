package approval;

import purchase.Type;
import purchase.Product;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Approver {
    public Manager() {
        super("Manager");
    }
    @Override
    protected boolean canApprove(Product product) {
        validateProduct(product);
        Type type = product.getType();
        double cost = product.getCost();

        switch (type) {
            case CONSUMABLES:
                if (cost <= 300) {
                    return true;
                }
                break;
            case CLERICAL:
                if (cost <= 500) {
                    return true;
                }
                break;
            case GADGETS:
                if (cost <= 1000) {
                    return true;
                }
                break;
            case GAMING:
                if (cost <= 3000) {
                    return true;
                }
                break;
            case PC:
                if (cost <= 5000) {
                    return true;
                }
                break;
        }
        return false;
    }
}
