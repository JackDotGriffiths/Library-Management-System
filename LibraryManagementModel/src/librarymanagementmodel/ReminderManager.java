/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementmodel;
import java.util.*;
/**
 *
 * @author jack-
 */
public class ReminderManager {
    
    public List<Reminder> reminders = new ArrayList<Reminder>();
    
    private static ReminderManager single_instance = null;
    
    public static ReminderManager getInstance()
    {
        if (single_instance == null) 
            single_instance = new ReminderManager(); 
  
        return single_instance;
    }
    
    public void AddReminder(Reminder reminder){
    reminders.add(reminder);
    }
}
