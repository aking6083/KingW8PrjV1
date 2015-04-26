/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author root
 */
public class Login implements Serializable {
    private String userName;
    private char [] password;
        
    public void setUserName (String userName)
    { this.userName = userName;}
    
    public String getUserName() 
    { return this.userName;}
    
    public void setPassword(char [] password)
    { this.password = password;}
    
   public char [] getPassword()
   { return this.password; }
   
   public boolean validate() 
   {
       if (this.userName.isEmpty() || this.password.length == 0)
           return false;
       else
           return true;
       
       
   }
   
   
   
}
