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
    
    private ArrayList<Loan> Loans = new ArrayList<Loan>();
    
    
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
                        adminView = new AdminView(this);
                        adminView.setVisible(true);
                        adminView.LoadAllResources();
                        System.out.println("Admin LOGIN");
                        currentlyLoggedIn = user;
                        break;
                    case 'C':
                        clientView = new ClientView(this);
                        clientView.setVisible(true);
                        clientView.LoadAllResources();
                        System.out.println("Client LOGIN");
                        currentlyLoggedIn = user;
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
    
}
