/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementmodel;
import Users.User;
import java.time.LocalDate;
import java.util.*;
/**
 *
 * @author jack-
 */
public class Reminder {
    public User targetUser;
    public String Type;
    public LocalDate SendDate;
    public String ReminderText;
    
   
    public Reminder(User user,String type,LocalDate sendDate,String text){
        this.targetUser = user;
        this.Type = type;
        this.SendDate = sendDate;
        this.ReminderText = text;
    }
    
    
    
}
