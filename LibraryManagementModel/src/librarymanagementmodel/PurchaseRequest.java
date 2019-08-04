/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementmodel;
import Users.*;import java.util.ArrayList;
;

/**
 *
 * @author jack-
 */
public abstract class PurchaseRequest {
    
    public String Title;
    private ArrayList<PurchaseRequest> purchaseRequests;
    
    public void PurchaseRequest(String title){
        this.Title = title;
        purchaseRequests.add(this);
    }
}
