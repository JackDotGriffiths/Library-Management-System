/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementprogram;
import librarymanagementmodel.UserManager;
import Controller.Controller;
import Users.*;
import View.Login;

/**
 *
 * @author jack-
 */
public class LibraryManagementProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UserManager userManager = UserManager.getInstance();
        
        Controller cont = new Controller();
        
        Login login = new Login(cont);
        
        login.setVisible(true);
      
        
        Admin admin = new Admin(userManager.generateUserId('A'), "admin0", "Mike", "Wazowski");
        
        userManager.NewUser(admin);
        
        Client client1 = new Client(userManager.generateUserId('C'), "client1", "Jane", "Fonda");
        Client client2 = new Client(userManager.generateUserId('C'), "client2", "Buzz", "Lightyear");      
        Client client3 = new Client(userManager.generateUserId('C'), "client3", "Stephen", "Fry");       
        Client client4 = new Client(userManager.generateUserId('C'), "client4", "Jack", "Griffiths");      
        Client client5 = new Client(userManager.generateUserId('C'), "client5", "John", "Smith");
        
        userManager.NewUser(client1);
        userManager.NewUser(client2);
        userManager.NewUser(client3);
        userManager.NewUser(client4);
        userManager.NewUser(client5);
        
        
    }
    
}
