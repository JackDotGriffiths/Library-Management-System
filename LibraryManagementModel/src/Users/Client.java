/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import java.time.LocalDate;
import librarymanagementmodel.*;
import java.util.*;

/**
 *
 * @author jack-
 */
public class Client extends User{
    
    
    public Client(String uid,String pass,String name, String surname){
        super(uid,pass,name,surname);
    }
    
    private List<Loan> ActiveLoans = new ArrayList<Loan>();
    private List<ExtensionRequest> ActiveExtensionRequests = new ArrayList<ExtensionRequest>();
    
    public void BorrowItem(Resource resource){
        if (resource.Status == "Available"){
            Loan loan = new Loan();
            loan.Loan(resource,"Active",LocalDate.now().toString() , resource.LoanLength);
            resource.Status = "Unavailable";
            ActiveLoans.add(loan);
        }
    }
    
    public void ReturnItem(Loan loan){
        //Finds the specified loan and removes it from ActiveLoans List
        for(Loan activeloan: ActiveLoans){
            if (activeloan == loan){
                ActiveLoans.remove(activeloan);
            }
        }
        loan.DeactivateLoan("Inactive");
    }
    
    public List<Reminder> ViewReminders(){
        ReminderManager reminderManager = new ReminderManager();
        return reminderManager.reminders;
    }
    
    public void RequestResource(String text){
        PurchaseRequest purchaseRequest = new PurchaseRequest();
        purchaseRequest.PurchaseRequest(text);
    }
    
    public void RateResource(Resource resource, int Rating){
        resource.RatingCount += 1;
        resource.RatingTotal += Rating;
    }
    
    public void RequestExtension(Loan loan,int extensionLength){
        ExtensionRequest requestExtension = new ExtensionRequest();
        requestExtension.ExtensionRequest(loan, extensionLength);
    }
    
    public List<Loan> ListLoans(){
        return ActiveLoans;
    }
}
