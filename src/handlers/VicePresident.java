package handlers;

import common.Type;
import product.Product;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver{
    @Override
    public boolean approve(Product product) {
        if(canApprove(product)){
            LastApproveInfo.setProduct(product);
            LastApproveInfo.setApprover("VicePresident");
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
                if (cost <= 700) {
                    return true;
                }
                break;
            case CLERICAL:
                if (cost <= 1500) {
                    return true;
                }
                break;
            case GADGETS:
                if (cost <= 2000) {
                    return true;
                }
                break;
            case GAMING:
                if (cost <= 4500) {
                    return true;
                }
                break;
            case PC:
                if (cost <= 6500) {
                    return true;
                }
                break;
        }

        return false;
    }
}
