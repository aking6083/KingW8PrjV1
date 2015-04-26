/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import domain.Book;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class BookSvcSerialImpTest {
    
    public BookSvcSerialImpTest() {
    }

    /**
     * Test of create method, of class BookSvcSerialImp.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Book b = null;
        BookSvcSerialImp instance = new BookSvcSerialImp();
        Book expResult = null;
        Book result = instance.create(b);
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of add method, of class BookSvcSerialImp.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Book b = null;
        BookSvcSerialImp instance = new BookSvcSerialImp();
        Book expResult = null;
        Book result = instance.add(b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of update method, of class BookSvcSerialImp.
     */
    @Test
    public void testUpdate() {
        
    }

    /**
     * Test of delete method, of class BookSvcSerialImp.
     */
    @Test
    public void testDelete() {
       
    }
    
}
