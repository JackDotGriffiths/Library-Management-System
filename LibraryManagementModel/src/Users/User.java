/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
/**
 *
 * @author jack-
 */
public abstract class User{
    
    protected String uniqueID;
    protected String password;
    protected String givenName;
    protected String surname;
    
    public User(String uid,String pass,String name, String surname){
        this.uniqueID = uid;
        this.password = pass;
        this.givenName = name;
        this.surname = surname;
    }
    
    public void setUniqueID(String ID)
    {
        this.uniqueID = ID;
    }
    
    public String getUniqueID(){
        return uniqueID;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getName(){
        String name = givenName + " " + surname;
        return name;
    }
    
}
