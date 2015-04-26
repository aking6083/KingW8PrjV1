/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import domain.*;

/**
 *
 * @author root
 */
public interface IBookSvc {
    public Book create(Book b);
    public Book add(Book b) throws Exception;
    public Book update(Book b);
    public Book delete(Book b);
    
}
