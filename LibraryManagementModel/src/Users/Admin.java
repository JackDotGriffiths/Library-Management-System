/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import librarymanagementmodel.*;
import java.util.*;

/**
 *
 * @author jack-
 */
public class Admin extends User{
    
    
    public Admin(String uid,String pass,String name, String surname){
        super(uid,pass,name,surname);
    }
    
  
   
    
    public void ApproveExtensionRequest(ExtensionRequest extensionRequest){
        try{
            extensionRequest.Status = "Approved";
            extensionRequest.loan.resource.LoanLength = extensionRequest.loan.resource.LoanLength + extensionRequest.ExtensionLength;
        }
       catch (Exception e){
           System.out.println("ERROR: " + e);
       }
    }
    
    public void DenyExtensionRequest(ExtensionRequest extensionRequest){
        try{
            extensionRequest.Status = "Rejected";
        }
        catch (Exception e){
           System.out.println("ERROR: " + e);
       }
    }
    
}
