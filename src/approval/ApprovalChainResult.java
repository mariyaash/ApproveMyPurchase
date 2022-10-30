package approval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Information from chained approve() calls. List of single approvals
 * used to realize who the exact approval is.
 */
public class ApprovalChainResult {
    private final List<ApprovalSingleResult>singleApproveResultList=new ArrayList<>();

    List<ApprovalSingleResult> getModifiableList() {
        return singleApproveResultList;
    }
    public List<ApprovalSingleResult>getUnmodifiableList(){
        return Collections.unmodifiableList(singleApproveResultList);
    }

}
