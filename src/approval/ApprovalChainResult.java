package approval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Information from chained approve() calls.
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
