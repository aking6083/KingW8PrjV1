/*    
    Book.java ~ The Book Class holds String variables of auhtor,isbn, and
                title.
                Class will store multiple author names in a  LinkedList<String> data structure
                
    @author Adam King
    @version 4
*/

package domain;
import java.io.*;
import java.util.*;

public class Book implements Serializable
{
    public enum typeStr {TITLE,AUTHOR,ISBN};
    private LinkedList<String> authors;
    private String isbn;
    private String title;
    
    
    /*     
    @param setAuthors() ~ sets the authors in a linked list.
    
  */
    
    public void setAuthors(LinkedList<String> authors) throws NullPointerException
    {
        try //See if the LinkedList has been made yet 
        {
            this.authors = authors; //Will fail on un-instaniated lists
        }
        catch(NullPointerException npe)
        {
            authors = new LinkedList<String>();
            this.authors = authors;
        }
    }
    
    public LinkedList<String> getAuthors()
    {return this.authors;}
        
    public void setIsbn(String newIsbn)
    {this.isbn = newIsbn;}
        
    public String getIsbn()
    {return this.isbn;}
    
    public void setTitle(String newTitle)
    {this.title = newTitle;}
    
    public String getTitle()
    {return this.title;}
    
    public Book()
    {
       this.title = "";
       this.authors = new LinkedList<>();
       this.isbn = "";
    }
    
    public Book(String author, String title, String isbn)
    {
    	this.authors = new LinkedList<>();
        this.authors.add(author);
    	this.title = title;
    	this.isbn = isbn;
    
    }
    /*     
      @param validate() ~ validates fields for non empty strings and checks that
                          isbn is only integers.
      @return true if all fields are valid.
    */
    
    public String toString(typeStr stringType)
    {
        String strAuthors = "";
        String retString = "";
        switch(stringType)
        {
            case TITLE:
                retString = this.title;
            break;
            
            case AUTHOR:
                ListIterator<String> itr = authors.listIterator();
            while (itr.hasNext())
            {
                strAuthors += itr.next() + " ";
            }
            strAuthors.trim();
            retString = strAuthors;
            break;
            case ISBN:
                retString = this.isbn;
            break;
            
        }
                return retString;
     
    }
    
    public Boolean validate()
    {
        boolean validAuthor = false;
        boolean validTitle = false;
        boolean validIsbn = false;
        
        //Validate the data members
                
        //Validate author is not empty
        
        if (this.authors != null && !this.authors.isEmpty())
            validAuthor = true;
                        
        //Validate title is not empty
        if (this.title != null && !this.title.isEmpty())
            validTitle = true;
        
        //Validate isbn is numbers only
        if ( isInteger(this.isbn))
           validIsbn = true;
                
        //Is everything valid?    
        if (validAuthor && validTitle && validIsbn)
            return true;
        else
            return false;
    }
        
    /*
    
      @param clearList() ~ empty the author linked list
      @return void
    */
    public void clearList()
    {
       this.authors.clear();
    
    }
    
    /*
      @param equals() ~ compares al objects fields returns true if they care 
                        all the same
      @return true if objects are equal
    
    */

    /**
     *
     * @param equals()
     * @return true if all object are equal
     
     */
    
    
    @Override
    public boolean equals(Object obj) 
    {
        boolean returnVal = true;
        
        if (this != obj) 
            returnVal =  false;
        
        if ( ! (obj instanceof Book))
            returnVal = false;
        
        Book tmpBook = (Book) obj; //cast object to a book
        
        if (!tmpBook.title.equals(this.title)) 
            returnVal = false;
        
        if ( ! this.title.equals(tmpBook.title) )
            returnVal = false;
        
        if ( this.authors.equals(tmpBook.getAuthors()) ) {
            returnVal = true;
        }
                
        if ( ! this.isbn.equals(tmpBook.isbn) )
            returnVal = false;
        
        return returnVal;
        
    }
   
    /*
        @param isInteger ~ returns true if passed String input has all integers
        @return ~returns true if all chars in array String are integers    
    */
    
    public static boolean isInteger(String input)
    {
        //I am sooo glad to be able to use OO again instead of loops everywhere!
        try 
        {
            Integer.parseInt(input);
            
        } catch (NumberFormatException e) {
           //Ne message needed
            return  false;
        }
        return true;
    }

}