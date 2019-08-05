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
    private AdminView adminView = new AdminView(this);
    private ClientView clientView = new ClientView(this);
    
    
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
                        adminView.setVisible(true);
                        adminView.LoadAllResources();
                        System.out.println("Admin LOGIN");
                        currentlyLoggedIn = user;
                        break;
                    case 'C':
                        clientView.setVisible(true);
                        clientView.LoadAllResources();
                        System.out.println("Client LOGIN");
                        currentlyLoggedIn = user;
                        break;
                }
            }
        }
        if(!correctLogin)
        {
            JOptionPane.showMessageDialog(null, "Incorrect Login", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void LoanItem(User user,Resource resource){
        Loan newLoan = new Loan(user,resource,"Active",LocalDate.now(),resource.LoanLength);
        Loans.add(newLoan);
        LocalDate returnDate = LocalDate.now().plusDays(resource.LoanLength);
        thisResourceManager.updateStatus(resource, "Due :" + returnDate.toString());
    }
}
