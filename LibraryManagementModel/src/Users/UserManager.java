/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import java.util.*;

/**
 *
 * @author jack-
 */
public class UserManager {
    
    private ArrayList<User> users = new ArrayList<User>();  
    
    public ArrayList<User> getUsers() {
        return users;
    }
     
     public void NewUser(String uid, String password, String givenName, String surname){
        User user = new User();
        user.User(uid, password, surname, surname);
        
    }
}
