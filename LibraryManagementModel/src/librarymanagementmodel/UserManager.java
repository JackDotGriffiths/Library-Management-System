/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementmodel;
import Users.User;
import java.util.*;

/**
 *
 * @author jack-
 */
public class UserManager {
    
    private static UserManager single_instance = null;
    private ArrayList<User> users = new ArrayList<User>(); 
    
    
    private int numAdmin = 0;
    private int numClient = 0;
    
    public ArrayList<User> getUsers() {
        return users;
    }
     
     public void NewUser(User newUser){ 
        users.add(newUser);   
    }
     
    public static UserManager getInstance()
    {
        if (single_instance == null) 
            single_instance = new UserManager(); 
  
        return single_instance;
    }
    
    public String generateUserId(char type)
    {
        String newID = "";
        
        switch(type){
            case 'A':
                newID = String.format("A%04d",numAdmin);
                numAdmin++;
                break;
            case 'C':
                newID = String.format("C%04d",numClient);
                numClient++;
                break;
        }
        
        
        return newID;
    }
}
