/**
 * @param BookTest.java
 * @version 1
 * @author Adam King and the fine folks at NetBeans
 */
package domain;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

/**
 * @author Adam King
 *
 */
public class BookTest {

	public static final String CLASS_NAME = "domain.Book";
	
	public void testname() throws Exception {
		fail();
	}
	
	/**
         * // I am interested what the references are in the comments i.e. @link
	 * Test method for {@link domain.Book#setAuthors(java.lang.String)}.
	 */
	@Test
	public void testSetAuthors() {
		Book instance = new Book();
		LinkedList<String>actuals = new LinkedList<>();
		LinkedList<String>authors = new LinkedList<>();
          
		authors.add("Adam King");
		authors.add("Warren Rachelle");
                authors.add("Hong Zhu");
		
                instance.setAuthors(authors);
                actuals = instance.getAuthors();
		
		assertEquals(authors,actuals);
		
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link domain.Book#getAuthors()}.
	 */
	@Test
	public void testGetAuthors() {
		Book instance = new Book();
		LinkedList<String>expResult = new LinkedList<>();
		LinkedList<String>actuals = new LinkedList<>();

		//instance.setAuthors("Adam King");
		//instance.setAuthors("Warren Rachelle");
		
		expResult.add("Adam King");
		expResult.add("Warren Rachelle");
		instance.setAuthors(expResult);
                //Get the linked list
                actuals = instance.getAuthors();
		
		assertEquals(expResult, actuals);
		
	}

	/**
	 * Test method for {@link domain.Book#setIsbn(java.lang.String)}.
	 */
	@Test
	public void testSetIsbn() {
		Book instance = new Book();
		instance.setIsbn("3231979");
		String expResult = "3231979";
		String actual = instance.getIsbn();
		assertEquals(expResult, actual);
	}

	/**
	 * Test method for {@link domain.Book#getIsbn()}.
	 */
	@Test
	public void testGetIsbn() {
		Book instance = new Book("Adam King","Code How I Do","3231979");
		String expResult = "3231979";
		String actual = instance.getIsbn();
		assertEquals(expResult, actual);
	}

	/**
	 * Test method for {@link domain.Book#setTitle(java.lang.String)}.
	 */
	@Test
	public void testSetTitle() {
		Book instance = new Book();
		instance.setTitle("Code How I Do");
		String expResult = "Code How I Do";
		String actual = instance.getTitle();
		assertEquals(expResult, actual);
	}
	

	/**
	 * Test method for {@link domain.Book#getTitle()}.
	 */
	@Test
	public void testGetTitle() {
		Book instance = new Book("Adam King","Code How I Do","3231979");
		String expResult = "Code How I Do";
		String actual = instance.getTitle();
		assertEquals(expResult, actual);
	}

	/**
	 * Test method for {@link domain.Book#Book()}.
	 */
	@Test
	public void testBook() {
		Object instance = new Book();
		if (instance instanceof Book) {
			 assertTrue(true);
		}
		else 
			assertFalse(false);
		
	}

	/**
	 * Test method for {@link domain.Book#validate()}.
	 */
	@Test
	public void testValidate() {
		Book instance = new Book();
		boolean expResult = false;
		boolean actual = instance.validate();
		LinkedList<String> z_authors = new LinkedList<>();
                
                
                assertEquals(expResult,actual);
		
		//test true
		z_authors.add("Adam King");
		z_authors.add("Warren Rachelle");
		z_authors.add("Hong Zhu");
                instance.setAuthors(z_authors);
            
                instance.setTitle("Code How I Do");
		instance.setIsbn("3231979");
		actual = instance.validate();
		assertEquals(true, actual);
		
                //test false
		instance.clearList();
                actual = instance.validate();
                
                assertEquals(false, actual);
	}

	/**
	 * Test method for {@link domain.Book#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		Object obj = new Book();
                Book instance = (Book) obj;
		boolean expResult = true;
		boolean actual = instance.equals(obj);
		assertEquals(expResult,actual);
                //test false;
                
                instance = new Book();
                
                LinkedList<String> z_authors = new LinkedList<>();
                z_authors.add("Adam King");
		z_authors.add("Warren Rachelle");
		z_authors.add("Hong Zhu");

                instance.setAuthors(z_authors);
                
                expResult = false;
                actual = instance.equals(obj);
                assertEquals(expResult,actual);
                
	}

	/**
	 * Test method for {@link domain.Book#isInteger(java.lang.String)}.
	 */
	@Test
	public void testIsInteger() {
		String intString = "abcd123";
		boolean expResult = false;
		boolean actual = Book.isInteger(intString);
		assertEquals(expResult, actual);
		
		intString = "3231979";
		expResult = true;
		actual = Book.isInteger(intString);
		assertEquals(expResult, actual);
		
	}

    /**
     * Test of toString method, of class Book.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Book.typeStr stringType = null;
        Book instance = new Book();
        String expResult = "";
        String result = instance.toString(stringType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearList method, of class Book.
     */
    @Test
    public void testClearList() {
        System.out.println("clearList");
        Book instance = new Book();
        instance.clearList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Book.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Book instance = new Book();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
