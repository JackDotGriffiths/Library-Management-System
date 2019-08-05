/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import librarymanagementmodel.*;
import java.util.*;

/**
 *
 * @author jack-
 */
public class Admin extends User{
    
    
    public Admin(String uid,String pass,String name, String surname){
        super(uid,pass,name,surname);
    }
    
    
    private List<PurchaseRequest> purchaseRequests = new ArrayList<PurchaseRequest>();
    
    
    public void SendReminder(Loan loan, String date,String text){
        Reminder reminder = new Reminder();
        reminder.Reminder(loan, date, text);
    }
    
    public List<PurchaseRequest> ReadRequests(){
        return purchaseRequests;
    }
    
    public void addRequest(PurchaseRequest request){
       try{
              purchaseRequests.add(request);
       }
       catch (Exception e){
           System.out.println("ERROR: " + e);
       }
               
                 
    }
    
    public void RequestResourceReturn(Loan loan, String date){
        try{
            Reminder reminder = new Reminder();
        String text = "We request that you return the specified book by the attatched date";
        reminder.Reminder(loan, date, text);
        }
       catch (Exception e){
           System.out.println("ERROR: " + e);
       }
    }
    
    public void ApproveExtensionRequest(ExtensionRequest extensionRequest){
        try{
            extensionRequest.Status = "Approved";
            extensionRequest.loan.resource.LoanLength = extensionRequest.loan.resource.LoanLength + extensionRequest.ExtensionLength;
        }
       catch (Exception e){
           System.out.println("ERROR: " + e);
       }
    }
    
    public void DenyExtensionRequest(ExtensionRequest extensionRequest){
        try{
            extensionRequest.Status = "Rejected";
        }
        catch (Exception e){
           System.out.println("ERROR: " + e);
       }
    }
    
}
