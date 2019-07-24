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
public class ResourceTest {
    
    public ResourceTest() {
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
     * Test of Resource method, of class Resource.
     */
    @Test
    public void testResource() {
        System.out.println("Resource");
        String name = "";
        String type = "";
        int category = 0;
        int loanLength = 0;
        int ratingTotal = 0;
        int ratingCount = 0;
        Resource instance = new Resource();
        instance.Resource(name, type, category, loanLength, ratingTotal, ratingCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
