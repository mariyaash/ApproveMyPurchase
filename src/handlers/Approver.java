package handlers;

import product.Product;

public abstract class Approver {
    protected Approver next;
    private Product lastApproved;

    /**
     * If needed, be free to change signature of abstract methods.
     */
    public abstract boolean approve(Product product);

    protected abstract boolean canApprove(Product product);

    /**
     * Method used for registering next approver level.
     * DO NOT CHANGE IT.
     */
    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }
}
