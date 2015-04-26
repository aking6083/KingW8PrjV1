/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import presentation.*;
/**
 *
 * @author root
 */
public class main {
    
    public static void main(String[] args)
    {
        //Launch the login GUI
        LibraryLoginGUI myLogin = new LibraryLoginGUI();
        
        
        BookMgrGUI myGui = new BookMgrGUI();
        myLogin.setVisible(true);
        //myGui.setVisible(true);
    }
    
    
}
