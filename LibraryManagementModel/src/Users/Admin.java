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
public class Admin {
    
    public void CreateResource(String InputName, String InputType, int Category, String LoanLength, int RatingTotal, int RatingCount){
        Resource resource = new Resource();
        resource.NewResource(InputName, InputType, Category, LoanLength, RatingTotal, RatingCount);
    }
}
