package print;

import approval.ApprovalChainResult;
import approval.ApprovalSingleResult;

/**
 * Printing gathered approval information from chained approve method calls.
 */
public class ApprovalChainResultPrint {
    private ApprovalChainResultPrint(){

    }
    public static void print(ApprovalChainResult approvalChainResult){
        if(approvalChainResult==null){
            throw new IllegalArgumentException("ChainApproveResult is null!");
        }
        for(ApprovalSingleResult approvalSingleResult:approvalChainResult.getUnmodifiableList()){
            ApprovalSingleResultPrint.print(approvalSingleResult);
        }
    }

}
