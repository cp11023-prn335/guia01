/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC24
 */
public class UtilitiesTest {
    
    public UtilitiesTest() {
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
     * Test of getResume method, of class Utilities.
     */
    @Test
    public void testGetResume() {
        System.out.println("getResume");
        String texto = "";
        Utilities instance = new Utilities();
        String expResult = "";
        String result = instance.getResume(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capitalizar method, of class Utilities.
     */
    @Test
    public void testCapitalizar() {
        System.out.println("capitalizar");
        String texto = "";
        Utilities instance = new Utilities();
        String expResult = "";
        String result = instance.capitalizar(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarCoincidencias method, of class Utilities.
     */
    @Test
    public void testContarCoincidencias() {
        System.out.println("contarCoincidencias");
        String frase = "";
        String texto = "";
        Utilities instance = new Utilities();
        int expResult = 0;
        int result = instance.contarCoincidencias(frase, texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
