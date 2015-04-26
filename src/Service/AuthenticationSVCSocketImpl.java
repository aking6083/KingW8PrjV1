/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import domain.Login;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author root
 */
public class AuthenticationSVCSocketImpl implements IAuthenticationSVC {
       
    /**
     *
     * @param l
     * @return
     * @throws Exception
     */
    @Override
    public boolean authenticate(Login l)  {
        Socket socket = null;
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        boolean authentic = false;
        
        try 
        {
            socket = new Socket(InetAddress.getLocalHost(),8000);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            out.writeObject(l);
            String isValid = (String) in.readObject();
            if (isValid.equals("true"))
                authentic = true;
        }
        catch (Exception ex)
        {
            System.out.println("Exception" + ex.getMessage());
        }
        finally {
            try {
                in.close();
                out.close();
                socket.close();
            }
            catch (Exception ex) {
                System.out.println("Error " + ex.getMessage());
            }
                
        }
        
   return authentic; 
    }
}
