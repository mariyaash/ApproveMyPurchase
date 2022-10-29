import common.Type;
import handlers.*;
import product.Product;
import product.ProductGenerator;

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

        if (manager.approve(product1)){
            ApprovalPrint.print();
        }
        else{

        }
        if(manager.approve(product2)){
            ApprovalPrint.print();
        }
        if(manager.approve(product3)){
            ApprovalPrint.print();
        }
       if(manager.approve(product4)){
           ApprovalPrint.print();
       }
    }
}
