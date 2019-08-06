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
    
}
