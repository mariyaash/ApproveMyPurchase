package handlers;

import product.Product;

public class LastApproveInfo {
    private static Product product;
    private static String approver;

    private LastApproveInfo(){}


    public static Product getProduct() {
        return product;
    }

    public static void setProduct(Product product) {
        LastApproveInfo.product = product;
    }

    public static String getApprover() {
        return approver;
    }

    public static void setApprover(String approver) {
        LastApproveInfo.approver = approver;
    }
}
