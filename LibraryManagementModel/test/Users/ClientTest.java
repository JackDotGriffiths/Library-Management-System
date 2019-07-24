/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.util.List;
import librarymanagementmodel.Loan;
import librarymanagementmodel.Reminder;
import librarymanagementmodel.Resource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jack-
 */
public class ClientTest {
    
    public ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of BorrowItem method, of class Client.
     */
    @Test
    public void testBorrowItem() {
        System.out.println("BorrowItem");
        Resource resource = null;
        Client instance = new Client();
        instance.BorrowItem(resource);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReturnItem method, of class Client.
     */
    @Test
    public void testReturnItem() {
        System.out.println("ReturnItem");
        Loan loan = null;
        Client instance = new Client();
        instance.ReturnItem(loan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ViewReminders method, of class Client.
     */
    @Test
    public void testViewReminders() {
        System.out.println("ViewReminders");
        Client instance = new Client();
        List<Reminder> expResult = null;
        List<Reminder> result = instance.ViewReminders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RequestResource method, of class Client.
     */
    @Test
    public void testRequestResource() {
        System.out.println("RequestResource");
        String text = "";
        Client instance = new Client();
        instance.RequestResource(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RateResource method, of class Client.
     */
    @Test
    public void testRateResource() {
        System.out.println("RateResource");
        Resource resource = null;
        int Rating = 0;
        Client instance = new Client();
        instance.RateResource(resource, Rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RequestExtension method, of class Client.
     */
    @Test
    public void testRequestExtension() {
        System.out.println("RequestExtension");
        Loan loan = null;
        int extensionLength = 0;
        Client instance = new Client();
        instance.RequestExtension(loan, extensionLength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListLoans method, of class Client.
     */
    @Test
    public void testListLoans() {
        System.out.println("ListLoans");
        Client instance = new Client();
        List<Loan> expResult = null;
        List<Loan> result = instance.ListLoans();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
