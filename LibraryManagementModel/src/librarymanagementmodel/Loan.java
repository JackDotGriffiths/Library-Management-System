/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementmodel;
import Users.*;
import java.time.LocalDate;

/**
 *
 * @author jack-
 */
public class Loan {
    public User user;
    public Resource resource;
    public String LoanStatus;
    public LocalDate DateLoaned;
    public int LoanLength;
    
    public Loan(User user,Resource resource,String loanStatus, LocalDate dateLoaned,int loanLength){
        this.user = user;
        this.resource = resource;
        this.LoanStatus = loanStatus;
        this.DateLoaned = dateLoaned;
        this.LoanLength = loanLength;
    }
}
