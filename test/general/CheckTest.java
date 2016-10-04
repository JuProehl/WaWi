/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marc Czolbe
 */
public class CheckTest {
    
    public CheckTest() {
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
     * Test of istNegativ method, of class Check.
     */
    @Test
    public void testIstNegativ_int() {
        System.out.println("istNegativ");
        int wert = 0;
        Boolean expResult = null;
        Boolean result = Check.istNegativ(wert);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of istNegativ method, of class Check.
     */
    @Test
    public void testIstNegativ_ArrayList() {
        System.out.println("istNegativ");
        ArrayList<Integer> list = null;
        Boolean expResult = null;
        Boolean result = Check.istNegativ(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
