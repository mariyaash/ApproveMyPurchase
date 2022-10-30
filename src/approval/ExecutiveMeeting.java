package approval;

import purchase.Product;

/**
 * Used as a fallback in approval chain.
 * Should not contain any additional logic.
 * If abstract methods are changed, be free to edit signatures.
 */
public class ExecutiveMeeting extends Approver {
    public ExecutiveMeeting(){
        super("ExecutiveMeeting");
    }
    private static final ExecutiveMeeting INSTANCE = new ExecutiveMeeting();

    public static ExecutiveMeeting getInstance() {
        return INSTANCE;
    }

    @Override
    protected boolean canApprove(Product product) {
        validateProduct(product);
        return false;
    }
}
