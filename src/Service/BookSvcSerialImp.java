/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import domain.*;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//make the text fields visible.
/**
 *
 * @author root
 */
public class BookSvcSerialImp implements IBookSvc, Serializable
{

    @Override
    public Book create(Book b) {
        

//Create the book
        
        b = new Book();
       
        return b;
        
    }

    @Override
    public Book add(Book b) {
    
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("thisFile"));
            output.writeObject(b);
            output.flush();
            output.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BookSvcSerialImp.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    return b;
    }

    @Override
    public Book update(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book delete(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
