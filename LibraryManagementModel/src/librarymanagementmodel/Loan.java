/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementmodel;

/**
 *
 * @author jack-
 */
public class Loan {
    public Resource resource;
    public String LoanStatus;
    public String DateLoaned;
    public int LoanLength;
    
    public void Loan(Resource resource,String loanStatus, String dateLoaned,int loanLength){
        this.resource = resource;
        this.LoanStatus = loanStatus;
        this.DateLoaned = dateLoaned;
        this.LoanLength = loanLength;
    }
    
    public void DeactivateLoan(String loanStatus){
        this.LoanStatus = loanStatus;
    }
}
