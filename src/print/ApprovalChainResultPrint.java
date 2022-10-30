package print;

import approval.ApprovalChainResult;
import approval.ApprovalSingleResult;

/**
 * Printing gathered approval information from chained approve method calls.
 */
public class ApprovalChainResultPrint {
    private ApprovalChainResultPrint(){

    }
    public static void print(ApprovalChainResult chainApproveResult){
        if(chainApproveResult==null){
            throw new IllegalArgumentException("ChainApproveResult is null");
        }
        for(ApprovalSingleResult singleApproveResult:chainApproveResult.getUnmodifiableList()){
            ApprovalSingleResultPrint.print(singleApproveResult);
        }
    }

}
