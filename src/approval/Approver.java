package approval;

import purchase.Product;

public abstract class Approver {
    protected Approver next;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    /**
     * If needed, be free to change signature of abstract methods.
     */

    /**
     *Method that approves a purchase. The result is appended in ChainApproveResult.
     */
    public void approve(Product product, ApprovalChainResult chainApproveResult){
        boolean isApproved=false;
        if(canApprove(product)){
            isApproved=true;
        }
        chainApproveResult.getModifiableList().add(new ApprovalSingleResult(this,isApproved,product));
        if(!isApproved&&next!=null){
            next.approve(product,chainApproveResult);
        }
    }

    protected boolean canApprove(Product product){
        validateProduct(product);
        return false;
    }
    public void validateProduct(Product product){
        if(product==null){
            throw new IllegalArgumentException("Product is not valid.");
        }
    }

    /**
     * Method used for registering next approver level.
     * DO NOT CHANGE IT.
     */
    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }
}
