/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementmodel;
import Users.*;

/**
 *
 * @author jack-
 */
public class PurchaseRequest {
    public String Title;
    
    public void PurchaseRequest(String title){
        this.Title = title;
        Admin admin = new Admin();
        admin.addRequest(this);
    }
}
