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
public class Resource {
    public String Name;
    public String Type;
    public int Category;
    public String LoanLength;
    public int RatingTotal;
    public int RatingCount;
    
    
    public void NewResource(String name, String type, int category, String loanLength,int ratingTotal, int ratingCount){
        this.Name = name;
        this.Type = type;
        this.Category = category;
        this.LoanLength = loanLength;
        this.RatingTotal = ratingTotal;
        this.RatingCount = ratingCount;
    }
}
