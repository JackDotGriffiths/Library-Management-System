/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementmodel;
import java.util.ArrayList;

/**
 *
 * @author jack-
 */
public class ResourceManager {
    private static ResourceManager single_instance = null;
    
    private final ArrayList<Resource> Resources = new ArrayList<>();
   
    
    public static ResourceManager getInstance()
    {
        if (single_instance == null) 
            single_instance = new ResourceManager(); 
        return single_instance;
    }
    
    public void AddResource(Resource resource){
        Resources.add(resource);
    }
    
    public ArrayList<Resource> getAllResources(){
        return Resources;
    }
    
    public ArrayList<Resource> getAvailableResources(){ 
        ArrayList<Resource> availableResources = new ArrayList<>();
        for(Resource resource : getAllResources()){
            if(resource.Status == "Available"){
                availableResources.add(resource);
            }
        }
        return availableResources;
    }
    
    public String returnCategory(int DewyDecimal)
    {
        String Category = "";
        switch(DewyDecimal){
            case(0):
                Category = "000 – Computer science, information & general works";
                break;
            case(1):
                Category = "100 – Philosophy and psychology";
                break;
            case(2) :
                Category = "200 – Religion";
                break;
            case(3) :
                Category = "300 – Social sciences";
                break;
            case(4) :
                Category = "400 – Language";
                break;
            case(5) :
                Category = "500 – Pure Science ";
                break;
             case(6) :
                Category = "600 – Technology ";
                break;
             case(7) :
                Category = "700 – Arts & recreation ";
                break;              
             case(8) :
                Category = "800 – Literature ";
                break;      
             case(9) :
                Category = "900 – History & geography ";
                break;  
        }
        return Category;
    } 
    public String returnLoanLength(int loanDays){
        String LoanLengthString = "";
        switch(loanDays){
            case(0) :
                LoanLengthString = "Unavailable for Loan";
                break;
            case(14) :
                LoanLengthString = "2 Weeks";
                break;
            case(180) :
                LoanLengthString = "6 Months";
                break;     
        }
        return LoanLengthString;
    }
    
    public void updateStatus(Resource resourceToUpdate,String newStatus){
        resourceToUpdate.Status = newStatus;
        int count = 0;
        for(Resource resource : getAllResources()){
            if(resource == resourceToUpdate){
                Resources.set(count, resourceToUpdate);
            }
            count ++;
        }
    }
    
}
