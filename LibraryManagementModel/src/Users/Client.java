/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import java.time.LocalDate;
import librarymanagementmodel.*;
import java.util.*;

/**
 *
 * @author jack-
 */
public class Client extends User{
    
    
    public Client(String uid,String pass,String name, String surname){
        super(uid,pass,name,surname);
    }
    
    private List<Loan> ActiveLoans = new ArrayList<Loan>();
    private List<ExtensionRequest> ActiveExtensionRequests = new ArrayList<ExtensionRequest>();
    
}
