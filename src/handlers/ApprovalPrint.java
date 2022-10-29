package handlers;

public class ApprovalPrint {
    private  ApprovalPrint(){}

    public static void print(){
        System.out.println(LastApproveInfo.getApprover()+ " approved purchase with id " +LastApproveInfo.getProduct().getId()  + " that costs " + LastApproveInfo.getProduct().getCost());
    }
}
