/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import librarymanagementmodel.UserManager;
import Users.*;
import View.*;
import javax.swing.JOptionPane;
/**
 *
 * @author jack-
 */
public class Controller {
    
    
    Login login;
    AdminView adminView;
    ClientView clientView;
    
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
                    case 'C':
                        clientView = new ClientView(this);
                        
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
}
