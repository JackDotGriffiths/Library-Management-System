/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementmodel;
import Users.*;
import java.util.ArrayList;
;

/**
 *
 * @author jack-
 */
public class PurchaseRequest {
    
    private static PurchaseRequest single_instance = null;
    public String Title;
    private ArrayList<PurchaseRequest> purchaseRequests;
    
    public static PurchaseRequest getInstance()
    {
        if (single_instance == null) 
            single_instance = new PurchaseRequest(); 
  
        return single_instance;
    }
    
    public void PurchaseRequest(String title){
        this.Title = title;
        purchaseRequests.add(this);
    }
}
