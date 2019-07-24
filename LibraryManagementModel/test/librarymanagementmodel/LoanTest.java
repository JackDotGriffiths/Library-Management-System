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
public class LoanTest {
    
    public LoanTest() {
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
     * Test of Loan method, of class Loan.
     */
    @Test
    public void testLoan() {
        System.out.println("Loan");
        Resource resource = null;
        String loanStatus = "";
        String dateLoaned = "";
        int loanLength = 0;
        Loan instance = new Loan();
        instance.Loan(resource, loanStatus, dateLoaned, loanLength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeactivateLoan method, of class Loan.
     */
    @Test
    public void testDeactivateLoan() {
        System.out.println("DeactivateLoan");
        String loanStatus = "";
        Loan instance = new Loan();
        instance.DeactivateLoan(loanStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
