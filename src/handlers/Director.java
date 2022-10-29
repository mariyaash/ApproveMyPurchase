package handlers;

import common.Type;
import product.Product;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Approver {

    @Override
    public boolean approve(Product product) {
        if (canApprove(product)) {
            // System.out.println("Director approved purchase with id " + id + " that costs " + cost);
            LastApproveInfo.setProduct(product);
            LastApproveInfo.setApprover("Director");
            return true;
        }

        //System.out.println("Purchase with id " + id + " needs approval from higher position than Director.");
        return next.approve(product);
    }

    @Override
    protected boolean canApprove(Product product) {
        if (product == null) {
            return false;
        }
        Type type = product.getType();
        double cost = product.getCost();

        switch (type) {
            case CONSUMABLES:
                if (cost <= 500) {
                    return true;
                }
                break;
            case CLERICAL:
                if (cost <= 1000) {
                    return true;
                }
                break;
            case GADGETS:
                if (cost <= 1500) {
                    return true;
                }
                break;
            case GAMING:
                if (cost <= 3000) {
                    return true;
                }
                break;
            case PC:
                if (cost <= 6000) {
                    return true;
                }
                break;
        }
        return false;
    }
}
