/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Service.AuthenticationSVCSocketImpl;
import Service.Factory;
import Service.IAuthenticationSVC;
import domain.Login;
import java.io.*;
import java.net.*;

/**
 *
 * @author root
 */
public class AuthenticationMgr {
    
    public boolean authenticate(Login myLogin) throws Exception
    {
        Factory factory = new Factory();
        IAuthenticationSVC authSvc = factory.getSocketAuthService();
        boolean isValid = authSvc.authenticate(myLogin);
        return isValid;
    }
}
