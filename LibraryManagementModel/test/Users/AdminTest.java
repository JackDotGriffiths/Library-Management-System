/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.util.List;
import librarymanagementmodel.ExtensionRequest;
import librarymanagementmodel.Loan;
import librarymanagementmodel.PurchaseRequest;
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
public class AdminTest {
    
    public AdminTest() {
        
        Admin testAdmin = new Admin();
        testAdmin = "A000","TestPass","TestName","TestSurname";
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
     * Test of CreateResource method, of class Admin.
     */
    @Test
    public void testCreateResource() {
        System.out.println("CreateResource");
        String InputName = "";
        String InputType = "";
        int Category = 0;
        int LoanLength = 0;
        int RatingTotal = 0;
        int RatingCount = 0;
        Admin instance = new Admin();
        instance.CreateResource(InputName, InputType, Category, LoanLength, RatingTotal, RatingCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SendReminder method, of class Admin.
     */
    @Test
    public void testSendReminder() {
        System.out.println("SendReminder");
        Loan loan = null;
        String date = "";
        String text = "";
        Admin instance = new Admin();
        instance.SendReminder(loan, date, text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReadRequests method, of class Admin.
     */
    @Test
    public void testReadRequests() {
        System.out.println("ReadRequests");
        Admin instance = new Admin();
        List<PurchaseRequest> expResult = null;
        List<PurchaseRequest> result = instance.ReadRequests();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRequest method, of class Admin.
     */
    @Test
    public void testAddRequest() {
        System.out.println("addRequest");
        PurchaseRequest request = null;
        Admin instance = new Admin();
        instance.addRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RequestResourceReturn method, of class Admin.
     */
    @Test
    public void testRequestResourceReturn() {
        System.out.println("RequestResourceReturn");
        Loan loan = null;
        String date = "";
        Admin instance = new Admin();
        instance.RequestResourceReturn(loan, date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ApproveExtensionRequest method, of class Admin.
     */
    @Test
    public void testApproveExtensionRequest() {
        System.out.println("ApproveExtensionRequest");
        ExtensionRequest extensionRequest = null;
        Admin instance = new Admin();
        instance.ApproveExtensionRequest(extensionRequest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DenyExtensionRequest method, of class Admin.
     */
    @Test
    public void testDenyExtensionRequest() {
        System.out.println("DenyExtensionRequest");
        ExtensionRequest extensionRequest = null;
        Admin instance = new Admin();
        instance.DenyExtensionRequest(extensionRequest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
