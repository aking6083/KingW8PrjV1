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
public class IBookSvcTest {
    
    public IBookSvcTest() {
    }

    /**
     * Test of create method, of class IBookSvc.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Book b = null;
        IBookSvc instance = new IBookSvcImpl();
        Book expResult = null;
        Book result = instance.create(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class IBookSvc.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Book b = null;
        IBookSvc instance = new IBookSvcImpl();
        Book expResult = null;
        Book result = instance.add(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class IBookSvc.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Book b = null;
        IBookSvc instance = new IBookSvcImpl();
        Book expResult = null;
        Book result = instance.update(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class IBookSvc.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Book b = null;
        IBookSvc instance = new IBookSvcImpl();
        Book expResult = null;
        Book result = instance.delete(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IBookSvcImpl implements IBookSvc {

        public Book create(Book b) {
            return null;
        }

        public Book add(Book b) throws Exception {
            return null;
        }

        public Book update(Book b) {
            return null;
        }

        public Book delete(Book b) {
            return null;
        }
    }
    
}
