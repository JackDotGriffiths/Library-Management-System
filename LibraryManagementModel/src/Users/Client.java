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
public class Client extends User{
    private List<Loan> ActiveLoans = new ArrayList<Loan>();
    private List<ExtensionRequest> ActiveExtensionRequests = new ArrayList<ExtensionRequest>();
    
    public void BorrowItem(Resource resource){
        
    }
    
}
