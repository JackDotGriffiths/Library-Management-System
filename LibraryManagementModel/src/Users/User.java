/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import java.util.List;
import LibraryManagementModel.*;
import java.util.ArrayList;
/**
 *
 * @author jack-
 */
public abstract class User{
    
    protected String uniqueID;
    protected String password;
    protected String givenName;
    protected String surname;
    
    public void setUniqueID(String ID)
    {
        this.uniqueID = ID;
    }
    
    public String getUniqueID(){
        return uniqueID;
    }
    
    public String GetPassword(String uniqueID){
        return password;
    }
    
    public String GetName(){
        String name = givenName + " " + surname;
        return name;
    }
    
}
