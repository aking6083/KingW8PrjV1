/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import java.sql.*;
import javax.sql.*;
import domain.*;

/**
 *
 * @author root
 */
public class BookSvcJDBCImpl implements IBookSvc {
    
    
    private String connString = "jdbc:mysql://192.168.254.12:3306/test?"
            + "user=root&password=jammin";
    private Connection getConnection() throws Exception 
    {
        //Get the connection to database
        return DriverManager.getConnection(connString);
    }

    @Override
    public Book create(Book b) {
        b = new Book();
       
        return b;
    }

    @Override
    public Book add(Book b) throws Exception {
        Connection conn = this.getConnection();
        try
        {
            
            String authors = b.toString(Book.typeStr.AUTHOR);
            String title = b.toString(Book.typeStr.TITLE);
            String isbn = b.toString(Book.typeStr.ISBN);
            System.out.println(authors);
            String sql = "INSERT INTO books (AuthName,title,ISBN) VALUES (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,authors);
            pstmt.setString(2, title);
            pstmt.setString(3, isbn);
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
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
