package print;

import approval.ApprovalSingleResult;

/**
 * Prints the information gathered from a single approve() call- approver,product id,product cost.
 */

public class ApprovalSingleResultPrint {
    private ApprovalSingleResultPrint() {
    }

    public static void print(ApprovalSingleResult approvalSingleResult) {
        if (approvalSingleResult == null) {
            throw new IllegalArgumentException("ApprovalSingleResult is null!");
        }
        if (approvalSingleResult.isApproved()) {
            System.out.println(approvalSingleResult.getApprover().getName() +
                    " approved purchase with id " +
                    approvalSingleResult.getProduct().getId() +
                    " and cost " +
                    approvalSingleResult.getProduct().getCost());
        } else {
            if (approvalSingleResult.getApprover().getName().equals("ExecutiveMeeting")) {
                System.out.println("Purchase with id " + approvalSingleResult.getProduct().getId() +
                        " that costs " +
                        approvalSingleResult.getProduct().getCost() +
                        " requires an approval of executive meeting.");
            } else {

                System.out.println("Purchase with id " +
                        approvalSingleResult.getProduct().getId() +
                        " needs approval from higher position than " +
                        approvalSingleResult.getApprover().getName());
            }
        }
    }


}
