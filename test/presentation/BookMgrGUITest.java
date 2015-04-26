/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class BookMgrGUITest {
    
    public BookMgrGUITest() {
    }

    /**
     * Test of getBookTitle method, of class BookMgrGUI.
     */
    @Test
    public void testGetBookTitle() {
        System.out.println("getBookTitle");
        BookMgrGUI instance = new BookMgrGUI();
        String expResult = "";
        String result = instance.getBookTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class BookMgrGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BookMgrGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
