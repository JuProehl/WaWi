/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import database.DB_Connect;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Marc Czolbe
 */
public class ArtiListTest {
    
    public ArtiListTest() {
    }
    
    static ArtiList instance;
    
    @BeforeClass
    public static void setUpClass() {
        DB_Connect.ConnectOpen();
        instance = new ArtiList();
    }
    
    @AfterClass
    public static void tearDownClass() {
        DB_Connect.ConnectClose();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ArtikelInTabelleAusgeben method, of class ArtiList.
     */
    @Ignore("Test schwierig") @Test
    public void testArtikelInTabelleAusgeben() {
        System.out.println("ArtikelInTabelleAusgeben");
        JTable Table1 = null;
        instance.ArtikelInTabelleAusgeben(Table1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of TabelleHolen method, of class ArtiList.
     */
    @Test
    public void testTabelleHolen() {
        System.out.println("TabelleHolen");
        instance.TabelleHolen();
        assertNotNull(instance.result.isEmpty());
        assertNotNull(instance.result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getANR method, of class ArtiList.
     */
    @Test
    public void testGetANR() {
        System.out.println("getANR");
        int row = 0;
        Integer result = instance.getANR(row);
        assertNotNull(result);
        assertTrue(result > 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBezeichnung method, of class ArtiList.
     */
    @Test
    public void testGetBezeichnung() {
        System.out.println("getBezeichnung");
        int row = 0;
        String result = instance.getBezeichnung(row);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBESTANDSMENGE method, of class ArtiList.
     */
    @Test
    public void testGetBESTANDSMENGE() {
        System.out.println("getBESTANDSMENGE");
        int row = 0;
        Integer result = instance.getBESTANDSMENGE(row);
        assertNotNull(result);
        assertTrue(result >= 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getKrit_Menge method, of class ArtiList.
     */
    @Test
    public void testGetKrit_Menge() {
        System.out.println("getKrit_Menge");
        int row = 0;
        Integer result = instance.getKrit_Menge(row);
        assertNotNull(result);
        assertTrue(result >= 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getF_LNR method, of class ArtiList.
     */
    @Test
    public void testGetF_LNR() {
        System.out.println("getF_LNR");
        int row = 0;
        Integer result = instance.getF_LNR(row);
        assertNotNull(result);
        assertTrue(result >= 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVKPreis method, of class ArtiList.
     */
    @Test
    public void testGetVKPreis() {
        System.out.println("getVKPreis");
        int row = 0;
        double result = instance.getVKPreis(row);
        assertNotNull(result);
        assertTrue(result >= 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
