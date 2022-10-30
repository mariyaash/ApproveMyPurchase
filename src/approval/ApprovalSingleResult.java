package approval;

import purchase.Product;

/**
 * Immutable  class that is used to store information
 * about the Purchase,
 * whether it is approved or not.
 */
public class ApprovalSingleResult {
    private final Approver approver;
    private final boolean isApproved;
    private final Product product;

    public ApprovalSingleResult(Approver approver, boolean isApproved, Product product) {
        this.approver=approver;
        this.isApproved = isApproved;
        this.product = product;
    }

    public  Approver getApprover() {
        return approver;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public Product getProduct() {
        return product;
    }
}
