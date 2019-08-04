/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import librarymanagementmodel.UserManager;
import Users.*;
import View.*;
import javax.swing.*;
/**
 *
 * @author jack-
 */
public class Controller {
    
    private AdminView adminView = new AdminView(this);
    private ClientView clientView = new ClientView(this);
    
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
}
