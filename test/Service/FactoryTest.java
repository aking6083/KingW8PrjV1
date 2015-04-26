/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class FactoryTest {
    
    public FactoryTest() {
    }

    /**
     * Test of getSerialBookSvc method, of class Factory.
     */
    @Test
    public void testGetSerialBookSvc() {
        System.out.println("getSerialBookSvc");
        Factory instance = new Factory();
        BookSvcSerialImp expResult = null;
        BookSvcSerialImp result = instance.getSerialBookSvc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getJDBCBookService method, of class Factory.
     */
    @Test
    public void testGetJDBCBookService() {
        System.out.println("getJDBCBookService");
        Factory instance = new Factory();
        BookSvcJDBCImpl expResult = null;
        BookSvcJDBCImpl result = instance.getJDBCBookService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
