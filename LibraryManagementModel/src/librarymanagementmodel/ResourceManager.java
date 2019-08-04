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
    
}
