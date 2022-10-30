package print;

import approval.ApprovalSingleResult;

/**
 * Prints the information gathered from a single approve() call- approver,product id,product cost.
 */

public class ApprovalSingleResultPrint {
    private ApprovalSingleResultPrint() {
    }

    public static void print(ApprovalSingleResult singleApproveResult) {
        if (singleApproveResult == null) {
            throw new IllegalArgumentException("Single Approve Unit is null");
        }
        if (singleApproveResult.isApproved()) {
            System.out.println(singleApproveResult.getApprover().getName() +
                    " approved purchase with id " +
                    singleApproveResult.getProduct().getId() +
                    " and cost " +
                    singleApproveResult.getProduct().getCost());
        } else {
            if (singleApproveResult.getApprover().getName().equals("ExecutiveMeeting")) {
                System.out.println("Purchase with id " + singleApproveResult.getProduct().getId() +
                        " that costs " +
                        singleApproveResult.getProduct().getCost() +
                        " requires an approval of executive meeting.");
            } else {

                System.out.println("Purchase with id " +
                        singleApproveResult.getProduct().getId() +
                        " needs approval from higher position than " +
                        singleApproveResult.getApprover().getName());
            }
        }
    }


}
