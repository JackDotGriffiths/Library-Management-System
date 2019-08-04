/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.util.List;
import librarymanagementmodel.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 *
 * @author jack-
 */
public class AdminTest {
    
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
     * Test of CreateResource method, of class Admin.
     */
    @Test
    public void testCreateResource() {
        System.out.println("CreateResource");
        String InputName = "iPad for Dummies";
        String InputType = "Book";
        int Category = 0;
        int LoanLength = 14;
        int RatingTotal = 0;
        int RatingCount = 0;
        Resource instance = new Resource(InputName, InputType, Category, LoanLength, RatingTotal, RatingCount);
        // TODO review the generated test code and remove the default call to fail.
        try{
            assertEquals("Name must be correct",instance.Name,"iPad for Dummies");
            assertEquals("Type must be correct",instance.Type,"Book");
            assertThat("Categorty must be correct",instance.Category,is(0));
            assertThat("LoanLength must be correct",instance.LoanLength,is(14));
            assertThat("RatingTotal must be 0",instance.RatingTotal,is(0));
            assertThat("RatingCount must be 0",instance.RatingCount,is(0));
        }catch(Exception e){
            fail("ERROR : " + e);
        }
        //Ensures instance is created as expected. Data validation will occur through GUI.
    }

    /**
     * Test of SendReminder method, of class Admin.
     */
    @Test
    public void testSendReminder() {
        System.out.println("SendReminder");
        Loan loan = null;
        String date = "25-05-2019";
        String text = "Please return your copy of iPad for Dummies.";
        Reminder instance = new Reminder();
        instance.Reminder(loan, date, text);
        // TODO review the generated test code and remove the default call to fail.
        try{
            //Unable to generate a Loan and Hence unable to test. 
            assertEquals("Date must be correct",instance.SendDate,"25-05-2019");
            assertEquals("Text must be correct",instance.ReminderText,"Please return your copy of iPad for Dummies.");    
        }catch(Exception e){
            fail("ERROR: " + e);
        }   
    }

    /**
     * Test of ReadRequests method, of class Admin.
     */
    @Test
    public void testReadRequests() {
        System.out.println("ReadRequests");
        Admin instance = new Admin("A0001", "admin0", "Mike", "Wazowski");
        List<PurchaseRequest> expResult = null;
        List<PurchaseRequest> result = instance.ReadRequests();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Unable to test.");
    }

    /**
     * Test of addRequest method, of class Admin.
     */
    @Test
    public void testAddRequest() {
        System.out.println("addRequest");
        PurchaseRequest request = null;
        Admin instance = new Admin("A0001", "admin0", "Mike", "Wazowski");
        instance.addRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("Unable to test.");
    }

    /**
     * Test of RequestResourceReturn method, of class Admin.
     */
    @Test
    public void testRequestResourceReturn() {
        System.out.println("RequestResourceReturn");
        Loan loan = null;
        String date = "";
        Admin instance = new Admin("A0001", "admin0", "Mike", "Wazowski");
        instance.RequestResourceReturn(loan, date);
        // TODO review the generated test code and remove the default call to fail.
        fail("Unable to test.");
    }

    /**
     * Test of ApproveExtensionRequest method, of class Admin.
     */
    @Test
    public void testApproveExtensionRequest() {
        System.out.println("ApproveExtensionRequest");
        ExtensionRequest extensionRequest = null;
        Admin instance = new Admin("A0001", "admin0", "Mike", "Wazowski");
        instance.ApproveExtensionRequest(extensionRequest);
        // TODO review the generated test code and remove the default call to fail.
        fail("Unable to test.");
    }

    /**
     * Test of DenyExtensionRequest method, of class Admin.
     */
    @Test
    public void testDenyExtensionRequest() {
        System.out.println("DenyExtensionRequest");
        ExtensionRequest extensionRequest = null;
        Admin instance = new Admin("A0001", "admin0", "Mike", "Wazowski");
        instance.DenyExtensionRequest(extensionRequest);
        // TODO review the generated test code and remove the default call to fail.
        fail("Unable to test.");
    }
    
}
