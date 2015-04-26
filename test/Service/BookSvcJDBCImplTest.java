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
public class BookSvcJDBCImplTest {
    
    public BookSvcJDBCImplTest() {
    }

    /**
     * Test of create method, of class BookSvcJDBCImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Book b = null;
        BookSvcJDBCImpl instance = new BookSvcJDBCImpl();
        Book expResult = null;
        Book result = instance.create(b);
        assertNotSame(expResult, result);
        
        
    }

    /**
     * Test of add method, of class BookSvcJDBCImpl.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Book b = null;
        BookSvcJDBCImpl instance = new BookSvcJDBCImpl();
        Book expResult = null;
        Book result = instance.add(b);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of update method, of class BookSvcJDBCImpl.
     */
    @Test
    public void testUpdate() {
        /*System.out.println("update");
        Book b = null;
        BookSvcJDBCImpl instance = new BookSvcJDBCImpl();
        Book expResult = null;
        Book result = instance.update(b);
        //assertEquals(expResult, result);
        */
    }

    /**
     * Test of delete method, of class BookSvcJDBCImpl.
     */
    @Test
    public void testDelete() {
        /*System.out.println("delete");
        Book b = null;
        BookSvcJDBCImpl instance = new BookSvcJDBCImpl();
        Book expResult = null;
        Book result = instance.delete(b);
        //assertEquals(expResult, result);
    */    
    }
    
}
