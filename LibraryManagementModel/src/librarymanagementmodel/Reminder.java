/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementmodel;
import java.util.*;
/**
 *
 * @author jack-
 */
public class Reminder {
    public Loan loan;
    public String SendDate;
    public String ReminderText;
   
    public void Reminder(Loan loanID,String sendDate,String text){
        this.loan = loanID;
        this.SendDate = sendDate;
        this.ReminderText = text;
        
        ReminderManager reminderManager = new ReminderManager();
        reminderManager.AddReminder(this);
    }
    
    
    
}
