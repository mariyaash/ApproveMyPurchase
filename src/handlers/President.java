package handlers;

import common.Type;
import product.Product;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver{
    @Override
    public boolean approve(Product product) {
        if(canApprove(product)){
            LastApproveInfo.setProduct(product);
            LastApproveInfo.setApprover("President");
            return true;
        }
        return next.approve(product);
    }

    @Override
    protected boolean canApprove(Product product) {
        if(product==null){
            return false;
        }
        Type type = product.getType();
        double cost = product.getCost();

        switch (type) {
            case CONSUMABLES:
                if (cost <= 1000) {
                    return true;
                }
                break;
            case CLERICAL:
                if (cost <= 2000) {
                    return true;
                }
                break;
            case GADGETS:
                if (cost <= 3000) {
                    return true;
                }
                break;
            case GAMING:
                if (cost <= 5000) {
                    return true;
                }
                break;
            case PC:
                if (cost <= 8000) {
                    return true;
                }
                break;
        }
        return false;
    }
}
