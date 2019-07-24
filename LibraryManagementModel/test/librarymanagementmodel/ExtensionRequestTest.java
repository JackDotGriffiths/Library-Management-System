/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementmodel;

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
public class ExtensionRequestTest {
    
    public ExtensionRequestTest() {
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
     * Test of ExtensionRequest method, of class ExtensionRequest.
     */
    @Test
    public void testExtensionRequest() {
        System.out.println("ExtensionRequest");
        Loan loan = null;
        int extensionLength = 0;
        ExtensionRequest instance = new ExtensionRequest();
        instance.ExtensionRequest(loan, extensionLength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
