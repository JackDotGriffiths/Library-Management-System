/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementprogram;
import librarymanagementmodel.*;
import Controller.Controller;
import Users.*;
import View.Login;

/**
 *
 * @author jack-
 */
public class LibraryManagementProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UserManager userManager = UserManager.getInstance();
        ResourceManager resman = ResourceManager.getInstance();
        
        Controller cont = new Controller();
        
        Login login = new Login(cont);
        
        login.setVisible(true);
      
        
        Admin admin = new Admin(userManager.generateUserId('A'), "admin0", "Mike", "Wazowski");
        
        userManager.NewUser(admin);
        
        Client client1 = new Client(userManager.generateUserId('C'), "client1", "Jane", "Fonda");
        Client client2 = new Client(userManager.generateUserId('C'), "client2", "Buzz", "Lightyear");      
        Client client3 = new Client(userManager.generateUserId('C'), "client3", "Stephen", "Fry");       
        Client client4 = new Client(userManager.generateUserId('C'), "client4", "Jack", "Griffiths");      
        Client client5 = new Client(userManager.generateUserId('C'), "client5", "John", "Smith");
        
        userManager.NewUser(client1);
        userManager.NewUser(client2);
        userManager.NewUser(client3);
        userManager.NewUser(client4);
        userManager.NewUser(client5);

        Resource res1 = new Resource("Object Orientated Programming", "Book", 0, 14, 0, 0);
        Resource res2 = new Resource("Beginners guide to Python", "DVD", 0, 180, 0, 0);
        Resource res3 = new Resource("Meditations", "Book", 1, 180, 0, 0);
        Resource res4 = new Resource("Beyond Good and Evil", "Book", 1, 14, 0, 0);
        Resource res5 = new Resource("The Bible - The Movie", "DVD",2,0,0,0);
        Resource res6 = new Resource("OCR Religious Studies 2019", "Book", 2, 14, 0, 0);
        Resource res7 = new Resource("Guns,Germs and Steel","Book",3,14,0,0);
        Resource res8 = new Resource("The Tipping Point", "Book", 3, 180, 0, 0);
        Resource res9 = new Resource("The Art of Communication - Audiobook", "CD", 4, 14, 0, 0);
        Resource res10 = new Resource("First you Write a Sentence", "Book", 4, 180, 0, 0);
        Resource res11 = new Resource("The Science Book", "Book", 5, 14, 0, 0);
        Resource res12 = new Resource("The Human Superorganism", "Book", 5, 180, 0, 0);
        Resource res13 = new Resource("The Inevitable", "Book", 6, 14, 0, 0);
        Resource res14 = new Resource("A Brief History of Time","Book",6,180,0,0);
        Resource res15 = new Resource("The Art Business", "Book", 7, 180, 0, 0);
        Resource res16 = new Resource("What Good Are the Arts?", "Book", 7, 14, 0, 0);
        Resource res17 = new Resource("1984", "Book", 8, 180, 0, 0);
        Resource res18 = new Resource("Moby Dick","Book",8,14,0,0);
        Resource res19 = new Resource("SPQR", "Book", 9, 180, 0, 0);
        Resource res20 = new Resource("The Rise and Falls of the Third Reich", "Book", 9, 14, 0, 0);
        
        resman.AddResource(res1);
        resman.AddResource(res2);
        resman.AddResource(res3);
        resman.AddResource(res4);
        resman.AddResource(res5);
        resman.AddResource(res6);
        resman.AddResource(res7);
        resman.AddResource(res8);
        resman.AddResource(res9);
        resman.AddResource(res10);
        resman.AddResource(res11);
        resman.AddResource(res12);
        resman.AddResource(res13);
        resman.AddResource(res14);
        resman.AddResource(res15);
        resman.AddResource(res16);
        resman.AddResource(res17);
        resman.AddResource(res18);
        resman.AddResource(res19);
        resman.AddResource(res20);
        
    }
    
}
