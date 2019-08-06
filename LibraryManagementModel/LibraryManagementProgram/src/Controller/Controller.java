/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import librarymanagementmodel.*;
import Users.*;
import View.*;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author jack-
 */
public class Controller {
    
    private ResourceManager thisResourceManager = ResourceManager.getInstance();
    AdminView adminView;
    ClientView clientView;
    Login login;
    
    public Boolean WeekReminder = false;
    public Boolean OverdueReminder = false;
    public Boolean BlockReminder = false;
    
    private ArrayList<Loan> Loans = new ArrayList<Loan>();
    private ArrayList<Reminder> Reminders = new ArrayList<Reminder>(); 
    private ArrayList<ExtensionRequest> ExtensionRequests = new ArrayList<ExtensionRequest>();
    
    public User currentlyLoggedIn;
    UserManager userManager = UserManager.getInstance();
    
    
    public void Login(String userId,String password){
        
        Boolean correctLogin = false;
        
        for(User user : userManager.getUsers())
        {
            if (user.getUniqueID().equals(userId) && user.getPassword().equals(password)){
                correctLogin = true;      
                switch(user.getUniqueID().charAt(0)){
                    case 'A':
                        currentlyLoggedIn = user;
                        adminView = new AdminView(this);
                        adminView.setVisible(true);
                        adminView.LoadAllResources();
                        System.out.println("Admin LOGIN");
                        break;
                    case 'C':
                        currentlyLoggedIn = user;
                        clientView = new ClientView(this);
                        clientView.setVisible(true);
                        clientView.LoadAllResources();
                        System.out.println("Client LOGIN");
                        break;
                    default:
                        break;
                }
            }
        }
        if(!correctLogin)
        {
            JOptionPane.showMessageDialog(null, "Incorrect Login", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Logout(){
        currentlyLoggedIn = null;
        login.setVisible(true);
    }

    public void LoanItem(User user,Resource resource){
        Loan newLoan = new Loan(user,resource,"Active",LocalDate.now(),resource.LoanLength);
        Loans.add(newLoan);
        LocalDate returnDate = LocalDate.now().plusDays(resource.LoanLength);
        thisResourceManager.updateStatus(resource, "Return Date: " + returnDate.toString());
    }
    public ArrayList<Loan> getActiveLoans(){   
        return Loans;
    }
    public ArrayList<Loan> getLoansForUser(User user){
        ArrayList<Loan> listLoans = new ArrayList<Loan>();
        for(Loan loan : Loans){
            if (loan.user == user && loan.LoanStatus == "Active"){
                listLoans.add(loan);
            }
        }  
        return listLoans;
    }
    public void updateLoanLength(Loan loan, int Addition){
        int count = 0;
        for(Loan searchLoan : getActiveLoans()){
            if(searchLoan == loan){
                loan.LoanLength = loan.LoanLength + Addition;
                Loans.set(count, loan);
            }
            count ++;
        }
    }
 
    public void ReturnItem(Loan returnLoan){
        returnLoan.LoanStatus = "Disabled";
        
        //Disables the Loan in ArrayList Loans
        int count = 0;
        for(Loan loan: Loans){
            if (loan == returnLoan){
                Loans.set(count, returnLoan);
            }
            count ++;
        }
        //Change Resource to be available
        thisResourceManager.updateStatus(returnLoan.resource, "Available");
    }
    
    public void SendReminder(User user, String type,LocalDate date,String message){ 
        Reminder newReminder = new Reminder(user,type,date,message);
        Reminders.add(newReminder);
    }
    public ArrayList<Reminder> getReminders(){
        return Reminders;
    }
    public void SendAutoReminders(){
        int count = 0;
        for (Reminder reminder : getReminders()){
            if (reminder.Type == "OverdueWarning"){
                Reminders.remove(count);
            }
            count++;
        }
        for(Loan loan : getActiveLoans()){
            LocalDate DueDate = loan.DateLoaned.plusDays(loan.LoanLength);
            long Days = DAYS.between(LocalDate.now(), DueDate);
            
            if (Days == 7 && WeekReminder == true){
                SendReminder(loan.user,"OverdueWarning",LocalDate.now(),"AUTOREMINDER : A week before " + loan.resource.Name + " is due back.");
            }
            else if(Days < 0 && Days > -20 && OverdueReminder == true){
                SendReminder(loan.user,"OverdueWarning",LocalDate.now(),"AUTOREMINDER : " + loan.resource.Name + " is now overdue.");
            }
            else if(Days < -20 && BlockReminder == true){
                SendReminder(loan.user,"OverdueWarning",LocalDate.now(),"AUTOREMINDER : " + loan.resource.Name + " is now 20 Days overdue. You are unable to loan more items.");
            }
        }
    }
    
    public void CreateExtensionRequest(Loan loan,int length){
        ExtensionRequest extReq = new ExtensionRequest(loan,length);
        ExtensionRequests.add(extReq);
    }
    public ArrayList<ExtensionRequest> getExtensionRequests(){
        return ExtensionRequests;
    }
    public void RemoveExtensionRequest(ExtensionRequest extReq){
        for(ExtensionRequest searchExtReq : getExtensionRequests()){
            if(searchExtReq == extReq){
                ExtensionRequests.remove(extReq);
            }
        }
    }
    
    
    
}
