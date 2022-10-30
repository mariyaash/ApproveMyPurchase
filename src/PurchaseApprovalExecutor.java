import print.ApprovalChainResultPrint;
import purchase.Type;
import approval.*;
import purchase.Product;
import purchase.ProductGenerator;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line
        Product product1= ProductGenerator.createProduct(15000,Type.CONSUMABLES);
        Product product2= ProductGenerator.createProduct(5000, Type.PC);
        Product product3= ProductGenerator.createProduct(5000, Type.PC);
        Product product4= ProductGenerator.createProduct(3000, Type.CLERICAL);
        ApprovalChainResult result=new ApprovalChainResult();
        manager.approve(product1,result);
        manager.approve(product2,result);
        manager.approve(product3,result);
        manager.approve(product4,result);
        ApprovalChainResultPrint.print(result);
    }
}
